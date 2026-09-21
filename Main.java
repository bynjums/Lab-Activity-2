public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        v1.brand = "Toyota";
        v1.model = "Supra";
        v1.year = 1978;

        Vehicle v2 = new Vehicle();
        v2.brand = "Nissan";
        v2.model = "GTR: Skyline";
        v2.year = 1957;

        Vehicle v3 = new Vehicle();
        v3.brand = "Mitsubishi";
        v3.model = "Lancer Evolution";
        v3.year = 2010;

        v1.displayInfo();
        System.out.println(v1.calculateAge());
        System.out.println(v1.isVintage());
        System.out.println();

        v2.displayInfo();
        System.out.println(v2.calculateAge());
        System.out.println(v2.isVintage());
        System.out.println();

        v3.displayInfo();
        System.out.println(v3.calculateAge());
        System.out.println(v3.isVintage());
        System.out.println();
    }
}