package insurance;

public class Vehicle {
    private String vehicleId, vehicleMake, vehicleModel, vehicleType;
    private int vehicleYear;

    public Vehicle(String id, String make, String model, int year, String type) {
        this.vehicleId = id;
        this.vehicleMake = make;
        this.vehicleModel = model;
        this.vehicleYear = year;
        this.vehicleType = type;
    }

    // Getters, setters, and validations
    public boolean validateVehicle() {
        return vehicleYear > 2000 && (vehicleType.equalsIgnoreCase("Private") || vehicleType.equalsIgnoreCase("Commercial"));
    }

    // Getters omitted for brevity
    public int getVehicleYear() { return vehicleYear; }
    public String getVehicleMake() { return vehicleMake; }
    public String getVehicleModel() { return vehicleModel; }

}


