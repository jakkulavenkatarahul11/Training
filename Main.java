import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class KFCBillingCounter {
    private Map<String, Double> menu;
    private Map<Integer, Map<String, Integer>> orders;
    private int tokenNumber;

    public KFCBillingCounter() {
        menu = new HashMap<>();
        menu.put("Chicken Bucket", 500.0);
        menu.put("Zinger Burger", 200.0);
        menu.put("Fries", 100.0);
        menu.put("Coke", 50.0);
        menu.put("Donuts", 300.0);
        menu.put("Chicken Nuggets", 250.0);
       // menu.put("Donuts",350);
        orders = new HashMap<>();
        tokenNumber = 1;
    }

    public void displayMenu() {
        System.out.println("Menu:");
        for (Map.Entry<String, Double> entry : menu.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }
    }

    public Map<String, Integer> takeOrder() {
        Map<String, Integer> order = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the item you want to order (or 'done' to finish): ");
            String item = scanner.nextLine();
            if (item.equalsIgnoreCase("done")) {
                break;
            }
            if (menu.containsKey(item)) {
                System.out.print("Enter the quantity: ");
                int quantity = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over
                order.put(item, quantity);
            } else {
                System.out.println("Item not found in the menu. Please try again.");
            }
        }
        return order;
    }

    public double calculateBill(Map<String, Integer> order) {
        double total = 0;
        for (Map.Entry<String, Integer> entry : order.entrySet()) {
            total += menu.get(entry.getKey()) * entry.getValue();
        }
        return total;
    }

    public void makePayment(double bill) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please pay $" + String.format("%.2f", bill) + ": ");
            double payment = scanner.nextDouble();
            scanner.nextLine(); // Consume newline left-over
            if (payment >= bill) {
                System.out.println("Payment successful!");
                return;
            } else {
                System.out.println("Insufficient payment. Please try again.");
            }
        }
    }

    public void serveCustomer() {
        System.out.println("\nToken Number: " + tokenNumber);
        displayMenu();
        Map<String, Integer> order = takeOrder();
        double bill = calculateBill(order);
        System.out.println("\nYour bill is: $" + String.format("%.2f", bill));
        makePayment(bill);
        System.out.println("Please wait for your order...");
        orders.put(tokenNumber, order);
        tokenNumber++;
    }
}

public class Main {
    public static void main(String[] args) {
        KFCBillingCounter counter1 = new KFCBillingCounter();
        KFCBillingCounter counter2 = new KFCBillingCounter();
        KFCBillingCounter counter3 = new KFCBillingCounter();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nSelect a counter:");
            System.out.println("1. Counter 1");
            System.out.println("2. Counter 2");
            System.out.println("3. Counter 3");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            if (choice == 1) {
                counter1.serveCustomer();
            } else if (choice == 2) {
                counter2.serveCustomer();
            } else if (choice == 3) {
                counter3.serveCustomer();
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
