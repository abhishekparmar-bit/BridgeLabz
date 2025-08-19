//7. Create a final variable inside a class. Try changing its value later. What error do you get?

package Aug_19;
import java.util.*;
class Fan{
    String name;
    final int total=0;

    Fan(String name,int total){
        this.name=name;
        this.total=total;
    }
}
public class aug_19_Q7 {
    public static void main(String[] args) {
        Fan f1 = new Fan("AMAR", 50);
        System.out.println(f1.total);
//        giver error java: cannot assign a value to final variable total
    }
}
