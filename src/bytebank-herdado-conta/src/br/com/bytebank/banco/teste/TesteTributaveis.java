package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 3333);
        cc.deposita(100);

        SeguroDeVida seguroDeVida = new SeguroDeVida();

        CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
        calculadorDeImposto.registra(cc);
        calculadorDeImposto.registra(seguroDeVida);

        System.out.println(calculadorDeImposto.getTotaçImposto());

    }
}
