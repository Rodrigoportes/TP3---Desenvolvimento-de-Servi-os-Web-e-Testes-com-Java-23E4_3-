package br.com.infnet.Util;

import java.util.Random;



public class DadoUtil {

    private int rollDice(int bound){
        return new Random().nextInt(bound) + 1;
    }

    public int rollD10(){
        return rollDice(10);
    }
}
