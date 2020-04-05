/*
 * this product is an unlicensed as I am to drive
 * 
 * but hey, enjoy it anyway!
 */
package Collections;

/**
 *
 * @author Scott
 */
public enum Tracks {
       
    TRACK_ZERO(0, "Start Theme", "/music/Ev23.wav");
    
    private final int number;
    private final String description;
    private final String filePath;
    
    private Tracks(int number, String description, String filePath){
        
        this.number = number;
        this.description = description;
        this.filePath = filePath;
    }
    
    public int getNumber(){
        return this.number;
    }
    
    public String getDescription() {
        return this.description;
    }

    public String getFilePath() {
        return this.filePath;
    }
    
}
