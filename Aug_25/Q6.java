package Aug_25;
import java.util.*;
public class Q6 {
    static void count(String a){
        StringTokenizer s=new StringTokenizer(a);
        int count=0;
        while(s.hasMoreTokens()){
            s.nextToken();
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a=sc.nextLine();
        count(a);

    }
}
