class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    // Constructor
    Vehicle(String vehicleNumber, String brand, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.fuelType = fuelType;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass Car
class Car extends Vehicle {
    protected int numberOfSeats;
    protected boolean ACavailable;

    // Constructor chaining using super
    Car(String vehicleNumber, String brand, String fuelType, int numberOfSeats, boolean ACavailable) {
        super(vehicleNumber, brand, fuelType);
        this.numberOfSeats = numberOfSeats;
        this.ACavailable = ACavailable;
    }

    // Overriding method
    void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("AC Available: " + ACavailable);
    }
}

// Subclass ElectricCar
class ElectricCar extends Car {
    private int batteryCapacity;
    private int chargingTime;

    // Constructor chaining
    ElectricCar(String vehicleNumber, String brand, String fuelType, int numberOfSeats, boolean ACavailable,
                int batteryCapacity, int chargingTime) {
        super(vehicleNumber, brand, fuelType, numberOfSeats, ACavailable);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    // Overriding method
    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
    }
}

// Main Class
class VehicleDemo {
    public static void main(String[] args) {

        // Object of Vehicle
        Vehicle v1 = new Vehicle("GJ01AB1234", "Honda", "Petrol");
        System.out.println("\n--- Vehicle Details ---");
        v1.displayDetails();

        // Object of Car
        Vehicle v2 = new Car("GJ05CD5678", "Hyundai", "Diesel", 5, true); // Upcasting
        System.out.println("\n--- Car Details ---");
        v2.displayDetails();

        // Downcasting with instanceof
        if (v2 instanceof Car) {
            Car c = (Car) v2;
            System.out.println("Downcasting successful: Car object accessed");
        }

        // Object of ElectricCar
        Vehicle v3 = new ElectricCar("GJ10EF9012", "Tesla", "Electric", 5, true, 75, 8); // Upcasting
        System.out.println("\n--- Electric Car Details ---");
        v3.displayDetails();

        // Downcasting with instanceof
        if (v3 instanceof ElectricCar) {
            ElectricCar ec = (ElectricCar) v3;
            System.out.println("Downcasting successful: ElectricCar object accessed");
        }
    }
}