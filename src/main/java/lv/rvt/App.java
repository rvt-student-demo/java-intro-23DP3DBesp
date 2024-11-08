package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Product product1 = new Product("Banana",1.1,13);
        Product product2 = new Product("Apple",0.7,21);
        Product product3 = new Product("Banana",0.3,44);

        product1.printProduct();
        product2.printProduct();
        product3.printProduct();

    }
    
}