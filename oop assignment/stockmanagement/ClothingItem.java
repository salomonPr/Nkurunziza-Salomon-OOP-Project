package stockmanagement;

public class ClothingItem extends StockItem {
        private String[] sizes;
        private String[] colors;
        private double discount;

        public ClothingItem(String itemId, String itemName, int quantityInStock, double pricePerUnit, String category, String supplier, String[] sizes, String[] colors) {
            super(itemId, itemName, quantityInStock, pricePerUnit, category, supplier);
            this.sizes = sizes;
            this.colors = colors;
            this.discount = 0;
        }

        public void setDiscount(double discount) {
            if (discount < 0 || discount > 50) throw new IllegalArgumentException("Discount cannot exceed 50%.");
            this.discount = discount;
        }

        @Override
        public void updateStock(int quantity) {
            if (quantity + quantityInStock < 0) throw new IllegalArgumentException("Insufficient stock.");
            this.quantityInStock += quantity;
        }

        @Override
        public double calculateStockValue() {
            return quantityInStock * pricePerUnit * (1 - discount / 100);
        }

        @Override
        public void generateStockReport() {
            System.out.println("Clothing Item Report:");
            System.out.println("Name: " + itemName + ", Stock: " + quantityInStock + ", Value: " + calculateStockValue());
        }

        @Override
        public void validateStock() {
            if (sizes.length == 0 || colors.length == 0) {
                System.out.println(itemName + " needs size/color details.");
            }
        }
    }


