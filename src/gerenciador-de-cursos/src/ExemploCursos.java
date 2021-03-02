import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}

public class ExemploCursos {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        // cursos.sort(Comparator.comparing(c -> c.getAlunos()));
        cursos.sort(Comparator.comparing(Curso::getAlunos));
        cursos.forEach(c -> System.out.println(c.getNome()));

        System.out.println("Apenas cursos com mais de 100 alunos");
        cursos.stream().filter(c -> c.getAlunos() > 100).forEach(c -> System.out.println(c.getNome()));

        System.out.println("Retornando o número de alunos matriculados nos cursos filtrados");
        cursos.stream().filter(c -> c.getAlunos() > 100).map(Curso::getAlunos).forEach(System.out::println);

        int totalAlunos = cursos.stream().filter(c -> c.getAlunos() > 100).mapToInt(Curso::getAlunos).sum();
        System.out.println("Alunos matriculados: " + totalAlunos);

        System.out.println("Apenas cursos com mais de 50 alunos matriculados");
        cursos.stream().filter(c -> c.getAlunos() > 50).forEach(c -> System.out.println(c.getNome()));

        Stream<String> nomes = cursos.stream().map(Curso::getNome);
        System.out.println("Nomes dos cursos:");
        nomes.forEach(System.out::println);

        cursos.stream().filter(c -> c.getAlunos() >= 100).findAny().ifPresent(c -> System.out.println(c.getNome()));

        //Utilizando a classe Optional pode-se evitar o excessivo tratamento de null pointer além dos métodos da classe.
        OptionalDouble media = cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(Curso::getAlunos).average();

        //Salvando os valores filtrados em uma nova variável
        List<Curso> filteredCursos = cursos.stream().filter(c -> c.getAlunos() >= 100).collect(Collectors.toList());
        filteredCursos.forEach(c -> c.getNome());

        //Criando um map a partir da List cursos por meio da Classe Collectors e em seguida imprime seus valores.
        cursos.stream().collect(Collectors.toMap(Curso::getNome, Curso::getAlunos)).forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));

        //Pegando o primeiro elemento de uma Strem de cursos filtrando apenas aqueles em que há mais de 50 alunos matriculados.
        cursos.stream().filter(c -> c.getAlunos() > 50).findFirst().ifPresent(c -> System.out.println("O primeiro curso encontrado foi: " + c.getNome()));
    }
}
