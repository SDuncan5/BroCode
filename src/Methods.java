public class Methods {

    public static void main(String[] args) {

        //method = a block of code that is executed whenever it is called upon
        String name = "Bro";
        int age = 21;

        hello(name, age);

        int x = 3;
        int y = 4;

        //int z = add(x,y);
        System.out.println(add(x, y));

    }

    static void hello(String name, int age) {
        System.out.println("Hello " + name);
        System.out.println("You are " + age);
    }
    //we're calling hello method from static method main, so it needs to be static

    static int add(int x, int y) {

        return x + y;
    }

}
