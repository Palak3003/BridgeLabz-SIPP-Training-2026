class Vehicle {

    private String vehicleNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String vehicleNumber,
                   String ownerName,
                   String vehicleType) {

        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void display() {
        System.out.println(vehicleNumber + " | "
                + ownerName + " | "
                + vehicleType);
    }
}

public class SmartParkingDemo {

    public static void displayCars(Vehicle[] vehicles) {

        System.out.println("Cars:");

        for (Vehicle v : vehicles) {
            if (v.getVehicleType().equalsIgnoreCase("Car")) {
                v.display();
            }
        }
    }

    public static void displayBikes(Vehicle[] vehicles) {

        System.out.println("\nBikes:");

        for (Vehicle v : vehicles) {
            if (v.getVehicleType().equalsIgnoreCase("Bike")) {
                v.display();
            }
        }
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Vehicle("UP01A1", "Palak", "Car"),
                new Vehicle("UP01A2", "Riya", "Bike"),
                new Vehicle("UP01A3", "Aman", "Car"),
                new Vehicle("UP01A4", "Neha", "Bike"),
                new Vehicle("UP01A5", "Raj", "Car"),
                new Vehicle("UP01A6", "Ankit", "Bike"),
                new Vehicle("UP01A7", "Priya", "Car"),
                new Vehicle("UP01A8", "Rohan", "Bike"),
                new Vehicle("UP01A9", "Karan", "Car"),
                new Vehicle("UP01A10", "Simran", "Bike")
        };

        displayCars(vehicles);
        displayBikes(vehicles);
    }
}