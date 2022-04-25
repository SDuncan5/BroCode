import java.util.Scanner;

public class Maths {

    public static void main(String[] args) {

        //find hypotenuse of a triangle


        double a;
        double b;
        double c;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter side a: ");
        a = scan.nextDouble();

        System.out.println("Enter side b: ");
        b = scan.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Hypotenuse is " + c);

        scan.close();


    }


}
