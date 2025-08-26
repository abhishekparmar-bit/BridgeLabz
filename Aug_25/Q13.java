package Aug_25;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String res=a.replaceAll("\\d","");
        System.out.println(res);
        }
    }

