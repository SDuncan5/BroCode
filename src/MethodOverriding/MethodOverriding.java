package MethodOverriding;

public class MethodOverriding {

    public static void main(String[] args) {

        // method overriding = Declaring a method in a sub class
        //                     which is already present in a parent class.
        //                     Done sso that a child class can give its own implementation

        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.speak();
        dog.speak();

    }

}
