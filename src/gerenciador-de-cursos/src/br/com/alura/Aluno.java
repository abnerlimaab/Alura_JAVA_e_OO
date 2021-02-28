package br.com.alura;

public class Aluno {
    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatriculo) {
        if (nome == null) throw new NullPointerException("Nome não pode ser null");
        this.nome = nome;
        this.numeroMatricula = numeroMatriculo;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public String toString() {
        return "[Aluno: " + this.nome + ", Matrícula: " + this.numeroMatricula + "]";
    }

    @Override
    public boolean equals(Object obj) {
        Aluno outrAluno = (Aluno) obj;
        return this.nome.equals(outrAluno.nome);
    }

    //Sempre que reescrever equals
    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }
}
