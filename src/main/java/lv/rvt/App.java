package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )

    {
        Account denissAccount = new Account("Deniss account", 100.00);
        
        System.out.println("Initial state");
        System.out.println(denissAccount);
        
        denissAccount.deposit(20);
        System.out.println("The balance of Mikhail's account is now: " + denissAccount.balance());
        
        System.out.println("End state");
    }
}