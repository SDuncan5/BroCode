package CopyObjects;

public class CopyObjects {

    public static void main(String[] args) {

        Car car1 = new Car("Chevrolet", "Camaro", 2021);
        //Car car2 = new Car("Ford", "Mustang", 2022);
        Car car2 = new Car(car1);

        //if you want to copy, can't do car2 = car1 b/c now they're the same exact car b/c they have the same memory address
        //we need to copy all the attributes over instead
        //copying car 1 to car2
        //car2.copy(car1);

        //Memory Addresses
        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());


    }

}
