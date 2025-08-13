package Java;

import java.util.Scanner;

public class Calcutate_SimpleI_nterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();
        int si = (principal * rate * time) / 100;
        System.out.println("The Simple Interest is : " + si);
    }
}
