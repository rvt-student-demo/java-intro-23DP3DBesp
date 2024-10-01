package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);
        int number =  Integer.valueOf(reader.nextLine());
        for (int i = 0; i < number+1; i++) {
            System.out.println(i);
        }
    }

}
