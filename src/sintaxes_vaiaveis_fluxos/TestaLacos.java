package sintaxes_vaiaveis_fluxos;

public class TestaLacos {
    public static void main(String[] args) {
        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            System.out.println("Tabuada de " + multiplicador);
            for (int fator = 0; fator <= 10; fator++) {
                System.out.print(multiplicador * fator + " ");
            }
            System.out.println();
        }
    }
}
