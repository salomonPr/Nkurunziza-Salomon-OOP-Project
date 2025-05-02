package stockmanagement;

import java.time.LocalDate;

class PerishableItem extends StockItem {
    private LocalDate expirationDate;

    public PerishableItem(String itemId, String itemName, int quantityInStock, double pricePerUnit, String category, String supplier, LocalDate expirationDate) {
        super(itemId, itemName, quantityInStock, pricePerUnit, category, supplier);
        this.expirationDate = expirationDate;
    }

    @Override
    public void updateStock(int quantity) {
        if (quantity + quantityInStock < 0) throw new IllegalArgumentException("Insufficient stock.");
        this.quantityInStock += quantity;
    }

    @Override
    public double calculateStockValue() {
        return quantityInStock * pricePerUnit;
    }

    @Override
    public void generateStockReport() {
        System.out.println("Perishable Item Report:");
        System.out.println("Name: " + itemName + ", Stock: " + quantityInStock + ", Expiry: " + expirationDate);
    }

    @Override
    public void validateStock() {
        if (expirationDate.isBefore(LocalDate.now())) {
            System.out.println("ALERT: " + itemName + " has expired! Dispose immediately.");
        }
    }
}

