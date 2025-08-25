package Aug_25;

import java.util.Scanner;

public class Q8 {
    static void non_repeating(String a){
//
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            boolean repeat=true;
            for(int j=0;j<a.length();j++){
                char b=a.charAt(j);
                if(i!=j&&c==b){
                    repeat=false;
                    break;
                }

            }
            if(repeat) {
                System.out.println(c);
                break;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        non_repeating(a);
    }
}
