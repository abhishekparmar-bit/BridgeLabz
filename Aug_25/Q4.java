package Aug_25;
import java.util.Scanner;
public class Q4 {
    static  void replace_space(String a){

             String res = a.replace(" ","-");


        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a= sc.nextLine();
        replace_space(a);

    }
}
