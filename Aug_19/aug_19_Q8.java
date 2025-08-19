//8. Add a static block in a class to initialize a static variable. Print its value from the main() method.

package Aug_19;
import java.util.*;
class Game{
    static int price;

    static{
        price=200;
    }
}

public class aug_19_Q8 {
    public static void main(String[] args) {
        System.out.println(Game.price);
    }
}


