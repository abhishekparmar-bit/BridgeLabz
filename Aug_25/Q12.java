package Aug_25;

import java.util.Arrays;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(Arrays.toString(split(s)));
    }

    static String [] split(String s){
        String []arr=new String [s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=String.valueOf(s.charAt(i));
        }
        return arr;
    }


}
