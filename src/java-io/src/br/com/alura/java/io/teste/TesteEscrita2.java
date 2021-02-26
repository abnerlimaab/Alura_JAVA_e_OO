package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscrita2 {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod      ");
        bw.newLine();
        bw.write("ash ash ash");

        bw.close();
    }
}
