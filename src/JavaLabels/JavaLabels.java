package JavaLabels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JavaLabels {

    public static void main(String[] args) {
        // JLabel = a GUI display area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("GamerJuiceResize.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel(); //create a label
        label.setText("Gamer Juice"); //can set text of label like w/ .setText or like:
        //JLabel label = new JLabel("GamerJuice"); when you instantiate
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP);  //set text TOP, CENTER, BOTTOM of imageicon
        label.setForeground(new Color(0x000000)); //set font color of text
        //or label.setForeground(new Color(0,0,0));
        label.setFont(new Font("Comic Sans MS", Font.PLAIN, 50)); //set font of text
        label.setIconTextGap(10); //set gap of text to image
        //can also set this to neg number to pull it closer
        label.setBackground(new Color(0x666d6b)); //set background color
        label.setOpaque(true); //display background color
        label.setBorder(border);
        //the below makes it so the image and text stays in the center
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon + text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal alignment of icon + text within label
        //label.setBounds(100, 100, 350, 350); //set x and y position within frame as well as dimensions


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500, 500);
        //frame.setLayout(null); //nothing is shown b/c we need to set the bounds of the label
        frame.setVisible(true);
        frame.setTitle("Gamer Juice");
        frame.setIconImage(image.getImage());
        frame.add(label);
        //make sure to add all components before using pack or it won't work
        frame.pack(); //will resize size of frame for the components that you have


    }

}
