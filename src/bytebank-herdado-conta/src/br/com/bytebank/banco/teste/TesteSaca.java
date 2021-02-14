package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteSaca {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(123, 321);
        cc.deposita(200);
        try {
            cc.saca(210);
        } catch (SaldoInsuficienteException ex) {
            System.out.println(ex.getMessage()  );
        }
        System.out.println(cc.getSaldo());
    }
}
