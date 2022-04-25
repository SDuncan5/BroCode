import java.util.Random;

public class Rando {

    public static void main(String[] args) {

        Random random = new Random(); //gives us access to random instance

        //int x = random.nextInt(6)+1; //limiting scale (If you type 6 in here it'll be btwn 0 and 5, so we add 1)
        double y = 6 * random.nextDouble(); //initially gives random val btwn 0 and 1 (*6 is btwn 0 and 6 I believe)
        //boolean z = random.nextBoolean(); //gives true or false

        System.out.println(y);

    }

}
