package oop.java_oop.coffeedore_64;

public class Item {
    
    private  String name;
    private double price;
    private int index;
    
    public Item(String name, double price , int index) {
       this.name = name;
       this.price = price;
       this.index = index;
    }
    
    public String getName() {
       return name;
    }
    public void setName(String name) {
       this.name = name;
    }
    public double getPrice() {
       return price;
    }
    public void setPrice(double price) {
       this.price = price;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String toString (){
        return index + " " + name + " --  $" + price;

    }

}
