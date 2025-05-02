package stockmanagement;

public class  ElectronicsItem extends StockItem {
    private int warrantyMonths;
    private double discount; // Max 50%

    public ElectronicsItem(String itemId, String itemName, int quantityInStock, double pricePerUnit, String category, String supplier, int warrantyMonths) {
        super(itemId, itemName, quantityInStock, pricePerUnit, category, supplier);
        if (warrantyMonths <= 0 || warrantyMonths > 60) throw new IllegalArgumentException("Warranty must be between 1-60 months.");
        this.warrantyMonths = warrantyMonths;
        this.discount = 0;
    }

    public void applyDiscount(double discountPercent) {
        if (discountPercent < 0 || discountPercent > 50) {
            throw new IllegalArgumentException("Discount cannot exceed 50%.");
        }
        this.discount = discountPercent;
    }

    @Override
    public void updateStock(int quantity) {
        if (quantity + this.quantityInStock < 0) throw new IllegalArgumentException("Insufficient stock.");
        this.quantityInStock += quantity;
    }

    @Override
    public double calculateStockValue() {
        return quantityInStock * pricePerUnit * (1 - discount / 100);
    }

    @Override
    public void generateStockReport() {
        System.out.println("Electronics Item Report:");
        System.out.println("Name: " + itemName + ", Stock: " + quantityInStock + ", Value: " + calculateStockValue());
    }

    @Override
    public void validateStock() {
        if (quantityInStock <= 0) {
            System.out.println(itemName + " is out of stock!");
        }
    }
}


