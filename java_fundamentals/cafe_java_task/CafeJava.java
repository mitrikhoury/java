public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Customer names
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
        
        // Menu prices
        double dripCoffeePrice = 2.0;
        double lattePrice = 3.5;
        double cappuccinoPrice = 4.0;
        
        // Order status flags
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true; // Assuming Sam's order is ready
        @SuppressWarnings("unused")
        boolean isReadyOrder3 = false; // Assuming Jimmy's order is not ready
        boolean isReadyOrder4 = true; // Assuming Noah's order is ready
        System.out.println(generalGreeting);
        // APP INTERACTION SIMULATION
        // Cindhuri ordered a coffee
        if (isReadyOrder1) {
            System.out.println(customer1 + readyMessage);
        } else {
            System.out.println(customer1 + pendingMessage);
        }
        
        // Noah ordered a cappuccino
        if (isReadyOrder4) {
            System.out.print(customer4 + readyMessage);
            System.out.println("  "+displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(customer4 + pendingMessage);
        }
        
        // Sam ordered 2 lattes
        double samsTotal = 2 * lattePrice;
        if (isReadyOrder2) {
            System.out.print(customer2 + readyMessage);
            System.out.println(" "+displayTotalMessage + samsTotal);
        } else {
            System.out.println(customer2 + pendingMessage);
        }
        
        // Jimmy was charged for a coffee but ordered a latte
        double priceDifference = lattePrice - dripCoffeePrice;
        System.out.println(customer3 +" "+displayTotalMessage + priceDifference);
        
        // Feel free to change the prices and order statuses to test the logic
    }
}
