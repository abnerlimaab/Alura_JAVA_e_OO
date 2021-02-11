public class CalculadorDeImposto {

    public double totalImposto;

    public void registra(Tributavel t) {
        double valor = t.getValorImposto();
        this.totalImposto =+ valor;
    }

    public double getTotaçImposto() {
        return totalImposto;
    }
}
