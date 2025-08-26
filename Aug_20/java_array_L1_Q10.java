//Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...

package Aug_20;

import java.util.Scanner;

public class java_array_L1_Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String arr[]=new String[num+1];
        for(int i=0;i<=num;i++){
            if(i%3==0 && i%5==0 && i!=0){
                arr[i]="FizzBuzz";
            }
           else if(i%3==0 && i!=0){
                arr[i]="Fizz";
            }
           else if(i%5==0 && i!=0){
                arr[i]="Buzz";
            }
            else{
                arr[i]=String.valueOf(i);
            }
        }

        for(int i=0;i<=num;i++){
            System.out.println("position of number is :"+arr[i]);
        }

    }
}
