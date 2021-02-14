package br.com.bytebank.banco.teste;

public class TesteString {
    public static void main(String[] args) {

        String vazio = "  Alura   ";
        String outroVazio = vazio.trim();
        System.out.println(vazio.contains("Alu"));
        System.out.println(outroVazio);


        String nome = "Alura";

        System.out.println(nome.length());
        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }

        //String sub = nome.substring(1);
        //System.out.println(sub);

        //int pos = nome.indexOf("ur");
        //System.out.println(pos);

        //char c = nome.charAt(2);
        //System.out.println(c);

        // String outra = nome.replace("A", "a");
        // String outra = nome.toLowerCase();
        //System.out.println(nome);
    }
}
