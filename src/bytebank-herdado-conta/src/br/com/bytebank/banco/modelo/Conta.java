package br.com.bytebank.banco.modelo;

/**
 * Classe representa a moldura de uma conta
 * 
 * @author Abner Lima
 * 
 */

public abstract class Conta extends Object implements Comparable<Conta> {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    private static int total;

    /**
     * Construtor para inicializar o objeto Conta a partir da agência e número
     * 
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero) {
        Conta.total++;
        //System.out.println("O total de contas é: " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100.0;
        //System.out.println("Estou criando uma conta");
    }

    public abstract void deposita(double valor);

    /**
     * Valor precisa ser maior do que o saldo
     * 
     * @param valor
     * @throws SaldoInsuficienteException
     */
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

    @Override
    public boolean equals(Object ref) {
        Conta outra = (Conta) ref;
        if (this.agencia != outra.agencia) {
            return false;
        }
        if (this.numero != outra.numero) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Conta outra) {
        return Double.compare(this.saldo, outra.saldo);
    }

    @Override
    public String toString() {
        return "Número: " + getNumero() + ", Agência: " + getAgencia() + ", Saldo: " + getSaldo();
    }
}
