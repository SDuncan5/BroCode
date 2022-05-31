import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AnonymousObjects {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        ArrayList<JLabel> deck = new ArrayList<JLabel>();

        /*ImageIcon AC = new ImageIcon("src\\PNG-cards-1.3\\ace_of_clubs.png");
        JLabel ACLabel = new JLabel(AC);
        deck.add(ACLabel);

        ImageIcon twoC = new ImageIcon("src\\PNG-cards-1.3\\2_of_clubs.png");
        JLabel twoCLabel = new JLabel(twoC);
        deck.add(twoCLabel); */
        //it's gonna be a lot of work to keep adding each one by one, so we make a nameless obj

        deck.add(new JLabel(new ImageIcon("src\\PNG-cards-1.3\\ace_of_clubs.png")));


        frame.add(deck.get(0));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

    }

}
