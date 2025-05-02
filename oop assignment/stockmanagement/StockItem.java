package stockmanagement;

abstract class StockItem {
    protected String itemId;
    protected String itemName;
    protected int quantityInStock;
    protected double pricePerUnit;
    protected String category;
    protected String supplier;

    public StockItem(String itemId, String itemName, int quantityInStock, double pricePerUnit, String category, String supplier) {
        if (pricePerUnit <= 0) throw new IllegalArgumentException("Price must be above zero.");
        if (quantityInStock < 0) throw new IllegalArgumentException("Quantity must not be negative.");
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantityInStock = quantityInStock;
        this.pricePerUnit = pricePerUnit;
        this.category = category;
        this.supplier = supplier;
    }

    public abstract void updateStock(int quantity);
    public abstract double calculateStockValue();
    public abstract void generateStockReport();
    public abstract void validateStock();
}

