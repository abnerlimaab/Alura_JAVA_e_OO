package bytebank;

public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDaMarcela.titular);
        contaDaMarcela.titular.nome = "Marcela";
    }
}
