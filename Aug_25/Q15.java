package Aug_25;
import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a= sc.nextLine();
        StringBuilder  sb= new StringBuilder();
        boolean flag=true;
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);

            if(c>='a'&&c<='z'&&flag){
                sb.append((char)(c-32));
                flag=false;

            }
            else if(c==' '){
                flag=true;
                sb.append(c);
            }
            else{
                sb.append(c);

            }

        }
        System.out.println(sb);
    }
}
