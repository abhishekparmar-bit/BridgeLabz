package Aug_25;

import java.util.Scanner;

public class Q7 {
    static void check_palindrome(String str){
        int start=0;
        int end=str.length()-1;
        boolean check=true;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                check=false;
                break;
            }
            start++;
            end--;
        }
        if(check){
            System.out.println("IsPalindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        check_palindrome(str);
    }
}
