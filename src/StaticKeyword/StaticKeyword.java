package StaticKeyword;

public class StaticKeyword {

    public static void main(String[] args) {

        // static = modifier. A single copy of a variable/method is created and shared.
        //          The class "owns" the static member
        //          Anything the class owns is shared by all instances of that class

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");


        //we can call the numberOfFriends var even w/o an object created b/c it's static
        //System.out.println(Friend.numberOfFriends);
        //all instances of Friend will have the same numberOfFriends

        //System.out.println(friend1.numberOfFriends);
        //you can do this ^ but it's best practice to type in the name of the class that owns the static member

        //once again, with static methods you call the name of the Object class
        Friend.displayFriends();


        //unrelated example. Math.round() is a static method
        //we don't do Math math = new Math()
        //Math.round(a);

    }

}
