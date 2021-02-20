package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
    public static void main(String[] args) {
        int[] idades = new int[5];
        String[] nomes = new String[5];

        int idade = 29;
        Integer idadeRef = Integer.valueOf(29); //Wrapper
        int valor = idadeRef.intValue();
        System.out.println(idadeRef.doubleValue());

       /*  String s = args[0];
        Integer numero = Integer.valueOf(s);
        System.out.println(numero); */

        List<Integer> numeros = new ArrayList<Integer>();
        //numeros.add(idade); tipo primitivo não deveria ser adicionado ao ArrayList. -> "Autoboxing"
        numeros.add(idadeRef);

    }
}
