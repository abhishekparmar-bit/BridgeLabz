package Java;

import java.util.*;

public class Volume_of_cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int radius = sc.nextInt();
        double volume = 3.14 * radius * radius * height;
        System.out.println("The volume of cylinder is : " + volume);

    }
}
