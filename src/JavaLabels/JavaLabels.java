package JavaLabels;

import javax.swing.*;

public class JavaLabels {

    public static void main(String[] args) {
        // JLabel = a GUI display area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("GamerJuice.jpg");

        JLabel label = new JLabel(); //create a label
        label.setText("GamerJuice"); //can set text of label like w/ .setText or like:
        //JLabel label = new JLabel("GamerJuice"); when you instantiate
        label.setIcon(image);



        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setTitle("Gamer Juice");
        frame.add(label);


    }

}
