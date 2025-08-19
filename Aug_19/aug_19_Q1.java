package Aug_19;
import java.util.*;
//1. Create a class Car with instance variables model and year. Create two car objects and display their details.
class Cars{
    String model;
    int year;

    Cars(String model,int year){
        this.model=model;
        this.year=year;
    }

    void display(){
        System.out.println("Car model:"+model);
        System.out.println("Car year:"+year);
    }
}

public class aug_19_Q1 {
    public static  void main(String[] args){
        Cars c1=new Cars("Fortuner",2020);
        Cars c2=new Cars("Rolls Royce",2021);
        c1.display();
        c2.display();
    }

}
