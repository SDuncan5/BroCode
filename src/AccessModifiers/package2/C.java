package AccessModifiers.package2;

public class C { //must be public for this to be called in A

    public String publicMessage = "This is public";
    //default modifier is only visible within the same package
    //default: visible in class and package
    String defaultMessage = "This is the default"; //which classes can see this which has no access modifiers
    //public: visible in class, package, subclass
    //visible to any package within the project folder

    //protected String protectedMessage = "This is protected.";
    //accessible to a different class in a different package as long as that class is a subclass of the class that contains the protected var

    //private String privateMessage = "This is private";
    //only visible to the class it's contained in

}
