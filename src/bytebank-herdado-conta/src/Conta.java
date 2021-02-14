public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    private static int total;

    public Conta(int agencia, int numero) {
        Conta.total++;
        //System.out.println("O total de contas é: " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100.0;
        //System.out.println("Estou criando uma conta");
    }

    public abstract void deposita(double valor);

    public void saca(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor a sacar: " + valor);
        } 
        this.saldo -= valor;
    }

    public void trasfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int novoNumero) {
        if (novoNumero <= 0) { 
            System.out.println("Não pode número menor ou igual a zero");
            return;
        }
        this.numero = novoNumero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Não pode número menor ou igual a zero");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return total;
    }
}
