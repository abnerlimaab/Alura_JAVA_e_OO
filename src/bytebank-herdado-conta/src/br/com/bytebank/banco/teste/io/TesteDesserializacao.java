package br.com.bytebank.banco.teste.io;

import java.io.*;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteDesserializacao {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
        ContaCorrente cc = (ContaCorrente) ois.readObject();
        ois.close();
        System.out.println(cc.getSaldo());
        System.out.println(cc.getTitular().getNome());        
    }
}