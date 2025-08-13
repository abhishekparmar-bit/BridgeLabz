package Java;

import  java.util.*;
public class power_calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        double ans = Math.pow(base,exponent);
        System.out.println("The ans is : " + ans);

    }
}
