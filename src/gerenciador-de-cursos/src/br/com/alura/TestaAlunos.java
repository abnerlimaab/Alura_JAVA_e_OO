package br.com.alura;

import java.util.*;

public class TestaAlunos {
    public static void main(String[] args) {
        Collection<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppot");
        alunos.add("Sérgio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");
        alunos.add("Mauricio Aniche");

        System.out.println(alunos.size());

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        alunos.forEach(aluno -> {System.out.println(aluno);});

        System.out.println(alunos.contains("Sérgio Lopes"));
        alunos.remove("Sérgio Lopes");

        System.out.println(alunos);

        List<String> alunosEmLista = new ArrayList<>(alunos);
        Collections.sort(alunosEmLista);
        System.out.println(alunosEmLista);
    }
}
