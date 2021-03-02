import java.util.*;

public class Teste {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        // Lambda
        palavras.sort(Comparator.comparing(s -> s.length()));
        // Method Reference
        palavras.sort(Comparator.comparing(String::length));
        palavras.forEach(System.out::println);

        palavras.sort(String.CASE_INSENSITIVE_ORDER);
        palavras.forEach(System.out::println);
    }
}
