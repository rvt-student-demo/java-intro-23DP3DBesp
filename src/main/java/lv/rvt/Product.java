package lv.rvt;

public class Product {
    private String name;
    private double price;
    private int quantity;
    
    public Product(String Initialname, double Initialprice, int Initialquantity){
        this.name = Initialname;
        this.price = Initialprice;
        this.quantity = Initialquantity;

    }
    public void printProduct(){
        System.out.println(this.name + " price " + this.price+ " " + this.quantity + " pcs");
    }
}
