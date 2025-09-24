import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDateTime dateTime1 = LocalDateTime.of(2023, 12, 1, 10, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(2023, 12, 10, 15, 45);

        long daysBetween = ChronoUnit.DAYS.between(dateTime1, dateTime2);
        System.out.println(daysBetween);
    }
}
