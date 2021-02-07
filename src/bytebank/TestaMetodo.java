package bytebank;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(50);
        System.out.println(contaDoPaulo.saldo);
        boolean conseguiuSacar = contaDoPaulo.saca(20);
        System.out.println(contaDoPaulo.saldo);
        System.out.println(conseguiuSacar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);
        boolean sucessoTransferencia = contaDaMarcela.trasfere(300, contaDoPaulo);
        if (sucessoTransferencia) {
            System.out.println("Transferência feita com sucesso");
            System.out.println("Conta da Marcela: " + contaDaMarcela.saldo);
            System.out.println("Conta do Paulo: " + contaDoPaulo.saldo);
        } else {
            System.out.println("Falha ao transferir.");
        }
    }
}
