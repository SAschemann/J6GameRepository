/*
This is the class which contains the main method. This creates the main menu and sets it to visible.
 */
package prototwopulled;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
/**
 *
 * @author asche
 */
public class ProtoTwo {

    public static UserPlayer CUR_PLAYER = new UserPlayer();
    public static void main(String[] args) {
        
        ProtoGUI newGUI = new ProtoGUI();
        newGUI.setVisible(true);
    }
//testing not being able to push comment     
}
