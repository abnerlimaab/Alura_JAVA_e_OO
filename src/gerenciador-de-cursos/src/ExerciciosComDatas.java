import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ExerciciosComDatas {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data atual: " + dataAtual);

        LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY, 25);
        Period periodo = Period.between(dataAtual, dataFutura);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data atual formatada: " + df.format(dataAtual));
    }
}
