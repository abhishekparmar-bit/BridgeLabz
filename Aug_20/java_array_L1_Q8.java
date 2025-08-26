//Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors

package Aug_20;

import java.util.Scanner;

public class java_array_L1_Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int maxfactor=10;
        int arr[]=new int[maxfactor];
        int index=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                if(index==maxfactor){
                    maxfactor*=2;
                    int temp[]=new int[maxfactor];
                    for(int j=0;j<arr.length;j++){
                        temp[j]=arr[j];
                    }
                    arr=temp;
                }
                arr[index]=i;
                index++;
            }
        }

        for(int i=0;i<index;i++){
            System.out.println(arr[i]+" ");
        }

    }
}
