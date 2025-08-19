package Aug_19;
import java.util.*;
class Carss{
    String model;
    int year;



    Carss(String model,int year){
        this.model=model;
        this.year=year;
    }
    void local(){
        int car_no=1234;
        System.out.println("Car No Is:"+car_no);
    }
}
public class aug_19_Q3 {
    public static void main(String[] args) {
        Carss c1=new Carss("bmw",2023);
        System.out.println("Car No Is:"+Carss.car_no);
//        Above statement will give an error
//        java: cannot find symbol
//        symbol:   variable car_no
//        location: class Aug_19.Carss

    }
}
