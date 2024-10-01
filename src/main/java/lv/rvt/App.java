package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);
        int number =  Integer.valueOf(reader.nextLine());
        int result = 0;
        for (int i = 0; i <= number; i++) {
            result=result + i;
        }
        System.out.println(result);
    }

}
