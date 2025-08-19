//4. Create a class Student with name (String) and marks (int). Use a constructor to initialize values. Create two objects and print their data.


package Aug_19;
import java.util.*;

class Student{
    String name;
    int marks;

    Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
    void display(){
        System.out.println("Student name:"+name);
        System.out.println("Student marks:"+marks);
    }

}
public class aug_19_Q4 {
    public static void main(String[] args) {
        Student s1=new Student("Abhishek",100);
        Student s2=new Student("Anurag",100);

        s1.display();
        s2.display();
    }
}
