import java.util.ArrayList;
import java.util.Scanner;
 
class RestaurantBillGenerator {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        // Menu Items
        String[] menuItems = {
                "Burger",
                "Pizza",
                "Pasta",
                "French Fries",
                "Sandwich",
                "Cold Drink"
        };
 
        // Prices
        int[] prices = {120, 250, 180, 100, 90, 60};
 
        ArrayList<String> orderedItems = new ArrayList<>();
        ArrayList<Integer> orderedPrices = new ArrayList<>();
 
        int total = 0;
        char choice;
 
        System.out.println("=================================");
        System.out.println("      WELCOME TO RESTAURANT");
        System.out.println("=================================");
 
        do {
 
            // Display Menu
            System.out.println("\n----------- MENU -----------");
 
            for (int i = 0; i < menuItems.length; i++) {
                System.out.println(
                        (i + 1) + ". " +
                        menuItems[i] +
                        " - Rs." + prices[i]
                );
            }
 
            // Select Item
            System.out.print("\nSelect Item Number: ");
            int itemNumber = sc.nextInt();
 
            // Validate Input
            if (itemNumber >= 1 && itemNumber <= menuItems.length) {
 
                orderedItems.add(menuItems[itemNumber - 1]);
                orderedPrices.add(prices[itemNumber - 1]);
 
                total = total + prices[itemNumber - 1];
 
                System.out.println(
                        menuItems[itemNumber - 1] +
                        " added to cart."
                );
 
            } else {
                System.out.println("Invalid Item Number!");
            }
 
            // Ask for More Items
            System.out.print("\nDo you want to order more? (Y/N): ");
            choice = sc.next().charAt(0);
 
        } while (choice == 'Y' || choice == 'y');
 
        // Final Bill
        System.out.println("\n=================================");
        System.out.println("            FINAL BILL");
        System.out.println("=================================");
 
        for (int i = 0; i < orderedItems.size(); i++) {
 
            System.out.println(
                    (i + 1) + ". " +
                    orderedItems.get(i) +
                    " - Rs." +
                    orderedPrices.get(i)
            );
        }
 
        System.out.println("---------------------------------");
        System.out.println("Total Amount = Rs." + total);
        System.out.println("=================================");
 
        System.out.println("\nThank You! Visit Again 😊");
 
        sc.close();
    }
}