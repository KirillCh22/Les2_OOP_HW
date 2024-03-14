public class Car extends Vehicle{
    int fuelCapacity = 55;
    int currentFuelLevel = 18;

    public Car(int id, String brand, String model, int year) {
        super(id, brand, model, year);
    }


    void displayInfo() {
        System.out.printf("ID: %d \nМарка автомобиля: %s \nМодель: %s \nГод выпуска: %d \n\nЁмкость топливного бака: %d \nТекущий уровень топлива: %d\n",
                id, brand, model, year, fuelCapacity, currentFuelLevel);
    }

    @Override
    void startEngine() {
        super.startEngine();
    }

    @Override
    void stopEngine() {
        super.stopEngine();
    }

    @Override
    void accelerate(int speed) {
        super.accelerate(speed);
    }

    @Override
    void brake() {
        super.brake();
    }

    void refuel(int liters) {
        int refuel = currentFuelLevel + liters;
        if (refuel > fuelCapacity) System.out.println("Налили больше объема бака");
        else if (refuel == fuelCapacity) System.out.println("Бак полон");
        else if (liters < 0) System.out.println("Вы вели отрицательное значение по бензину");
        else System.out.println("Текущий уровень бензина: " + currentFuelLevel);
    }


}
