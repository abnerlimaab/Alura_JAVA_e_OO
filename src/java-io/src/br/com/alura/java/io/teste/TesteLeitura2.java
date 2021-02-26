package br.com.alura.java.io.teste;

import java.io.*;
import java.util.*;

public class TesteLeitura2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            //System.out.println(linha);

            //String[] valores = linha.split(",");
            //System.out.println(Arrays.toString(valores));

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");
            String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            System.out.format(new Locale("pt", "br") , "%s - %04d-%08d, %20s: %5.2f %n", tipoConta, agencia, numero, titular, saldo);

            linhaScanner.close();
        }

        scanner.close();
    }
}
