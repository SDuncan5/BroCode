import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args) {

        // HashMap implements the Map interface (need import)
        // HashMap is similar to ArrayList, but w/ key-value pairs
        // stores objects, needs to use Wrapper class (ex. Integer instead of int)
        // ex: (name, email),(username,userID),(country,capital)

        HashMap<String, String> countries = new HashMap<String, String>();

        //add a key and value
        countries.put("USA", "Washington DC");
        countries.put("India", "New Delhi");
        countries.put("Russia", "Moscow");
        countries.put("China", "Beijing");

        //countries.remove("USA"); //can remove keys

        //System.out.println(countries.get("Russia")); //returns this key's value
        //countries.clear(); //erases all the country data
        //System.out.println(countries.size()); //size of hashmap
        //countries.replace("USA", "Detroit");
        //System.out.println(countries.containsKey("England")); //if this is a key in the hashmap
        //System.out.println(countries.containsValue("Beijing")); //if this is a value in the hashmap
        //System.out.println(countries);

        for (String i : countries.keySet()) { //iterates once per each key in our hashmap
            System.out.print(i + "\t= "); //key
            System.out.println(countries.get(i)); //value
        }


    }

}
