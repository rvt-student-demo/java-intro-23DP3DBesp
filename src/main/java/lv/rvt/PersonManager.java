package lv.rvt;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.nio.Buffer;
import java.nio.file.StandardOpenOption;
import java.io.BufferedWriter;

public class PersonManager {

    public static ArrayList<Person> getPersonList() throws Exception {
        BufferedReader reader = Helper.getReader("person.csv");

        ArrayList<Person> personList = new ArrayList<>();
        String line;

        reader.readLine();
        
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");

            String name; 
            String address;
            int age;
            name = parts[0];
            address = parts[2];
            age = Integer.valueOf(parts[1]); 
            

            Person person = new Person(name, address, age);
            personList.add(person);
        }
        return personList;
    }
    
    public static void addPerson(Person person) throws Exception{
        BufferedWriter writer = Helper.getWriter("person.csv", StandardOpenOption.APPEND);

        writer.newLine();
        writer.write(person.getName() + ", " + person.getAge() + ", " + person.getAdres()); 
        writer.close();
    
    }

    public static void printPersonTable() throws Exception{
        BufferedReader reader = Helper.getReader("person.csv");
        String line;
    
        // Skip the header
        reader.readLine();  
    
        System.out.printf("%-20s %-5s %-20s%n", "Name", "Age", "Adress");  
        System.out.println("------------------------------------");
    
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");
            
            String name; 
            String address;
            int age;
            name = parts[0];
            address = parts[2];
            age = Integer.valueOf(parts[1]);
    
            System.out.printf("%-20s %-5s %-20s %n", name, age, address); 
    }
}}