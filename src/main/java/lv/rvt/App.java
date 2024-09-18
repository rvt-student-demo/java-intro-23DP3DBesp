package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // double floating = 0.42;
        // boolean irTrueOrFalse = true;
        // Scanner scanner =  new Scanner(System.in);
        // String valueAsString = scanner.nextLine();
        // int value = Integer.valueOf(valueAsString);
        // value = value + 20
        // System.out.printLn(value);
        // boolean boolValue = Boolean.valueOf(scanner.nextLine());

        // int calculationWithParentheses = (1+1) + 3 * (2+5);
        // System.out.println(calculationWithParentheses);

        // int calculationWithoutParentheses = 1+1 + 3 * 2+5;
        // System.out.println(calculationWithoutParentheses);

        // double first = 3.0;
        // int second = 2;
        // System.out.println(first/second); // prints 1.5 (Jā bus first int, tad prints 1)
        Scanner scanner = new Scanner(System.in);
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
    
        System.out.println(first + "+" + second + "=" + (first+second));
        System.out.println(first + "-" + second + "=" + (first-second));
        System.out.println(first + "*" + second + "=" + (first*second));
        System.out.println(first + " un " + second + " vid = " + ((double)(first+second)/2));


    }

}
