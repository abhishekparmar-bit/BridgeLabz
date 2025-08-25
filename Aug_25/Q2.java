package Aug_25;

import java.util.Scanner;

public class Q2 {
    static void convert(String a){
        String res="";
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if (c >= 'a' && c <='z') {
                c=(char)(c-32);
            }
            res+=c;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a=sc.nextLine();
        convert(a);
    }
}
