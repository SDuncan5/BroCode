package VariableScope;

import java.util.Random;

public class DiceRoller {

    Random random;          //these are global variables declared outside the method
    int number;             //visible to all parts of DiceRoller class

    DiceRoller() { //constructor
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(6) + 1; //add a +1 b/c it'll go from 0-5
        System.out.println(number);
    }

}
