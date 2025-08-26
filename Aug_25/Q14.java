package Aug_25;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            System.out.println((int)c);
        }
    }
}
