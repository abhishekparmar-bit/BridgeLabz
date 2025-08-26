//Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers

package Aug_20;


import java.util.Scanner;

public class java_array_L1_Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int i=0;
        int sum=0;
        while(true){
            arr[i]=sc.nextInt();
            if(i==10){
                break;
            }
            if(arr[i]<=0){
                break;
            }
            i++;
        }
        for(int j=0;j<i;j++){
            sum+=arr[j];
        }
        System.out.println("Total Sum is : "+sum);
    }
}
