package DynamicPolymorphism;

import java.util.Scanner;

public class DynamicPolymorphism {

    public static void main(String[] args) {

        // polymorphism =   many shapes/forms
        // dynamic =        after compilation (during runtime)
        // the ability of the object to take many shapes/forms while running

        //ex. A corvette is a: corvette, and a car, and a vehicle, and an object

        //user can pick dog or cat during runtime. Before runtime we don't know if dog or cat
        //can make a space for the object even if we don't know what object type we want yet

        Scanner scan = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you want?");
        System.out.print("(1=dog) or (2=cat): ");
        int choice = scan.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        } else {
            animal = new Animal();
            System.out.println("That choice was invalid.");
            animal.speak();
        }

    }

}
