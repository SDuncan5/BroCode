package JButtonTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame() {

        ImageIcon icon = new ImageIcon("thumbs-up.png");
        ImageIcon icon2 = new ImageIcon("noondeflect.PNG");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 250, 200, 150);
        label.setVisible(false); //don't want this is appear until after button pressed


        button = new JButton();
        button.setBounds(125, 100, 250, 175);
        button.addActionListener(this);
        //button.addActionListener(e -> System.out.println("ayo?")); //lambda is like a shortcut
        button.setText("I'm a button!");
        button.setFocusable(false); //should get rid of box around text
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER); //changes text position
        button.setVerticalTextPosition(JButton.BOTTOM); //changes text position
        button.setFont(new Font("Comic Sans MS", Font.BOLD, 25)); //changes font
        button.setIconTextGap(-5);
        button.setForeground(Color.cyan); //changes text color
        button.setBackground(Color.lightGray); //changes background color of button
        button.setBorder(BorderFactory.createEtchedBorder()); //change border of button
        //button.setEnabled(false); //disables a button

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); //not using layout manager
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);

    }


    @Override
    public void actionPerformed(ActionEvent e) { //now this frame will listen for events
        if (e.getSource() == button) {
            //System.out.println("ayo?");
            //button.setEnabled(false); //disables the button after clicked once
            label.setVisible(true);
        }


    }
}
