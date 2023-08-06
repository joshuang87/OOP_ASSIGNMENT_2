public class Vehicle {
    
    private String vehicleNumber;
    private String manufacturer;
    private String model;
    private double rentalRatePerDay;

    public Vehicle() {

    }

    public Vehicle(String vehicleNumber, String manufacturer, String model, double rentalRatePerDay) {
        this.vehicleNumber = vehicleNumber;
        this.manufacturer = manufacturer;
        this.model = model;
        this.rentalRatePerDay = rentalRatePerDay;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getManufacturer() {
            return manufacturer;
    }

    public String getModel() {
            return model;
    }

    public double getRentalRatePerDay() {
            return rentalRatePerDay;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRentalRatePerDay(double rentalRatePerDay) {
        this.rentalRatePerDay = rentalRatePerDay;
    }

    public double calculateRentalCost(int days) {
        return rentalRatePerDay * days;
    }

    @Override
    public String toString() {
        return "Vehicle Number: " + vehicleNumber + "\nManufacturer: " + manufacturer +"\nModel: " + model +"\nRental Rate Per Day: RM " + rentalRatePerDay;
    }
    
}
