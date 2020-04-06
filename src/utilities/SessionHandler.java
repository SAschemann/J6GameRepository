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
    /* commented out to temporarily to push the working save() functionality to repo
    public void load(){
        try{
            
            FileInputStream inputFile = new FileInputStream(filename);
            ObjectInputStream objectIn =  new ObjectInputStream(inputFile);
            temp = (UserPlayer)objectIn.readObject();
            ProtoTwo.CUR_PLAYER = temp;
            objectIn.close();
            inputFile.close();    
        }
        catch(FileNotFoundException e ){
            System.err.print("data.sec not found");
        }
        catch(IOException e){
            System.out.println("Error 201");
        }
        catch(ClassNotFoundException e){
            System.out.println("Error 202");
        }
    }
    *///end of load()

    
    //saves the current state of the character to a file
    public void save() {
        try{
            UserPlayer temp = GameGUI.internalPlayer;
            System.out.println(temp.getPlayerPosition());
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test.txt"));
            out.writeObject(temp.getPlayerPosition());
            out.writeObject(temp.getCurHP());
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

    public static void load(){}
    
    
}



    