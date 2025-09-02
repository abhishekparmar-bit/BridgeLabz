package Assignment;
import java.util.Scanner;
public class Q10 {


        public static String removeChar(String str, char ch) {
            StringBuilder result = new StringBuilder();

            for (char c : str.toCharArray()) {
                if (c != ch) {
                    result.append(c);
                }
            }

            return result.toString();
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            System.out.print("Enter the character to remove: ");
            char ch = sc.next().charAt(0); // take first character

            String modified = removeChar(input, ch);

            System.out.println("Modified String: " + modified);

            sc.close();
        }
    }

