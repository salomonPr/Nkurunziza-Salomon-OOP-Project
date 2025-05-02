package insurance;

import java.time.LocalDate;

public class Claim {
    private String claimId;
    private double claimAmount;
    private LocalDate claimDate;
    private String claimStatus;

    public Claim(String id, double amount, LocalDate date) {
        this.claimId = id;
        this.claimAmount = amount;
        this.claimDate = date;
        this.claimStatus = "Pending";
    }

    public boolean validate(double coverage) {
        if (claimAmount <= coverage) {
            this.claimStatus = "Approved";
            return true;
        } else {
            this.claimStatus = "Rejected";
            return false;
        }
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    // Getters omitted for brevity
}

