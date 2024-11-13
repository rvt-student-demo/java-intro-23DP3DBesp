package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Statistic all = new Statistic();
        Statistic even = new Statistic();
        Statistic odd = new Statistic();
        System.out.println("Enter number:");
        while(true){
            int numbers = Integer.valueOf(reader.nextLine());
            if (numbers == -1){
                break;
            }
            
            if (numbers % 2 ==0) {
                even.addNumber(numbers);
            }
            else{
                odd.addNumber(numbers);
            }
            all.addNumber(numbers);
        }

        System.out.println("Sum: " + all.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());


    }
}