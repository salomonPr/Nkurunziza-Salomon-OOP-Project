package stockmanagement;

import java.util.*;
import java.time.LocalDate;

public class StockManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<StockItem> inventory = new ArrayList<>();

        System.out.println("Welcome to Advanced Stock Management System");

        while (true) {
            System.out.println("\n1. Add Electronics Item");
            System.out.println("2. Add Clothing Item");
            System.out.println("3. Add Grocery Item");
            System.out.println("4. Add Furniture Item");
            System.out.println("5. Add Perishable Item");
            System.out.println("6. Generate Inventory Report");
            System.out.println("7. Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (option == 7) break;

            System.out.print("Enter Item ID: ");
            String itemId = scanner.nextLine();
            System.out.print("Enter Item Name: ");
            String itemName = scanner.nextLine();
            System.out.print("Enter Quantity In Stock: ");
            int quantity = scanner.nextInt();
            System.out.print("Enter Price Per Unit: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Category: ");
            String category = scanner.nextLine();
            System.out.print("Enter Supplier: ");
            String supplier = scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter Warranty in Months: ");
                    int warranty = scanner.nextInt();
                    ElectronicsItem eItem = new ElectronicsItem(itemId, itemName, quantity, price, category, supplier, warranty);
                    inventory.add(eItem);
                    break;

                case 2:
                    System.out.print("Enter sizes (comma-separated): ");
                    String[] sizes = scanner.nextLine().split(",");
                    System.out.print("Enter colors (comma-separated): ");
                    String[] colors = scanner.nextLine().split(",");
                    ClothingItem cItem = new ClothingItem(itemId, itemName, quantity, price, category, supplier, sizes, colors);
                    inventory.add(cItem);
                    break;

                case 3:
                    System.out.print("Enter expiration date (yyyy-mm-dd): ");
                    LocalDate expDate = LocalDate.parse(scanner.nextLine());
                    GroceryItem gItem = new GroceryItem(itemId, itemName, quantity, price, category, supplier, expDate);
                    inventory.add(gItem);
                    break;

                case 4:
                    System.out.print("Enter weight: ");
                    double weight = scanner.nextDouble();
                    FurnitureItem fItem = new FurnitureItem(itemId, itemName, quantity, price, category, supplier, weight);
                    inventory.add(fItem);
                    break;

                case 5:
                    System.out.print("Enter expiration date (yyyy-mm-dd): ");
                    LocalDate perishDate = LocalDate.parse(scanner.nextLine());
                    PerishableItem pItem = new PerishableItem(itemId, itemName, quantity, price, category, supplier, perishDate);
                    inventory.add(pItem);
                    break;
            }
        }

        // Report
        System.out.println("\n------ Inventory Report ------");
        for (StockItem item : inventory) {
            item.generateStockReport();
            item.validateStock();
        }
        scanner.close();
    }
}

