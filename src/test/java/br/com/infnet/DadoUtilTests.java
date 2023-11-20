package br.com.infnet;
import br.com.infnet.Util.DadoUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DadoUtilTests {
    @Test
    @DisplayName("DadoD10 deve retornar valores menores que 10")
    public void test01() {
        DadoUtil dadoUtil = new DadoUtil();
        for (int i = 0; i < 1000; i++) {
            int valorDoDado = dadoUtil.rollD10();
            assertTrue(valorDoDado <= 10);
        }
    }
}