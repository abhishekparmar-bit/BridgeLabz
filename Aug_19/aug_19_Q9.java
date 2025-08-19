//9. Create a class Account with instance variables: accountHolder, balance. Use default values. Print them without setting any values.
package Aug_19;
import java.util.*;
class Account{
    String accountHolder = "Abhishek";
    int balance=1000;

    void display(){
        System.out.println(accountHolder);
        System.out.println(balance);
    }
}

public class aug_19_Q9 {
    public static void main(String[] args) {
        Account a1=new Account();
        a1.display();
    }
}
