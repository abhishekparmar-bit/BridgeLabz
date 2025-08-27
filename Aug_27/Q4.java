package Aug_27;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a date (dd-MM-yyyy): ");
        String inputDate = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(inputDate, formatter);
        System.out.println("Enter a date (dd-MM-yyyy): ");
        String Date = sc.nextLine();
        DateTimeFormatter formatt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dates = LocalDate.parse(inputDate, formatt);
        System.out.println(date.isAfter(dates));
        System.out.println(date.isBefore(dates));
        System.out.println(date.isEqual(dates));

    }
}
