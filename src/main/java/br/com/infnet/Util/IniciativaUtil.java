package br.com.infnet.Util;
import br.com.infnet.Personagem;
public class IniciativaUtil {
    public int calcularIniciativa(Personagem p1, Personagem p2){
        if (p1.getIniciativa() > p2.getIniciativa()){
            return -1;
        }else if(p2.getIniciativa() > p1.getIniciativa()){
            return 0;
        }else{
            return 3;
        }
    }
}
