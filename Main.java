public class Main {

    // DEMO 2: One method accepts different Vehicle subclasses
    public static void printDetails(Vehicle v) {
        v.displayInfo();
    }
public static void main(String[] args) {

        //CAR
        System.out.println("=== 1. Parent Reference ===");
        Vehicle vehicle = new Car("Tesla", "Roadster", 2026, 4);
        vehicle.displayInfo();
        System.out.println();

        //TRUCK
        vehicle = new Truck("Isuzu", "Giga", 2025, 6);
        vehicle.displayInfo();
        System.out.println();

        //MOTOWR
        vehicle = new Motorcycle("Kawasaki", "Ninja", 2026, "1000 CC");
        vehicle.displayInfo();
        System.out.println();

        //CAR
        System.out.println("\n=== 2. Method Parameter ===");
        Car car = new Car("Toyota", "Innova", 2023, 4);
        printDetails(car);
        System.out.println();

        //TRAK
        printDetails(new Truck("Hino", "500", 2024, 6));
        System.out.println();
        printDetails(new Motorcycle("Honda", "Click", 2025, "155cc"));

        // DEMO 3: Array of parent type holding different children
        System.out.println("\n=== 3. Array of Vehicles ===");
        Vehicle[] garage = {
            new Car("Honda", "Civic", 2024, 4),
            new Truck("Isuzu", "Elf", 2022, 4),
            new Motorcycle("Suzuki", "Raider", 2025, "150cc")
        };
        for (Vehicle v : garage) {
            v.displayInfo();
            System.out.println();
        }
    }

}
