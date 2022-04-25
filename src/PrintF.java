public class PrintF {

    public static void main(String[] args) {

        // printf() = 	an optional method to control, format, and display text to the console window
        //				two arguments = format string + (object/variable/value)
        //				% [flags] [precision] [width] [conversion-character]

        //"print format"
        // %b = boolean
        // %c = character
        // %s = String
        // %d = integer "digit"
        // %f = double  "float/double"

        //System.out.printf("%d This is a format string", 123);

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        // [conversion-character]
        /*System.out.printf("%b", myBoolean);
        System.out.printf("%c", myChar);
        System.out.printf("%s", myString);
        System.out.printf("%d", myInt);
        System.out.printf("%f", myDouble); */

        //[width]
        // minimum number of characters to be written as output
        System.out.printf("Hello %10s\n", myString); //prints a min of 10 chars for myString (will have empty space if String doesn't take it up

        //[precision]
        //sets number of digits of precision when outputting floating-point values
        System.out.printf("You have this much money %.2f\n", myDouble); //.2 limits to 2 digits after decimal

        //[flags]
        //adds an effect to output based on the flag added to the format specifier
        // - : left-justify     (bc right-justify by default)
        // + : output a plus ( + ) or minus ( - ) sign for numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000
        System.out.printf("You have this much money %,f", myDouble);


    }

}
