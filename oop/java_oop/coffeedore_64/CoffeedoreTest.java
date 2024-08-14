package oop.java_oop.coffeedore_64;

public class CoffeedoreTest {
    
    public static void main(String[] args) {
        CoffeeKiosk coffe = new CoffeeKiosk();

        coffe.addMenuItem("latte", 6.7);
        coffe.addMenuItem("drip coffee", 7.4);
        coffe.addMenuItem("capuccino", 5.3);
        coffe.addMenuItem("mocha", 3.9);

        coffe.addMenuItemByInput();

        coffe.newOrder();
       
    }
}
