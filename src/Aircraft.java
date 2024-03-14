public class Aircraft extends Vehicle implements Flyable {
    int maxAltitude = 9000; // Max высота полета
    boolean isFlying; //Флаг состояния полета


    public Aircraft(int id, String brand, String model, int year) {
        super(id, brand, model, year);
    }

    @Override
    void startEngine() {
        super.startEngine();
    }

    @Override
    void stopEngine() {
        super.stopEngine();
    }


    void displayInfo() {
        System.out.printf("ID: %d \nМарка самолета: %s \nМодель: %s \nГод выпуска: %d \n\n Максимальная высота полета: %d \nФлаг состояния полета %b\n",
                id, brand, model, year, maxAltitude, isFlying);
    }

    @Override
    public void takeOff() {
        System.out.println("Взлет самолета");
        isFlying = true;
    }


    @Override
    public void land() {
        System.out.println("Посадка самолета");
        isFlying = false;
    }
}
