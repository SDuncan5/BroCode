package ObjectPassing;

public class Car {

    String name;

    Car(String name) {
        this.name = name;
    }

    void startCar() {
        System.out.println(name + " goes vroom vroom.");
    }

    public String toString() {
        return name;
    }

}
