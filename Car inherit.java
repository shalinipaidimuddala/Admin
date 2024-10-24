class Car {
    void start() {
        System.out.println("Car is starting");
    }
}

class ElectricCar extends Car {
    void chargeBattery() {
        System.out.println("Battery is charging");
    }
}

public class Main {
    public static void main(String[] args) {
        ElectricCar myElectricCar = new ElectricCar();
        myElectricCar.start();
        myElectricCar.chargeBattery();
    }
}
//inheritance