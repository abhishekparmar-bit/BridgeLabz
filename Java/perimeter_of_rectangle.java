package Java;

import java.util.*;
public class perimeter_of_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        int area = 2*(length+width);
        System.out.println("The perimeter of rectangle is : "+area);

    }
}
