package Aug_25;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int count=0;
        for (int i=0; i<a.length();i++){
            char c = a.charAt(i);
            if(Character.isDigit(c)){
                count++;
            }
        }
        if(count==a.length()){
            System.out.println("Contain");
        }
        else {
            System.out.println("Not");
        }
    }
}
