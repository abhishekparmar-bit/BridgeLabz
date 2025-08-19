package Aug_19;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
class Car{
    String model;
    int year;

    static  int number_of_cars=0;

    Car(String model,int year){
        this.model=model;
        this.year=year;
        number_of_cars++;
    }


    void display(){
        System.out.println("Car model:"+model);
        System.out.println("Car year:"+year);
    }
}

public class aug_19_Q2 {
    public static  void main(String[] args){
        Car c1=new Car("Fortuner",2020);
        Car c2=new Car("Rolls Royce",2021);
        c1.display();
        c2.display();
        System.out.println("total cars:"+Car.number_of_cars);
    }
}
