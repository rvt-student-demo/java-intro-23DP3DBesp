package lv.rvt;

public class Product {

    private String name;
    private String location;
    private int weight;


    public Product (String initialName){
        this.name = initialName;
        
    }
    public Product (String initialName, String location) {
        this.name = initialName;
        this.location = location;
    }
    public Product (String initialName, int weight) {
        this.name = initialName;
        this.weight = weight;
        
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + "kg) can be found from here" + this.location; 
    }
}
