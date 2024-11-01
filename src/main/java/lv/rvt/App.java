package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);
        int varduskaits = 0;
        int yearsum = 0;
        while (true)
        {
            String input = reader.nextLine();
            if (input.equals(" "))
            {
                break;
            }
            varduskaits++;

            String pieces[] = input.split(",");
            yearsum += Integer.valueOf(pieces[1]);
            System.out.println("Longest name");
            System.out.println("Average of the birth years: "+ (yearsum/varduskaits) + "." + (2024/(yearsum/varduskaits)));

        }
    }
}