package lv.rvt;

import java.util.Scanner;

import java.io.BufferedReader;

import java.util.ArrayList;


public class App 
{
    public static void main(String[] args) throws Exception{
        BufferedReader reader = Helper.getReader("person.csv");
        String line;
        reader.readLine();

        while ((line = reader.readline()) != null) {
            String[] parts = line.split(", ");
            String name = parts[0];
            int age = Integer.valueOf(parts[1]);
            int weight = Integer.valueOf(parts[2]);
            int height = Integer.valueOf(parts[3]);
            String address = parts[4];

            Person person = new Person();
            personList.add(Person)
        }
    }
}