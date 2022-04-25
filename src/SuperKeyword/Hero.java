package SuperKeyword;

public class Hero extends Person {

    String power;

    Hero(String name, int age, String power) {
        super(name, age);   //sending name and age to superclass (Person)
        this.power = power;

        //this refers to this class we're in
        //super refers to the superclass/parent class

    }

    //performs the superclass's (Person's) toString method while tacking on more
    public String toString() {
        return super.toString() + this.power;
    }

}
