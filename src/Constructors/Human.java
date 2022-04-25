package Constructors;

public class Human {

    String name;
    int age;
    double weight;

    //our constructor
    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    //this keyword is associated w/ the current object. Think of it as human.name

    //how to access an object's attributes from within it's class itself. Utilize this keyword
    void eat() {
        System.out.println(this.name + " is eating.");
    }

    void drink() {
        System.out.println(this.name + " is drinking *burp*");
    }

}
