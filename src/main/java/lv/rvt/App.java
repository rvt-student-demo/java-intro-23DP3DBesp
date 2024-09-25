package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int giftval = Integer.valueOf(reader.nextLine());
        if (giftval >= 1000000) {
            System.out.println("Tax:"+ (142100+(giftval-1000000)*0.17));
        }
        else if (giftval >= 200000 && giftval < 1000000) {
            System.out.println("Tax:"+ (22100+(giftval-200000)*0.15));
        }
        else if (giftval >= 55000 && giftval < 200000) {
            System.out.println("Tax:"+ (4700+(giftval-55000)*0.12));
        }
        else if (giftval >= 25000 && giftval < 55000) {
            System.out.println("Tax:"+ (1700+(giftval-25000)*0.1));
        }
        else if (giftval >= 5000 && giftval < 25000) {
            System.out.println("Tax:"+ (100+(giftval-5000)*0.08));
        }
        else {
            System.out.println("No tax!");
        }
    }

}
