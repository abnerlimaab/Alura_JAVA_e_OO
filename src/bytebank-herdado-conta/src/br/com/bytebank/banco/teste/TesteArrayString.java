package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteArrayString {   
    public static void main(String[] args) throws SaldoInsuficienteException {
        System.out.println("Funcionou");

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}