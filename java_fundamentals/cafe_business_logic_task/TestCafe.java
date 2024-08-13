package java_fundamentals.cafe_business_logic_task;
import java.util.ArrayList;
public class TestCafe {
    public static void main(String[] args) {
        CafeUtil cafeUtil = new CafeUtil();

        // Test getStreakGoal
        System.out.println("Streak Goal: " + cafeUtil.getStreakGoal());

        // Test getOrderTotal
        double[] prices = {3.5, 1.5, 4.0, 2.5};
        System.out.println("Order Total: " + cafeUtil.getOrderTotal(prices));

        // Test displayMenu
        ArrayList<String> menuItems = new ArrayList<String>();
        menuItems.add("drip coffee");
        menuItems.add("cappuccino");
        menuItems.add("latte");
        menuItems.add("mocha");
        cafeUtil.displayMenu(menuItems);
        cafeUtil.printPriceChart("mocha", 15, 5);
        // Test addCustomer
        ArrayList<String> customers = new ArrayList<String>();
        //cafeUtil.addCustomer(customers);  // this method for enter one customer ..
        cafeUtil.addCustomers(customers);   
    }
}
