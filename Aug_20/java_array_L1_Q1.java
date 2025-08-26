//Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.

package Aug_20;

import java.util.Scanner;

public class java_array_L1_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<10;i++){
            if(arr[i]>=18){
                System.out.println("Can Vote");
            }
            else{
                System.out.println("Can't Vote");
            }
        }
    }
}
