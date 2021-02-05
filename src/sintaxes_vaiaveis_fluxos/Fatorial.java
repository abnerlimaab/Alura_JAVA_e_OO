package sintaxes_vaiaveis_fluxos;

public class Fatorial {
    public static void main(String[] args) {
        for (int numeroAtual = 1; numeroAtual <= 10; numeroAtual++) {
            int fatorial = 1;
            for (int fator = 1; fator <= numeroAtual; fator++) {
                fatorial *= fator;
            }
            System.out.println(numeroAtual + "! = " + fatorial);
        }
    }
}
