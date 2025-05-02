package onlineshopping;

import java.util.Scanner;

public class OnlineShopApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Customer input
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your email:");
        String email = sc.nextLine();
        System.out.println("Enter your address:");
        String address = sc.nextLine();
        System.out.println("Enter your phone:");
        String phone = sc.nextLine();

        Customer customer = new Customer("C001", name, email, address, phone);
        if (!customer.validateCustomer()) {
            System.out.println("Invalid customer details!");
            return;
        }

        // Add a sample electronic item
        ElectronicsItem laptop = new ElectronicsItem("E001", "Dell Laptop", "Gaming Laptop", 1000.0, 5, 2);
        laptop.addToCart(customer);

        // Show total
        double total = customer.getCart().getTotalPrice();
        System.out.println("Total to pay: $" + total);

        // Payment
        System.out.println("Enter payment method (Credit Card / PayPal):");
        String method = sc.nextLine();
        System.out.println("Enter amount to pay:");
        double amount = sc.nextDouble();

        Payment payment = new Payment(method, amount);
        if (payment.validatePayment(total)) {
            System.out.println("Payment successful!");
        } else {
            System.out.println("Payment failed. Please check details.");
        }

        laptop.generateInvoice(customer);
    }
}

