package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // printStars(5);
        // printStars(3);
        // printStars(9);
        // printSquare(4);
        // printRectangle(3, 17);
        // printTriangle(4);
        christmasTree(5);
    }
    public static void printStars(int number)
    // Part 1
    {
        for (int i = 1; i <= number; i++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size)
    // Part 2
    {
        for (int i = 1; i<=size; i++){
            for (int j = 1; j<=size; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printRectangle(int wide, int height)
    // Part 3
    {
        for (int i = 1; i<=wide; i++){
            for (int j = 1; j<=height; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printTriangle(int traingleheight)
    // Part 4
    {
        for (int i = 1; i<= traingleheight; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void printSpaces(int number)
    {
        for (int i = 0; i <= number; i++)
        {
            System.out.print(" ");
        }
    }
    public static void printRightTriangle(int size)
    {
        for (int i = 0; i <= size; i++)
        {
            printSpaces(size-i);
            printStars(i);
        }
    }
    public static void christmasTree(int height)
    {
        for (int i = 0; i <= height; i++)
        {
            printSpaces(height-1);
            printStars(i+(i-1));
        }
        for (int i = 0; i < 2; i ++)
        {
            printSpaces(height-2);
            printStars(3);
        }
    }
    
}
