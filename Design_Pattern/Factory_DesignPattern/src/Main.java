public class Main {
    public static void main(String[] args) {
        //Create a twoWheeler
        VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
        Client twoWheelerClient = new Client(twoWheelerFactory);
        Vehicle twoWheeler = twoWheelerClient.getVehicle();
        twoWheeler.printVehicle();


        //create a fourWheeler
        VehicleFactory fourWheelerFactory=new FourWheelerFactory();
        Client fourWheelerClient=new Client(fourWheelerFactory);
        Vehicle fourWheeler=fourWheelerClient.getVehicle();
        fourWheeler.printVehicle();
    }
}

//    Vehicle serves as the Product interface, defining the common method printVehicle() that all concrete products must implement.
//    TwoWheeler and FourWheeler are concrete product classes representing different types of vehicles, implementing the printVehicle() method.
//    VehicleFactory acts as the Creator interface (Factory Interface) with a method createVehicle() representing the factory method.
//    TwoWheelerFactory and FourWheelerFactory are concrete creator classes (Concrete Factories) implementing the VehicleFactory interface to create instances of specific types of vehicles.