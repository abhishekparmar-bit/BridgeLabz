package Aug_27;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a date (dd-MM-yyyy): ");
        String inputDate = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(inputDate, formatter);
        LocalDate currentDate = LocalDate.now();
        LocalDate plusDays=date.plusDays(7);
        LocalDate plusMonths=plusDays.plusMonths(3);
        LocalDate plusYears=plusMonths.plusYears(1);
        LocalDate minusWeeks=plusYears.minusWeeks(3);
//        System.out.println(currentDate);
        System.out.println(minusWeeks);

    }
}
