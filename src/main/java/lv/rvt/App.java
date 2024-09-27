package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int numbers = 0;
        while (true) {
            System.out.println("Give a number: (print 0 to quit)");
            int number = Integer.valueOf(reader.nextLine());
            sum = sum + number;
            numbers = numbers + 1;
            if (number == 0){
                System.out.println("Number of numbers: "+ numbers);
                System.out.println("Sum of numbers: "+ sum);
                break;
            }
            

        }
    }

}
