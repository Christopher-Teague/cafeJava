public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 2.0;
        double latte = 4.5;
        double cappuccino = 4.5;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
        
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(generalGreeting + customer2);
        System.out.println(generalGreeting + customer3);
        System.out.println(generalGreeting + customer4);
        
        //IF statements
        if (isReadyOrder1) {
            System.out.println(customer1 + readyMessage + displayTotalMessage + dripCoffee);
        } else {
            System.out.println(customer1 + pendingMessage);
        }
        
        if (isReadyOrder2) {
            System.out.println(customer4 + readyMessage + displayTotalMessage + cappuccino);
        } else {
            System.out.println(customer4 + pendingMessage);
        }
        
        if (isReadyOrder3) {
            System.out.println(customer2 + readyMessage + displayTotalMessage + 2 * latte);
        } else {
            System.out.println(customer2 + pendingMessage);
        }
        
        if (isReadyOrder4) {
            System.out.println(customer3 + readyMessage + displayTotalMessage + (latte - dripCoffee));
        } else {
            System.out.println(customer3 + pendingMessage);
        }



    }
}