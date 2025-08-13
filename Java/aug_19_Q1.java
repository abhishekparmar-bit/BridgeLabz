package Java;
import java.util.*;
//1. Create a class Car with instance variables model and year. Create two car objects and display their details.
class Car{
    String model;
    int year;

    Car(String model,int year){
        this.model=model;
        this.year=year;
    }

    void display(){
        System.out.println("Car model:"+model);
        System.out.println("Car year:"+year);
    }
}
public class aug_19_Q1 {
    public  static void main(String[] args){
        Car c1=new Car("Fortune",2020);
        Car c2=new Car("Rolls Royce",2025);

        c1.display();
        c2.display();
    }
}
