import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate meus25 = LocalDate.of(2022, Month.JUNE, 30);
        
        Integer anos = meus25.getYear() - hoje.getYear();
        System.out.println(anos);

        Period periodo = Period.between(hoje, meus25);
        System.out.println(periodo.getDays());

        LocalDate meus30 = meus25.plusYears(5);
        System.out.println(meus30);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(df.format(meus30));

        DateTimeFormatter dfTime = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(dfTime.format(agora));

        LocalTime intervalo = LocalTime.of(15, 30);
        System.out.println(intervalo);

    }
}
