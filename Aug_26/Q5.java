package Aug_26;

public class Q5 {
    public static void main(String[] args) {
        String str = "Hello";

        try {
            // String length = 5 (valid indices: 0 to 4)
            System.out.println("Character at index 10: " + str.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught a StringIndexOutOfBoundsException!");
            e.printStackTrace();  // Print details
        }

        try {
            // Negative index
            System.out.println("Character at index -1: " + str.charAt(-1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("\nCaught exception for negative index!");
            e.printStackTrace();
        }

        System.out.println("\nProgram continues after handling exceptions...");
    }
}
