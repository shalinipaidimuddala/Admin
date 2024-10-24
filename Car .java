class Car {//cls and obj
    String color;
    void accelerate() {
        System.out.println("Car is accelerating");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.accelerate();
    }
}
