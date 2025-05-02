package insurance;

import java.time.LocalDate;

public class ComprehensivePolicy extends InsurancePolicy {

    public ComprehensivePolicy(String id, Vehicle v, Person holder, double coverage,
                               LocalDate start, LocalDate end) {
        super(id, v, holder, coverage, start, end);
    }

    @Override
    public void calculatePremium() {
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - vehicle.getVehicleYear();
        this.premiumAmount = coverageAmount * 0.02 + age * 50;
    }

    @Override
    public void processClaim(double claimAmount) {
        Claim claim = new Claim("CMP" + System.currentTimeMillis(), claimAmount, LocalDate.now());
        if (claim.validate(this.coverageAmount)) {
            System.out.println("Claim approved.");
        } else {
            System.out.println("Claim exceeds coverage.");
        }
    }

    @Override
    public void generatePolicyReport() {
        System.out.println("Policy ID: " + policyId);
        System.out.println("Coverage: $" + coverageAmount + " | Premium: $" + premiumAmount);
    }

    @Override
    public boolean validatePolicy() {
        return vehicle.validateVehicle();
    }
}

