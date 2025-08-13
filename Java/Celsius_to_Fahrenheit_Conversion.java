package Java;

import java.util.*;
public class Celsius_to_Fahrenheit_Conversion {
    public static  void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int celsius= sc.nextInt();
        int fahrenheit=(celsius*9/5)+32;
        System.out.println("the temerature in fahrenheit is: "+fahrenheit);
    }
}
