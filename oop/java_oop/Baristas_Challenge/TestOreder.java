package oop.java_oop.Baristas_Challenge;
public class TestOreder {
    public static void main(String[] args) {
    
        Order guestOrder_1 = new Order();
        Order guestOrder_2 = new Order();

        Order order_1 = new Order("Mitri khoury");
        Order order_2 = new Order("Ahmad ali");
        Order order_3 = new Order("Sara Ahmad");

        Item item_1 = new Item("mocha", 5.4);
        Item item_2 = new Item("capuccino", 4.2);
        Item item_3 = new Item("drip coffee", 3.8);
        Item item_4 = new Item("latte", 6.1);

        guestOrder_1.addItem(item_4);
        guestOrder_1.addItem(item_2);

        guestOrder_2.addItem(item_1);
        guestOrder_2.addItem(item_2);

        order_1.addItem(item_3);
        order_1.addItem(item_2);
        order_1.addItem(item_1);

        order_2.addItem(item_4);
        order_2.addItem(item_3);
        order_2.addItem(item_2);

        order_3.addItem(item_1);
        order_3.addItem(item_3);
        order_3.addItem(item_4);

        order_1.display();
        System.out.println("******");
        order_2.display();
        System.out.println("******");
        order_3.display();
        System.out.println("******");
        guestOrder_1.display();
        System.out.println("******");
        guestOrder_2.display();
        System.out.println("******");

        order_1.setReady(true);
        System.out.println("Order 1 Message : "+order_1.getStatusMessage());

        order_3.setReady(false);
        System.out.println("Order 3 Message : "+order_3.getStatusMessage());
 }
}
