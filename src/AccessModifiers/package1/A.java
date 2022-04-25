package AccessModifiers.package1;

public class A {

    protected String protectedMessage = "This is protected.";
    //accessible to a different class in a different package as long as that class is a subclass of the class that contains the protected var

    public static void main(String[] args) {

        //C c = new C();
        //System.out.println(c.publicMessage);

        B b = new B();
        //System.out.println(b.privateMessage);

    }

    //public: visible in all classes in all packages
    //protected: visible to all classes in the same package or classes in other packages that are a subclass
    //default: visible to all classes in the same package
    //private: visible only in the same class

}
