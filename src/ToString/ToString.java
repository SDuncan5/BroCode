package ToString;

public class ToString {

    public static void main(String[] args) {

        // toString() = special method that all objects inherit,
        //    that returns a string that "textually represents" an object.
        //    can be used both implicitly and explicitly

        Car car = new Car();

        System.out.println(car.toString()); //used explicitly
        System.out.println(car); //used implicitly when using a print or println statement

    }


}
