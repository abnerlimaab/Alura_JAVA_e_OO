package br.com.alura.java.io.teste;

import java.io.*;

public class TestePrintWriter {
    public static void main(String[] args) throws IOException {

        //BufferedWriter ps = new BufferedWriter(new FileWriter("lorem2.txt"));
        //PrintStream ps = new PrintStream("lorem2.txt");
        PrintWriter ps = new PrintWriter("lorem2.txt", "UTF-8");

        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.println("ash ash ash");

        ps.close();
    }
}
