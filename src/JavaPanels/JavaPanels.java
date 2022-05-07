package JavaPanels;

import javax.swing.*;
import java.awt.*;

public class JavaPanels {

    public static void main(String[] args) {

        // JPanel = a GUI component that functions as a container to hold other components

        //image
        ImageIcon icon = new ImageIcon("northmexico.PNG");

        //label we can add to a panel or frame
        JLabel label = new JLabel();
        label.setText("owo");
        label.setIcon(icon);
        //label.setVerticalAlignment(JLabel.BOTTOM);
        //label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(100, 100, 300, 75);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(new BorderLayout());

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(null);


        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        //greenPanel.setLayout(new BorderLayout()); //the new BorderLayout is the same one the JFrame uses (center left default)
        greenPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        greenPanel.add(label); //in panels, components are added first to the top-center and then after the first row is filled it goes to second row
        //redPanel.add(label);
        //bluePanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

    }

}
