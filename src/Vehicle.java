public abstract class Vehicle {
    int id;
    String brand; // марка
    String model;
    int year; //год выпуска

    public Vehicle(int id, String brand, String model, int year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Метод запуска двигателя
    void startEngine() {
        System.out.println("Двигатель запущен, врум врум!");
    }

    // Метод остановки двигателя
    void stopEngine() {
        System.out.println("Двигатель остановлен!");
    }

    //Увеличение скорости
    void accelerate(int speed) {
        String speed_str = Integer.toString(speed);
        System.out.println("Скорость увеличивается на " + speed_str);
    }

    //Прекращение движения
    void brake(){
        System.out.println("Прекращение движения.");

    }

    // Вывод информации о транспортном средстве
    abstract void displayInfo();

}
