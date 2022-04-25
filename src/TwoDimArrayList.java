import java.util.ArrayList;

public class TwoDimArrayList {

    public static void main(String[] args) {

        // 2D ArrayList = a dynamic list of lists
        // You can change the size of these lists during runtime

        //need to use wrapper class to store things in ArrayList

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");


        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffee");

        //adding separate ArrayLists to ArrayList of ArrayLists
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList.get(0));
        //getting first val from first list
        System.out.println(groceryList.get(0).get(0));
        //getting 2nd val from 3rd list
        System.out.println(groceryList.get(2).get(1));
    }

}
