package App;
import vehicles.Vehicle;
import vehicles.Car;
import vehicles.Motorcycle;
import vehicles.Truck;
import contracts.Serviceable;
import devices.Printer;

public class Main {

    public static void performService(Serviceable item) {
        item.service();
    }

    public static void main(String[] args) {

        Car car = new Car("Toyota", "Innova", 2023, 4);
        Motorcycle motorcycle = new Motorcycle("Honda", "Click", 2025, "155cc");
        Truck truck = new Truck("Isuzu", "Giga", 2025, 6);
        Printer printer = new Printer();
        
        System.out.println("=== Serviceable Array ===");
        
        Serviceable[] serviceItems = { car, motorcycle, truck, printer };
        
        for (Serviceable item : serviceItems) {
            performService(item);
        }
        System.out.println("\n=== Vehicle Array ===");
        Vehicle[] vehicles = { car, motorcycle, truck };
        
        for (Vehicle v : vehicles) {
            v.displayInfo();
            v.moveForward();
            v.moveBackwards();
            v.moveLeft();
            v.moveRight();
            System.out.println();
        }
    }
}