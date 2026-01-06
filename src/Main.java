public class Main {
    public static void main(String[] args) {
     
        Driver driver1 = new Driver("John Doe", "D-12345");
        Driver driver2 = new Driver("Jane Smith", "D-67890");

    
        Car myCar = new Car("BMW", 2023, 4, "Petrol");
        Motorcycle myMoto = new Motorcycle("Ducati", 2022, false);
        Truck myTruck = new Truck("Scania", 2020, 15.5, 3);

        
        myCar.setDriver(driver1);
        myMoto.setDriver(driver2);
        myTruck.setDriver(driver1);

  
        Vehicle[] fleet = {myCar, myMoto, myTruck};

        System.out.println("--- VEHICLE MANAGEMENT SYSTEM ---");
        for (Vehicle v : fleet) {
            v.displayInfo();
            v.startEngine();
            
            if (v.driver != null) {
                v.driver.displayDriverInfo();
            } else {
                System.out.println("No driver assigned.");
            }
            
            v.stopEngine();
            System.out.println("---------------------------------");
        }
    }
}