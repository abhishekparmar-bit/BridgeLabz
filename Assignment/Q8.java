package Assignment;
import java.util.Scanner;
public class Q8 {
        public static int compareStrings(String s1, String s2) {
            int len1 = s1.length();
            int len2 = s2.length();
            int minLen = Math.min(len1, len2);

            // Compare character by character
            for (int i = 0; i < minLen; i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return s1.charAt(i) - s2.charAt(i);
                }
            }

            // If all characters match till minLen, shorter string comes first
            return len1 - len2;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first string: ");
            String str1 = sc.nextLine();

            System.out.print("Enter second string: ");
            String str2 = sc.nextLine();

            int result = compareStrings(str1, str2);

            if (result < 0) {
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
            } else if (result > 0) {
                System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order");
            } else {
                System.out.println("Both strings are equal");
            }

            sc.close();
        }
}
