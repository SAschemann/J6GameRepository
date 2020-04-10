/*
 * this product is an unlicensed as I am to drive
 * 
 * but hey, enjoy it anyway!
 */
package utilities;
import java.io.*;
import prototwopulled.*;
import java.lang.*;

/**
 *
 * @author Scott
 */

public class SessionHandler implements Serializable {
    
    //default contructor
    public SessionHandler(){
    }
    
    //loads saved character file
    public static void load(){
        try{
            UserPlayer load = new UserPlayer();
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("test.txt"));
            load.updateWeapon((String) in.readObject());
            load.setHP((int) in.readObject());
            load.updatePosition((String) in.readObject());
            load.setPip((Boolean) in.readObject());
            in.close();
            GameGUI.internalPlayer = load;
        }
        catch(FileNotFoundException e ){
            System.err.print("data.sec not found");
        }
        catch(IOException e){
            System.out.println("Error 201" + e);
        }
        catch(ClassNotFoundException e){
            System.out.println("Error 202");
        }
    }

    
    //saves the current state of the character to a file
    public void save() {
        try{
            UserPlayer temp = GameGUI.internalPlayer;
            System.out.println(temp.getPlayerPosition());
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test.txt"));
            out.writeObject(temp.getCurWeapon());
            out.writeObject(temp.getCurHP());
            out.writeObject(temp.getPlayerPosition());
            out.writeObject(temp.inquirePipBoy());
            out.close();
        }   
        catch(FileNotFoundException e){
            System.out.print("Cannot create a file at that location");
        }
        catch(SecurityException e){
            System.out.print("Permission Denied!");
        }
        catch(IOException e){
            System.out.println("\nError 203:\n\t" + e); e.printStackTrace();
        } 
    }
}



    