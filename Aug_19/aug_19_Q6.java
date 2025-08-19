//6. Create a class Demo where you declare a local variable with the same name as an instance variable. Use this keyword to differentiate.

package Aug_19;
import java.util.*;
class Demo{
    String name;

    Demo(String name){
        this.name=name;
    }

    void dispaly(){
        String name="Abhishek";
        System.out.println(name);
    }

}
public class aug_19_Q6 {
    public static void main(String[] args) {
        Demo d1= new Demo("Anurag");
        d1.dispaly();
    }
}
