public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car("JJB 1443", "Proton", "X50", 100, 4);
        vehicles[1] = new Car("JVM 3891", "Toyota", "86GT", 399, 2);
        vehicles[2] = new Motorcycle("JBT 7549", "Yamaha", "YZF-R1", 80, 600);
        vehicles[3] = new Motorcycle("JGM 7914", "Kawasaki", "HeyYo 990", 90, 650);

        int rentalDays = 7;

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
            System.out.println("Rental Cost for " + rentalDays + " days: RM " + vehicle.calculateRentalCost(rentalDays));
            if (vehicle instanceof Motorcycle) {
                System.out.println("Top Speed: " + ((Motorcycle) vehicle).calculateTopSpeed() + " km/h");
            }
            System.out.println();
        }
        
    }

}