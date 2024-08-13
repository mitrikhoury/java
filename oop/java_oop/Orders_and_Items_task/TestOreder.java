package oop.java_oop.Orders_and_Items_task;
public class TestOreder {
    public static void main(String[] args) {
    Item item_1 = new Item();
    Item item_2 = new Item();
    Item item_3 = new Item();
    Item item_4 = new Item();
    //Create 4 item variables of type Item and instantiate each as an Item object. Name them item1, item2 etc.
        
    item_1.name ="mocha";
    item_1.price = 3.8;

    item_2.name = "latte";
    item_2.price = 4.0;

    item_3.name = "drip coffee";
    item_3.price = 6.9;

    item_4.name = "capuccino";
    item_4.price = 8.0;

     //Set the price and the name for each -- "mocha", "latte", "drip coffee" and "capuccino" .

    Order order_1 = new Order();
    Order order_2 = new Order();
    Order order_3 = new Order();
    Order order_4 = new Order();

    //Create 4 order variables of type Order and instantiate each as an Order object. Name them order1, order2 etc.
   
    order_1.name = "Cindhuri";
    order_2.name = "Jimmy";
    order_3.name = "Noah";
    order_4.name = "Sam";

    //Set each order's name -- "Cindhuri", "Jimmy", "Noah", "Sam".

    // System.out.println(order_1);

    // System.out.println(order_1.total); 
    // System.out.println(item_2.price);
    try {

        order_2.items.add(item_1);
        order_2.total = order_2.total + item_1.price;  //Add item1 to order2's item list and increment the order's total.

        
        order_3.items.add(item_4);
        order_3.total += item_4.price; //order3 ordered a cappucino.
    
        order_4.items.add(item_2);
        order_4.total += item_2.price;  //order4 added a latte. Update accordingly.
    
        order_1.ready = true; // Cindhuri’s order is now ready. Update her status.
    
    
        //Sam ordered more drinks - 2 lattes. Update their order as well
        order_4.items.add(item_2);
        order_4.items.add(item_2);
        order_4.total += item_2.price * 2;
    
       //Jimmy’s order is now ready. Update his status.
        order_2.ready=true;
    
    } catch (Exception e) {
        e.printStackTrace();
    }

    
    System.out.println(order_1.name);
    System.out.println(order_2.name);
    System.out.println(order_3.name);
    System.out.println(order_4.name);
    
 }
}
