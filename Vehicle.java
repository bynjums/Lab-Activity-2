public class Vehicle {

    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
    public abstract void moveForward();
    public abstract void moveBackwards();
    public abstract void moveLeft();
    public abstract void moveRight();
}
