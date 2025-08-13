package Java;

import java.util.*;

public class swap2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int a= sc.nextInt();
        int b=sc.nextInt();
        a=a-b;
        b=b+a;
        a=b-a;
        System.out.println("After the swap : "+a+b);

    }
}
