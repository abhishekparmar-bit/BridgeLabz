package Aug_25;
import java.util.Scanner;

public class Q5 {
    static void length(String a){
        int count =0;
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(c>='a'||c<='z'||c>='A'||c<='Z'||c==' '){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        length(a);
    }
}
