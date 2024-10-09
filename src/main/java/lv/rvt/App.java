package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    Scanner reader = new Scanner(System.in);
    int beginning = Integer.valueOf(reader.nextLine());
    int end = Integer.valueOf(reader.nextLine());

    divisibleByThreeInRange(beginning, end);
    }
    public static void divisibleByThreeInRange(int beginning, int end)
    {
        for (int i = beginning; i<=end;i++)
        {
            if (i % 3 ==0){
                System.out.println(i);
            }
        }
    }
}
