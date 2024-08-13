package java_fundamentals.cafe_business_logic_task;

import java.util.ArrayList;

public class CafeUtil {
    
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    public int getStreakGoal(int numWeeks) {  // overload
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }
    public void displayMenu(ArrayList<String> menuItems) {
    for (int i = 0; i < menuItems.size(); i++) {
        System.out.println(i + " " + menuItems.get(i));
    }
   }

    public void addCustomer(ArrayList<String> customers) {
    System.out.println("Please enter your name:");
    String userName = System.console().readLine();
    System.out.println("Hello, " + userName + "!");
    System.out.println("There are " + customers.size() + " people in front of you.");
    customers.add(userName);
    System.out.println(customers);
  }

  public void addCustomers(ArrayList<String> customers){
    System.out.println("when you finished entering Customers enter q plz ..");
    while(true){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        if(userName.equals("q")){ // when user enter q (finished entering)
            return;
        }
        System.out.println("Hello, " + userName + "!");
        System.out.println("There are " + customers.size() + " people in front of you.");
        customers.add(userName);
        System.out.println(customers);
    }
  }

  public void displayMenu(ArrayList<String> menuItems , ArrayList<Double> prices) {  // overload
    if(menuItems.size() == prices.size()){
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i)+ " --  $" + prices.get(i) );
        }
    }
   }

   public void printPriceChart(String product, double price, int maxQuantity){
    int sum =0;
    System.out.println(product);
    for(int i =1 ; i<=maxQuantity ; i++){
        sum+=price;
    System.out.println(i +" -  $" +sum );
    }
   }
}
