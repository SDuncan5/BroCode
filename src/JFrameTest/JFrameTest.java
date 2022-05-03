package JFrameTest;

import javax.swing.*;
import java.awt.*;

public class JFrameTest {

    public static void main(String[] args) {

        // JFrame = a GUI window to add components to

        /*JFrame frame = new JFrame();    //creates a frame
        frame.setTitle("Much JFrame");    //sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits out of application
        frame.setResizable(false);  //prevent frame from being resized
        frame.setSize(420, 420); //sets the x-dimension and y-dimension of frame
        //frame initially not visible, so need to set to true
        frame.setVisible(true); //make from visible

        ImageIcon image = new ImageIcon("dogeface.png"); //create an ImageIcon
        frame.setIconImage(image.getImage()); //change icon of frame
        //frame.getContentPane().setBackground(Color.cyan);   //change color of background
        //frame.getContentPane().setBackground(new Color(50,99,99));   //can do hexidecimal or rgb
        frame.getContentPane().setBackground(new Color(0x326363));   //w/ hex now */

        //MyFrame myFrame = new MyFrame();

        //don't necessarily need a name if you don't plan on using the name
        new MyFrame();
        //however, if you need to make some changes within the class you may need a name



    }


}
