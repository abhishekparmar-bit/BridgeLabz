package Java;
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


