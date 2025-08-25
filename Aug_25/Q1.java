package Aug_25;
import java.util.*;

public class Q1 {
    static void string_are_equal(String a,String b){
        if(a.equals(b)){
            System.out.println("Case sensitive equal");
        }
        else{
            System.out.println("Not equal");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a= sc.nextLine();
        String b=sc.nextLine();
        string_are_equal(a,b);
    }
}
