package Assignment;
import java.util.*;
public class Q5 {
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+"); // split by spaces
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String longestWord = findLongestWord(sentence);

        System.out.println("Longest word: " + longestWord);

        sc.close();
    }
}
