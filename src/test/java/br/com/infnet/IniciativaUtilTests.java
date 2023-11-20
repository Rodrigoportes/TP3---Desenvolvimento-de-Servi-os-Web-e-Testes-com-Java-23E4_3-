package br.com.infnet;

import br.com.infnet.Util.IniciativaUtil;
import br.com.infnet.exception.IniciativaInvalidaException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IniciativaUtilTests {
    @Test
    @DisplayName("Personagem 1 deve genhar")
    public void teste1(){
        Personagem personagem1 = new Personagem();
        Personagem personagem2 = new Personagem();
        personagem2.setIniciativa(30);
        personagem1.setIniciativa(40);
        IniciativaUtil iniciativaUtil = new IniciativaUtil();
        int resultado = iniciativaUtil.calcularIniciativa(personagem1, personagem2);
        assertEquals(-1,resultado);
    }

    @Test
    @DisplayName("Deve retornar exception iniciativa menor que zero")
    public void teste4(){
        Personagem personagem1 = new Personagem();
        assertThrows(IniciativaInvalidaException.class, () ->{
            personagem1.setIniciativa(-40);
        });


        IniciativaUtil iniciativaUtil = new IniciativaUtil();
    }
}
