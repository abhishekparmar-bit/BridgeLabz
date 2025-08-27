package Aug_27;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ZonedDateTime date=ZonedDateTime.now();
        ZoneId id=ZoneId.of("America/Los_Angeles");
        ZonedDateTime dates=ZonedDateTime.now(id);
        System.out.println(dates);
    }
}
