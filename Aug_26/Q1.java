package Aug_26;


import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        boolean flag=false;
        for(int  i=0;i<a.length();i++){
            if(a.charAt(i)==b.charAt(i)){
                flag=true;
            }
            else{
                flag=false;
                break;
            }
        }
        if(flag&&a.equals(b)){
            System.out.println(flag);
        }
        else {
            System.out.println(flag);
        }
    }
}
