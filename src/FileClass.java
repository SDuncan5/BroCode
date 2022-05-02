import java.io.File;

public class FileClass {

    public static void main(String[] args) {

        // file = An abstract representation of file and directory pathnames

        File file = new File("secret_message.txt");

        //if file isn't in the project, include entire path
        //File file = new File("C:\\Users\\Sarah Duncan\\Documents\\test_doc.txt");
        //need double backslashes for escape sequence
        //forward slashes also work


        //checking if the file exists or not
        if(file.exists()){
            System.out.println("That file exists! :O!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.isFile()); //if it's a file and not a folder
            //can also delete file w/ file.delete();
            System.out.println(file.lastModified());
            //ms since the epoch (jan 1st, 1970)
        }
        else{
            System.out.println("That file doesn't exist :(");
        }

    }

}
