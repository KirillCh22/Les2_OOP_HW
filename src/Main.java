public class Main {
    public static void main(String[] args) {

        Car car = new Car(1, "BMW", "X5", 2022);
        car.startEngine();
        car.stopEngine();
        car.displayInfo();
        car.refuel(37);

        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n");

        Aircraft aircraft = new Aircraft(1, "Boing", "707", 2010);
        aircraft.startEngine();
        aircraft.takeOff();
        aircraft.displayInfo();

        System.out.println("\nОстановка двигателя");

        aircraft.displayInfo();
        aircraft.stopEngine();
        aircraft.land();


        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n");


        Boat boat = new Boat(1, "Marlin", "555", 2018);
        boat.startEngine();
        boat.startSwimming();
        boat.displayInfo();

        System.out.println("\nОстановка двигателя\n");
        boat.stopEngine();
        boat.stopSwimming();
        boat.displayInfo();

    }
}