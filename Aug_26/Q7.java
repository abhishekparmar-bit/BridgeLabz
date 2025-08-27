package Aug_26;

public class Q7 {
    public static void main(String[] args) {
        String str1 = "123";      // valid number
        String str2 = "abc123";   // invalid number

        try {
            // Valid case
            int num1 = Integer.parseInt(str1);
            System.out.println("Converted number (str1): " + num1);

            // Invalid case
            int num2 = Integer.parseInt(str2); // This will throw NumberFormatException
            System.out.println("Converted number (str2): " + num2);

        } catch (NumberFormatException e) {
            System.out.println("Caught a NumberFormatException!");
            e.printStackTrace();
        }

        System.out.println("Program continues after handling exception...");
    }
}
