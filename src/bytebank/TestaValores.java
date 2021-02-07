package bytebank;

public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 342226);
        System.out.println(conta.getAgencia());

        Conta conta2 = new Conta(1337, 342227);
    }
}
