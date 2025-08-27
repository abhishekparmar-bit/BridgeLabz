package Aug_27;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import java.util.Scanner;
public class week_day {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a date (dd-MM-yyyy): ");
        String inputDate = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(inputDate, formatter);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("Day of the Week: " + dayOfWeek);
    }
}
