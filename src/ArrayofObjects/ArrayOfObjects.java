package ArrayofObjects;

public class ArrayOfObjects {

    public static void main(String[] args) {

        //Food[] refrigerator = new Food[3]; //can hold 3 Food items

        Food food1 = new Food("pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hotdog");

        //other way to initiate array when you know all your values already
        Food[] refrigerator = {food1, food2, food3};

        //store these into the array
        //refrigerator[0] = food1;
        //refrigerator[1] = food2;
        //refrigerator[2] = food3;

        //by default this will return the address of the object (w/o the .name)
        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);


    }

}
