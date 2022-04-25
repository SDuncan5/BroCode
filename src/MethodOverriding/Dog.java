package MethodOverriding;

public class Dog extends Animal {

    //overriding the Animal speak method
    //the @override tells others that this is an override method
    @Override
    void speak() {
        System.out.println("The dog barks.");
    }

}
