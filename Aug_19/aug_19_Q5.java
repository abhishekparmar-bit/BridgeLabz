//5. Write a program where you modify a static variable using one object, and access it from another object. Show how it reflects the change.

package Aug_19;
import java.util.*;
class Man{
    String name;
    int age;

    static int population=0;

    Man(String name,int age){
        this.name=name;
        this.age=age;
       population++;
    }
    void display(){
        System.out.println(population);
    }
}
public class aug_19_Q5 {
    public static void main(String[] args) {
        Man m1=new Man("King",185);
        Man m2=new Man("Lord",190);
        m2.display();
        m1.population=20;
        System.out.println(m2.population);


    }
}
