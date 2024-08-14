package oop.java_oop.coffeedore_64;

import java.util.ArrayList;

public class CoffeeKiosk  {
    
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;


    public CoffeeKiosk() {
      this.menu = new ArrayList<Item>();
      this.orders = new ArrayList<Order>();
    }

    public void addMenuItem(String name, double price) {
        int index = menu.size(); // The index is the current size of the menu
        Item newItem = new Item(name, price, index);
        menu.add(newItem);
    }

    public void displayMenu(){
      for(int i = 0 ; i < menu.size() ; i++){
        System.out.println(menu.get(i).toString());
      }
    }

    public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
        // Create a new order with the given input string
        // Show the user the menu, so they can choose items to add.
        Order x = new Order(name);
        displayMenu();
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            x.addItem(menu.get(Integer.parseInt(itemNumber)));
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
            // Get the item object from the menu, and add the item to the order
            // Ask them to enter a new item index or q again, and take their input
        }
        // After you have collected their order, print the order details 
    	// as the example below. You may use the order's display method.
        x.display();
        orders.add(x);
    }

    public void addMenuItemByInput(){
        System.out.println("do you want to add a new menu item ? ");
        System.out.println("plz enter name :");
        String name = System.console().readLine();
        System.out.println("plz enter price :");
        double price = Double.parseDouble(System.console().readLine());
        addMenuItem(name, price);
        System.out.println("the item was added successfully ..");
    }

    public void displayOrders(){
      for(int i = 0 ; i < orders.size() ; i++ ){
        orders.get(i).display();
      }
    }
}
