package Aug_26;

public class Q4 {
    public static void main(String[] args) {
        String str = null;  // str is not pointing to any object

        try {
            // Trying to call a method on null reference
            System.out.println("Length of string: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException!");
            e.printStackTrace();  // Prints the error details
        }

        System.out.println("Program continues after handling exception...");
    }
}
