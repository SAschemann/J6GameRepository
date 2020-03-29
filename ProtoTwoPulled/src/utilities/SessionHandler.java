/*
 * this product is an unlicensed as I am to drive
 * 
 * but hey, enjoy it anyway!
 */
package utilities;
import java.io.*;
import prototwopulled.ProtoTwo;
import prototwopulled.UserPlayer;

/**
 *
 * @author Scott
 */

public class SessionHandler {
    

    public SessionHandler(){
    }    
  //write a method to get player info and write it to a file

    /**
     *
     */
    public void load(){
        UserPlayer temp;
        try{
            FileInputStream inputFile = new FileInputStream("./data.sec");
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
        UserPlayer temp = ProtoTwo.CUR_PLAYER;
        try{
            FileOutputStream outputFile = new FileOutputStream("./data.sec");
            ObjectOutputStream objectOut = new ObjectOutputStream(outputFile);
            objectOut.writeObject(temp);
            objectOut.close();
            outputFile.close();
        }
        catch(FileNotFoundException e){
            System.out.print("Cannot create a file at that location");
        }
        catch(SecurityException e){
            System.out.print("Permission Denied!");
        }
        catch(IOException e){
            System.out.println("Error 203");
        } 
   }
}



    