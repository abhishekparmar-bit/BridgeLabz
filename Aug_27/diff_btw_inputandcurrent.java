package Aug_27;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class diff_btw_inputandcurrent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a date (dd-MM-yyyy): ");
        String inputDate = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(inputDate, formatter);
        LocalDate currentDate = LocalDate.now();
        long daysBetween = ChronoUnit.DAYS.between(date, currentDate);
        System.out.println("Days between input date and current date: " + daysBetween);
    }
}
