package Polymorphism;

public class Polymorphism {

    public static void main(String[] args) {

        // polymorphism =   greek word for poly-"many", morph-"form"
        //                  The ability of an object to identify as more than one type

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        //all these identify as vehicles as well b/c it's the parent class
        Vehicle[] racers = {car, bicycle, boat};

        //could also do:
        //Object[] racers = {car, bicycle, boat};
        //but there are a couple changes you'd have to make before

        //could do this, but for loop better
        //car.go();
        //bicycle.go();
        //boat.go();

        for (Vehicle x : racers) {
            x.go();
        }

    }

}
