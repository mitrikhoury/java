package oop.java_oop.coffeedore_64;

import java.util.ArrayList;

public class Order {

  private  String name;
  public   double total;
  private  boolean ready;
  private  ArrayList<Item> items;

  public Order() {
    this.name="Guest";
   this.items = new ArrayList<Item>();
  }
  public Order(String name) {
    this.name = name;
    this.items = new ArrayList<Item>();
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public double getTotal() {
    return total;
  }
  public void setTotal(double total) {
    this.total = total;
  }
  public boolean isReady() {
    return ready;
  }
  public void setReady(boolean ready) {
    this.ready = ready;
  }
  public ArrayList<Item> getItems() {
    return items;
  }
  public void setItems(ArrayList<Item> items) {
    this.items = items;
  }

  public void addItem(Item x){
    items.add(x);
  }

  public String getStatusMessage(){
    if(this.ready){ // true 
     return "Your order is ready.";
    } else { // false 
     return "Thank you for waiting. Your order will be ready soon.";
    }
  }
 
  public void display(){

    System.out.println("Customer Name : " + this.name);
    for(int i = 0 ; i < this.items.size() ; i++){
      System.out.println(items.get(i).getName() + "  $" + items.get(i).getPrice());
    }
    System.out.println("Total:  $" + this.getOrderTotal());
  }

  public double getOrderTotal(){
    double sum = 0;
    for(int i = 0 ; i < this.items.size() ; i++){
     sum +=items.get(i).getPrice();
    }
    return sum;
  }
}
