package Aug_25;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Q9 {
    static void reverse(String a){
        String[] words = a.split(" "); // split into words
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString(); // reverse each word
            result.append(reversed).append(" "); // add back with space
        }

        System.out.println(result.toString().trim());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        reverse(a);
    }
}
