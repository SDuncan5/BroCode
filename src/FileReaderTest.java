import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

    public static void main(String[] args) {

        //  FileReader = read the contents of a file as a stream of characters. One by one
        //               read() returns an int value which contains the byte value
        //               when read() returns -1, there is no more data to be read

        //must surround w/ try and catch b/c it's considered dangerous code
        try {
            FileReader reader = new FileReader("art.txt");
            int data = reader.read(); //reading each char of a file
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close(); //remember to close reader

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
