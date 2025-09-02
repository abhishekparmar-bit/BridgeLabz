package Assignment;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;

        // Iterate through characters
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) { // Only check letters
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        // Output
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}
