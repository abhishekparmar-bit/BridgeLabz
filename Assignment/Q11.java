package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Q11 {
    static void isAnagram(String str1, String str2) {
        // Remove spaces and make lowercase
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        // If lengths differ, not an anagram
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            return;
        }


        // Convert to char array and sort
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        isAnagram(str1, str2);
    }
}
