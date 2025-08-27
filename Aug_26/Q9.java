package Aug_26;
import java.util.Scanner;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        // Using user-defined method
        String customUpper =(input);

        // Using built-in method
        String builtInUpper = input.toUpperCase();

        // Display results
        System.out.println("\nUsing user-defined method: " + customUpper);
        System.out.println("Using built-in method:    " + builtInUpper);

        // Compare
        if (customUpper.equals(builtInUpper)) {
            System.out.println("\n✅ Both results match!");
        } else {
            System.out.println("\n❌ Results do not match!");
        }
    }
}
