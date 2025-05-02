package insurance;

import java.time.LocalDate;
import java.util.Scanner;

public class InsuranceSystemMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input simulation
        System.out.println("Enter Vehicle Year: ");
        int year = sc.nextInt();
        sc.nextLine(); // consume newline

        Vehicle vehicle = new Vehicle("V123", "Toyota", "Corolla", year, "Private");
        Person person = new Person("P001", "Alice", LocalDate.of(1990, 5, 10), "alice@mail.com", "9876543210");

        ComprehensivePolicy policy = new ComprehensivePolicy("POL001", vehicle, person, 50000,
                LocalDate.now(), LocalDate.now().plusYears(1));

        if (policy.validatePolicy()) {
            policy.calculatePremium();
            policy.generatePolicyReport();
            policy.processClaim(3000);
        } else {
            System.out.println("Invalid policy details.");
        }

        sc.close();
    }
}

