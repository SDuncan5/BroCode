package StaticKeyword;

public class Friend {

    //all instances of the friend class have to share this one variable
    static int numberOfFriends;
    String name;

    Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }

    static void displayFriends() {
        System.out.println("You have " + numberOfFriends + " friends.");
    }

}
