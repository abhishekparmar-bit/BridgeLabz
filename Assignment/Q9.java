package Assignment;
import java.util.*;
public class Q9 {
    public static char findMostFrequentChar(String str) {
        int[] freq = new int[256]; // ASCII characters
        int maxFreq = 0;
        char result = ' ';

        for (char ch : str.toCharArray()) {
            freq[ch]++;
            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                result = ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char mostFrequent = findMostFrequentChar(input);

        System.out.println("Most Frequent Character: '" + mostFrequent + "'");

        sc.close();
    }
}
