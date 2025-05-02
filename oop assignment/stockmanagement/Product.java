package stockmanagement;

class Product {
    private String productId;
    private String productName;
    private String brand;
    private String supplier;
    private int stockQuantity;

    public Product(String productId, String productName, String brand, String supplier, int stockQuantity) {
        if (productName == null || productName.isEmpty()) throw new IllegalArgumentException("Product name cannot be empty.");
        if (stockQuantity < 0) throw new IllegalArgumentException("Stock quantity cannot be negative.");
        if (brand == null || brand.isEmpty()) throw new IllegalArgumentException("Brand cannot be empty.");
        this.productId = productId;
        this.productName = productName;
        this.brand = brand;
        this.supplier = supplier;
        this.stockQuantity = stockQuantity;
    }
}

