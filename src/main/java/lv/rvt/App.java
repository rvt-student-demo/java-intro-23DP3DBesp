package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println();

        String lastname = scanner.nextLine();
        System.out.println();

        String group = scanner.nextLine();
        System.out.println();

        System.out.println(name + " " + lastname + " " + group);
    }

}
