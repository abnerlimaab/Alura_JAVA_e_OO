package bytebank;

public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        paulo.setNome("Paulo Oliveira");
        conta.setTitular(paulo);

        System.out.println(conta.getTitular().getNome());
        conta.getTitular().setProfissao("Programador");
    }
}
