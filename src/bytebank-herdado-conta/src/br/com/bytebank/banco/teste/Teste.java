package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class Teste {   
    public static void main(String[] args) throws SaldoInsuficienteException {

        /*int[] idades = new int[5];

        for (int i =0; i < idades.length; i++) {
            idades[i] = i * i;
        }

        for (int i =0; i < idades.length; i++) {
            System.out.println(idades[i]);
        } */

        // Testando Arrays

        GuardadorDeContas guardador = new GuardadorDeContas();
        Conta cc = new ContaCorrente(22, 11);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(0);
        System.out.println(ref.getNumero());
    }
}