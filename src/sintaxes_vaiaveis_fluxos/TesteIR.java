package sintaxes_vaiaveis_fluxos;

public class TesteIR {
    public static void main(String[] args) {
        double salario = 3300.0;
        if (salario < 1900.0) {
            System.out.println("Não há dedução");
        } else if (salario <= 2900.0) {
            System.out.println("IR: 7,5% - Dedução: R$ 142,00");
        } else if (salario <= 3751.0) {
            System.out.println("IR: 15% - Dedução: R$ 350,00");
        } else if (salario <= 4664.0) {
            System.out.println("IR: 22,5% - Dedução - R$ 636,00");
        }
    }
}
