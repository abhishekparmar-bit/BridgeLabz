package Aug_25;
import java.util.Scanner;
public class Q3 {
    static void count_vowels(String a){
        int count=0;
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        count_vowels(a);

    }
}
