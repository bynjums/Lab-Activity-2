public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Toyota", "Supra", 1978);
        Vehicle v2 = new Vehicle("Nissan", "GTR: Skyline", 1957);
        Vehicle v3 = new Vehicle("Mitsubishi", "Lancer Evolution", 2010);

        System.out.println("=== Original Methods and Getters ===");
        
        v1.displayInfo();
        System.out.println(v1.calculateAge());
        System.out.println(v1.isVintage());
        System.out.println(v1.getBrand() + " | " + v1.getModel() + " | " + v1.getYear());
        System.out.println();

        v2.displayInfo();
        System.out.println(v2.calculateAge());
        System.out.println(v2.isVintage());
        System.out.println(v2.getBrand() + " | " + v2.getModel() + " | " + v2.getYear());
        System.out.println();

        v3.displayInfo();
        System.out.println(v3.calculateAge());
        System.out.println(v3.isVintage());
        System.out.println(v3.getBrand() + " | " + v3.getModel() + " | " + v3.getYear());
        System.out.println();

        System.out.println("=== setYear Tests on " + v1.getBrand() + " " + v1.getModel() + " ===");

        boolean result = v1.setYear(2000);
        System.out.println("setYear(2000) returned " + result + "; year = " + v1.getYear()
                + "; age = " + v1.calculateAge() + "; vintage = " + v1.isVintage());

        result = v1.setYear(1885);
        System.out.println("setYear(1885) returned " + result + "; year = " + v1.getYear());

        result = v1.setYear(2027);
        System.out.println("setYear(2027) returned " + result + "; year = " + v1.getYear());
        System.out.println();

        System.out.println("=== Constructor Tests ===");

        Vehicle low = new Vehicle("Test", "TooOld", 1885);
        System.out.println("New vehicle with year 1885 -> initial year = " + low.getYear());

        Vehicle high = new Vehicle("Test", "TooNew", 2027);
        System.out.println("New vehicle with year 2027 -> initial year = " + high.getYear());
    }
}
