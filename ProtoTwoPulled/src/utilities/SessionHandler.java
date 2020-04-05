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
    

    public SessionHandler(){
    }    
  //write a method to get player info and write it to a file

    /**
     *
     */
    public void load(){
        UserPlayer temp = null;
        String filename = "./data.txt";
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
  //write another method to read data from a file and insert it into CUR_Player
    public void save(){
        UserPlayer temp = GameGUI.internalPlayer;
        System.out.println(temp.getPlayerPosition());
        String filename = "./data.txt";
        try{
            //FileOutputStream outputFile = new FileOutputStream(filename);
            ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(filename));
            objectOut.writeObject(temp);
            objectOut.close();
            //outputFile.close();
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



    