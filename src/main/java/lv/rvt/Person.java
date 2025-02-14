package lv.rvt;

public class Person {

    private String name;
    private String address;
    private int weight;
    private int height;

    public Person(String name, String address, int weight, int height) {
        this.name = name;
        this.address = address;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return name + "\n   " + address + weight + height;

    }

}