package CustomExceptions;

import java.util.Scanner;

public class CustomExceptions {

    public static void main(String[] args) {
        // exception = an event, after execution, that disrupts the normal flow of the program
        // ex. ArithmeticException,ArrayIndexOutOfBoundsException,FileNotFoundException

        // user defined exceptions = custom exceptions
        // ex.DuplicateEmail, InvalidCreditException, AgeException

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("A problem occurred: " + e);
        }
    }


    static void checkAge(int age) throws AgeException {

        //gonna check the condition that throws the exception
        if (age < 18) {
            throw new AgeException("\nYou must be 18+ to sign up");
        } else {
            System.out.println("You are now signed up!");
        }

    }


}
