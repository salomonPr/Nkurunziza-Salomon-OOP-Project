package stockmanagement;

import java.time.LocalDate;

class GroceryItem extends StockItem {
    private LocalDate expirationDate;

    public GroceryItem(String itemId, String itemName, int quantityInStock, double pricePerUnit, String category, String supplier, LocalDate expirationDate) {
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
        System.out.println("Grocery Item Report:");
        System.out.println("Name: " + itemName + ", Stock: " + quantityInStock + ", Expiry: " + expirationDate);
    }

    @Override
    public void validateStock() {
        if (expirationDate.isBefore(LocalDate.now().plusDays(5))) {
            System.out.println(itemName + " is near expiration! Apply discounts!");
        }
    }
}

