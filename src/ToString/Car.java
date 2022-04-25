package ToString;

public class Car {

    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2021;

    //can override toString method to return a String representation of all the attributes of an object
    public String toString() {

        return make + "\n" + model + "\n" + color + "\n" + year;
    }

}
