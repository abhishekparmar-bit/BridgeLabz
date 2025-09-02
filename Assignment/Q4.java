package Assignment;


import java.util.*;

public class Q4 {
    public static String removeDuplicates(String str) {
        // Use LinkedHashSet to maintain order and uniqueness
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        // Build new string without duplicates
        StringBuilder sb = new StringBuilder();
        for (char ch : set) {
            sb.append(ch);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = removeDuplicates(input);

        System.out.println("String after removing duplicates: " + result);

        sc.close();
    }
}
