package Aug_25;
import java.util.*;
public class Q11 {
    static String compress(String str) {
        StringBuilder sb = new StringBuilder();

        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            // if next char is same, increase count
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                // append char and its count
                sb.append(str.charAt(i)).append(count);
                count = 1; // reset for next character
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = compress(input);
        System.out.println("Compressed: " + result);
    }
}
