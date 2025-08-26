package Aug_25;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(c>='a'&&c<='z'){
                sb.append((char)(c-32));
            }
            else if(c>='A'&&c<='Z'){
                sb.append((char)(c+32));
            }
            else{
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
