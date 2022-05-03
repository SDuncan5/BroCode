import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \nViolets are blue \nBooty booty booty \nRockin' everywhere!");
            writer.append("\n(A poem by Bro)");
            writer.close(); //make sure to close the writer when you're done
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
