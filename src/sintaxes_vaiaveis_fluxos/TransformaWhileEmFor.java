package sintaxes_vaiaveis_fluxos;

public class TransformaWhileEmFor {
    public static void main(String[] args) {
        int contador = 0;
        while (contador <= 10) {
            System.out.println(contador);
            contador++;
        }

        for (contador = 0; contador <= 10; contador++) {
            System.out.println(contador);
        }
    }
}
