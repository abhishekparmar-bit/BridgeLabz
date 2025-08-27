package Aug_27;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a date (dd-MM-yyyy): ");
        String inputDate = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(inputDate, formatter);


        System.out.println("Enter a date (yyyy-MM-dd): ");
        String Date = sc.nextLine();
        DateTimeFormatter formatt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dates = LocalDate.parse(Date, formatt);


        System.out.println("Enter a date (EEE, MMM dd, yyyy): ");
        String Dates = sc.nextLine();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy", Locale.ENGLISH);
        LocalDate datess = LocalDate.parse(Dates, format);
        System.out.println(date);
        System.out.println(dates);
        System.out.println(datess);

    }
}