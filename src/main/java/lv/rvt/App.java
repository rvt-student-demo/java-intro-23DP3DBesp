package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main(String[] args) {
        Person denssa = new Person("Deniss");
        
        denssa.setHeight(180);
        denssa.setWeight(64);
    
        // System.out.println(denssa.getName() + ", body mass index is " + denssa.bodyMassIndex());
    }
}