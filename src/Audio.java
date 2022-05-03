import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Audio {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner scan = new Scanner(System.in);

        File file = new File("No Turning Back (Instrumental) - NEFFEX.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream); //need to open the clip

        //start method begins playing audio file (also have stop, reset, quit)
        //clip.start();
        //at first it attempts to play in a background thread, but as soon as it runs out of code, the audio terminates
        //so, we need to keep our program open and running
        //we could create a GUI system that will end music when X is clicked or create a scanner waiting for user input

        String response = "";

        while (!response.equals("Q")) {
            System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
            System.out.println("Enter your choice: ");

            response = scan.next();
            response = response.toUpperCase();

            switch (response) {
                case "P":
                    clip.start();
                    break;
                case "S":
                    clip.stop();
                    break;
                case "R":
                    clip.setFramePosition(0);
                    //or do clip.setMicrosecondPosition(0);
                    break;
                case "Q":
                    clip.stop();
                    break;
                default:
                    System.out.println("That's not a valid input!");
            }

        }

        System.out.println("Byeeee!");

    }

}
