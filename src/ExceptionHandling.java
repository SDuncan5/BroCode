import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        //exception =   an even that occurs during the execution of a program that,
        //              disrupts the normal flow of instructions
        //unexpected events that will disrupt ur program (ex. dividing by 0 -> arithmetic exception)

        //surround dangerous code w/ a try block
        Scanner scan = new Scanner(System.in);

        try {

            System.out.println("Enter a whole number to divide: ");
            int x = scan.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scan.nextInt();

            int z = x / y;

            System.out.println("Result: " + z);
        } catch (ArithmeticException e) { //put the type of exception in the parentheses
            System.out.println("You can't divide by zero! IDIOT!");
        } catch (InputMismatchException e) {
            System.out.println("You've gotta enter in an integer buddy.");
        } catch (Exception e) { //will handle all types of exceptions, but better to handle specific exceptions so use as last resort/final say
            System.out.println("Something went wrong");
        } finally { //this is executed whether an exception was caught or not. Always is executed
            System.out.println("This will always print");
            scan.close(); //often used to close any scanners or files open as well
        }

    }

}
