public class TwoDimArrays {

    public static void main(String[] args) {

        // 2D array = an array of arrays

        /*String[][] cars = new String[3][3]; //3 arrays w/ 3 elements each

        cars[0][0] = "Camaro"; //row 0, col 0
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Mustang"; //row 1, col 0
        cars[1][1] = "Ranger";
        cars[1][2] = "F-150";
        cars[2][0] = "Ferrari"; //row 2, col 0
        cars[2][1] = "Lambo";
        cars[2][2] = "Tesla"; */

        //alt way to allocate values
        String[][] cars = {{"Camaro", "Corvette", "Silverado"},
                {"Mustang", "Ranger", "F-150"},
                {"Ferrari", "Lambo", "Tesla"}};

        //displaying all the elements in the array
        for (int i = 0; i < cars.length; i++) { //cars.length would be the num of arrays (num of rows)
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) //goes through each value in the row (each array)
                System.out.print(cars[i][j] + " ");
        }


    }

}
