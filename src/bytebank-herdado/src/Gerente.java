public class Gerente extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do Gerente");
        return super.getSalario();
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

}
