public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Toyota", "Supra", 1978); 
        Vehicle v2 = new Vehicle("Nissan", "GTR: Skyline", 1957);
        Vehicle v3 = new Vehicle("Mitsubishi", "Lancer Evolution", 2010);
      
        /*toyota*/ 
        v1.displayInfo(); 
        System.out.println();

        /*nissan*/
        v2.displayInfo(); 
        System.out.println();

        /*mitsubishi*/
        v3.displayInfo(); 
        System.out.println();
    }
}