package Assignment;
import java.util.*;
public class Q6 {
    public static int countOccurrences(String str, String subStr) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(subStr, index)) != -1) {
            count++;
            index = index + subStr.length(); // move past the found substring
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String str = sc.nextLine();

        System.out.print("Enter the substring to search: ");
        String subStr = sc.nextLine();

        int result = countOccurrences(str, subStr);

        System.out.println("The substring \"" + subStr + "\" occurs " + result + " times in the string.");

        sc.close();
    }
}
