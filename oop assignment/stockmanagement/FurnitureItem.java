package stockmanagement;

class FurnitureItem extends StockItem {
    private double weight;

    public FurnitureItem(String itemId, String itemName, int quantityInStock, double pricePerUnit, String category, String supplier, double weight) {
        super(itemId, itemName, quantityInStock, pricePerUnit, category, supplier);
        this.weight = weight;
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
        System.out.println("Furniture Item Report:");
        System.out.println("Name: " + itemName + ", Stock: " + quantityInStock + ", Weight: " + weight + "kg");
    }

    @Override
    public void validateStock() {
        System.out.println(itemName + " must be properly packed before delivery.");
    }
}

