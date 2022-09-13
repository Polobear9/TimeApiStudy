
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        System.out.println(date);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        LocalDateTime zonedateTime = LocalDateTime.now();
        System.out.println(zonedateTime);

        System.out.println(dateTime.minusDays(1));
        System.out.println(date.minusYears(1).getYear());
        System.out.println(date.plusYears(1).toString().substring(0, 4));

        LocalDate date_Tomorrow = LocalDate.of(2022, 9, 30);
        System.out.println(date_Tomorrow);

        System.out.println(date.isAfter(date_Tomorrow));
        System.out.println(date.isBefore(date_Tomorrow));

        Period d2 = Period.between(date, date_Tomorrow);
        System.out.println(d2);
        System.out.println(d2.getDays());

        Duration duration = Duration.ofMinutes(30);
        System.out.println(duration);
        System.out.println(duration.get(ChronoUnit.SECONDS));
        System.out.println(ChronoUnit.DAYS.between(date,date_Tomorrow));
    }
}