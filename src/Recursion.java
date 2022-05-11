import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {

        // recursion = the process in which a method calls itself continuously
        // a method that calls itself is called a recursive method
        // useful for factorials, transversing trees, and simplifying a complex task

        /*Scanner scan = new Scanner(System.in);
        System.out.println("How many times do you want to say hello?: ");
        int num = scan.nextInt();

        HelloWorld(num); */

        Scanner scan = new Scanner(System.in);
        System.out.println("How far do you want to walk (meters)?: ");
        int distance = scan.nextInt();

        takeAStep(0, distance);

    }

    /*static void HelloWorld(int n){
        if(n>0) {
            //we want to set up a base case so we don't get infinite loop
            System.out.println("Hello World! " + n);
            n--;
            HelloWorld(n);
        }

    } */

    static void takeAStep(int i, int distance) {

        if (i < distance) {
            i++; //taking a step of a meter
            System.out.println("*You take a step* : " + i + " meter(s)");
            takeAStep(i, distance);
        } else {
            System.out.println("You are done walking! :)");
        }

    }

}
