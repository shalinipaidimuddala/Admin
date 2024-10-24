class Car {
    void start() {
        System.out.println("Car is starting");
    }
}

class ElectricCar extends Car {
    @Override
    void start() {
        System.out.println("Electric car is starting silently");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new ElectricCar();
        myCar.start();  // Outputs: Electric car is starting silently
    }
}
//ploymorphism