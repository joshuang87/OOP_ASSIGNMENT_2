public class Car extends Vehicle{
    
    private int numOfDoors;

    public Car() {

    }

    public Car(String vehicleNumber, String manufacturer, String model, double rentalRatePerDay, int numOfDoors) {
        super(vehicleNumber, manufacturer, model, rentalRatePerDay);
        this.numOfDoors = numOfDoors;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    @Override
    public double calculateRentalCost(int days) {
        if (numOfDoors > 2) {
            return super.calculateRentalCost(days) + (35 * days);
        }
        return super.calculateRentalCost(days);
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumber of Doors: " + numOfDoors;
    }
    
}
