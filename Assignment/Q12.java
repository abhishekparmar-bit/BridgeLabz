package Assignment;
import java.util.*;
public class Q12 {
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split("\\s+"); // split by spaces
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.equals(oldWord)) {
                result.append(newWord).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }

        return result.toString().trim(); // remove last space
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter the word to replace: ");
        String oldWord = sc.next();

        System.out.print("Enter the new word: ");
        String newWord = sc.next();

        String modified = replaceWord(sentence, oldWord, newWord);

        System.out.println("Modified sentence: " + modified);

        sc.close();
    }
}
