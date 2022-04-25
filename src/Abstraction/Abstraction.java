package Abstraction;

public class Abstraction {

    public static void main(String[] args) {

        // abstract =   abstract classes cannot be instantiated, but they can have a subclass that can be
        //              abstract methods are declared w/o an implementation
        //adds a layer of security to our program. Can be applied to classes and methods

        //want this to be abstract to not instantiate. Vehicle is too generic/abstract to have as object
        //We need a certain type of vehicle, not just "vehicle"
        //Vehicle vehicle = new Vehicle(); <-- can't be instantiated b/c abstract

        Car car = new Car();

        car.go();

    }

}
