//Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array

package Aug_20;

import java.util.Scanner;

public class java_array_L1_Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        int arr[][]=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int one[]=new int[row*column];
        int index=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                one[index]=arr[i][j];
                index++;
            }
        }
        for(int i=0;i<row*column;i++){
            System.out.println(one[i]);
        }

    }
}

