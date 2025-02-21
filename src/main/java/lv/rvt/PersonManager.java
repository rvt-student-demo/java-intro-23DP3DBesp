package lv.rvt;

import java.util.ArrayList;
import java.io.BufferedReader;

public class PersonManager {

    public static ArrayList<Person> getPersonList() throws Exception {
        BufferedReader reader = Helper.getReader("person.csv");

        ArrayList<Person> personList = new ArrayList<>();
        String line;

        reader.readLine();
        
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");

            String name = parts[0];
            int age = Integer.valueOf(parts[1]);
            String address = parts[2];

            Person person = new Person(name, age, address);
            personList.add(person);
        }
        return personList;
    }
}