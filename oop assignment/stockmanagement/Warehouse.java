package stockmanagement;

public class  Warehouse {
    private String warehouseId;
    private String location;
    private int capacity;
    private String managerName;

    public Warehouse(String warehouseId, String location, int capacity, String managerName) {
        this.warehouseId = warehouseId;
        this.location = location;
        this.capacity = capacity;
        this.managerName = managerName;
    }
}


