package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Account matthewsAccount = new Account("Arto's account", 1000.00);
        Account mySwissAccount = new Account("Arto's account in Switzerland", 0);
        
        System.out.println("Initial state");
        System.out.println(matthewsAccount);
        System.out.println(mySwissAccount);
        
        matthewsAccount.withdraw(100);
        System.out.println("The balance of Matthew's account is now: " + matthewsAccount.balance());
        mySwissAccount.deposit(100);
        System.out.println("The balance of my other account is now: " + mySwissAccount.balance());
        
        System.out.println("End state");
        System.out.println(matthewsAccount);
        System.out.println(mySwissAccount);
    }
}