public class Wrapper {

    public static void main(String[] args) {

        //wrapper class = provides a way to use primitive data types as reference data types
        //reference data types contain useful methods (reference takes longer tho)
        //can be used w/ collections (ex. ArrayList)

        //primitive     //wrapper
        //---------     //-------
        // boolean      Boolean
        // char         Character
        // int          Integer
        // double       Double

        // autoboxing = the automatic conversion that the Java compilier makes between the primitive types and their corresponding object wrapper classes
        // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive

        //primitive values are faster than reference. So w/ many vals use primitive

        //autoboxing
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Joe"; //String is already a reference type, so it's capital

        //unboxing (convert wrapper to primitive)
        if (a == true) {
            System.out.println("This is true");
        }
        if (b == '@') {
            System.out.println("This is true");
        }


    }
}
