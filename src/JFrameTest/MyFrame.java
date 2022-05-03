package JFrameTest;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){

        this.setTitle("Much JFrame");    //sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits out of application
        this.setResizable(false);  //prevent frame from being resized
        this.setSize(420, 420); //sets the x-dimension and y-dimension of this
        //this initially not visible, so need to set to true
        this.setVisible(true); //make from visible

        ImageIcon image = new ImageIcon("dogeface.png"); //create an ImageIcon
        this.setIconImage(image.getImage()); //change icon of frame
        //this.getContentPane().setBackground(Color.cyan);   //change color of background
        //this.getContentPane().setBackground(new Color(50,99,99));   //can do hexidecimal or rgb
        this.getContentPane().setBackground(new Color(0x326363));   //w/ hex now

    }


}
