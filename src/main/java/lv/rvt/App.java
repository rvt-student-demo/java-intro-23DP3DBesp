package lv.rvt;

import java.util.Scanner;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        ArrayList<String> wordlist = new ArrayList<>();
        wordlist.add("Tom");
        wordlist.add("Emma");
        wordlist.add("Alex");
        wordlist.add("Mary");
        System.out.println(wordlist.get(2));
    }
    
}
