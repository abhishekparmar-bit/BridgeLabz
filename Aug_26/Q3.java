package Aug_26;

import java.util.Scanner;

public class Q3 {
    static char[] myToCharArray(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

    // Helper method to print char array
    static void printCharArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Call user-defined method
        char[] customChars = myToCharArray(str);

        // Call built-in method
        char[] builtInChars = str.toCharArray();

        // Display results
        System.out.println("\nUsing user-defined myToCharArray(): ");
        printCharArray(customChars);

        System.out.println("Using built-in toCharArray(): ");
        printCharArray(builtInChars);
    }
}

