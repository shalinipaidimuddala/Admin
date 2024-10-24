class Car {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setColor("Red");
        System.out.println(myCar.getColor());
    }
}
//encapsulation