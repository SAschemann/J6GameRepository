/*
 * this product is an unlicensed as I am to drive
 * 
 * but hey, enjoy it anyway!
 */
/*
 * A class to play audio files.  The code orignated from 
 * https://www.geeksforgeeks.org/play-audio-file-using-java/
 * and was modified to fit this application requirement.
 * 
 */
package utilities;

import Collections.Tracks;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * @author https://www.geeksforgeeks.org/play-audio-file-using-java/
 * @author Scott Underwood 
 */
public class AudioPlayer{
    
    private Long clipPosition; 
    private Clip clip; 
    private AudioInputStream audioInputStream;
    private String track; 
    private FloatControl gainControl;
    private boolean isPlaying;

 
    public AudioPlayer() throws UnsupportedAudioFileException, IOException,
            LineUnavailableException {} 

	
//Set Methods ==============================================================
    
    /**
     * Set the track to be played based file path stored in the soundTracks Enum
     * If a trak number is given does not exist in the enum the track will be
     * set to the first track in the enum
     * @param trackNum -  the track to be played
     */
    public void setTrack(int trackNum){
        
        if((trackNum < 0) || (trackNum > Tracks.values().length)){
            this.track = Tracks.values()[0].getFilePath();
        }
        else{
            this.track = Tracks.values()[trackNum].getFilePath();
        }
    }
    /**
     * Set track by the giving the direct path to the track 
     * @param track - file path of the desired track
     */
    public void setTrack(String track){
        this.track = track;
    }
  
 //Get Methods ==============================================================  
    
    /**
     * Get the track path of the currently loaded track
     * @return track -  current track's file path
     */
    public String getTrackPath(){
        return this.track;
    }
    
    /**
     * Get the clip currently loaded into the AudioPlayer
     * @return clip -  current clip
     */
    public Clip getClip(){
        return this.clip;
    }
    
    /**
     * Gets the play status of the audio player
     * @return true if currently playing, otherwise false
     */
    public boolean getPlayStatus(){
        return this.isPlaying;
    }
    
 //Utility Methods ============================================================= 

    /**
     * Loop the current track 
     */
    public void play(){
        this.isPlaying = true;
        try{
            audioInputStream = AudioSystem.getAudioInputStream(this.getClass()
                    .getResource(track)); 
            clip = AudioSystem.getClip(); 
            clip.open(audioInputStream); 
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            gainControl = (FloatControl) clip.getControl(FloatControl
                    .Type.MASTER_GAIN);
            clip.start();
        }
        catch(UnsupportedAudioFileException| IOException | 
                LineUnavailableException e){
            System.out.println("Error 119");
        } 
    } 

    /**
     * Stops the currently playing clip and records the clip's position
     */ 
    public void pause(){ 
        
        clipPosition = clip.getMicrosecondPosition(); 
	clip.stop(); 
        this.isPlaying = false;
    } 
    
    /**
     * Plays the currently loaded track only once
     */
    public void playOnce(){
        
        this.isPlaying = true;
        try{
            audioInputStream = AudioSystem.getAudioInputStream(this.getClass()
                    .getResource(track)); 	
            clip = AudioSystem.getClip(); 
            clip.open(audioInputStream); 
            clip.start();
        }
        catch(UnsupportedAudioFileException| IOException | 
                LineUnavailableException e){
            System.out.println("Error 120");
        }
        this.isPlaying = false;
    } 

    /**
     * Plays the provided track one time
     * @param trackNum
     */
    public void playOnce(int trackNum){
        
        this.isPlaying = true;
        try{
            this.setTrack(trackNum);
            audioInputStream = AudioSystem.getAudioInputStream(this.getClass()
                    .getResource(track)); 	
            clip = AudioSystem.getClip(); 
            clip.open(audioInputStream); 
            clip.start();
        }
        catch(UnsupportedAudioFileException| IOException | 
                LineUnavailableException e){
            System.out.println("Error 121");
        }  
        this.isPlaying = false;
    } 
    
    /**
     * Starts playing currently loaded clip from a position recorded in the 
     * pause method. This method will result in the the clip playing in a loop 
     * from the position it was restarted.
     */
    public void resumeAudio(){ 
        
        this.isPlaying = true;
        try {
            clip.close();
            resetAudioStream();
            clip.setMicrosecondPosition(clipPosition);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | 
                LineUnavailableException ex) {
            System.out.println("122");}
    } 
    
    /**
     * Resets the audio stream and sets clip to loop. This method does not start
     * the playback.
     * @throws UnsupportedAudioFileException
     * @throws IOException
     * @throws LineUnavailableException 
     */
    public void resetAudioStream() throws UnsupportedAudioFileException, 
            IOException, LineUnavailableException { 
        
        this.isPlaying = true;
        audioInputStream = AudioSystem.getAudioInputStream(new File(track).
                getAbsoluteFile()); 
            clip.open(audioInputStream); 
            clip.loop(Clip.LOOP_CONTINUOUSLY); 
    }  
	
    /**
     * Stops the playing clip and resets the clip position.
     * @throws UnsupportedAudioFileException
     * @throws IOException
     * @throws LineUnavailableException 
     */
    public void stop() throws UnsupportedAudioFileException, IOException, 
            LineUnavailableException {

        clipPosition = 0L; 
        clip.stop(); 
        clip.close(); 
        this.isPlaying = false;
    } 
 
    /**
     * Closes the audio input stream
     * @throws IOException 
     */
    public void shutDown() throws IOException{
        audioInputStream.close();
    }
    
    /**
     * Adjust the volume by decibels given
     * @param decibles the amount the volume is to be adjusted.
     */
    public void volume(float decibles){
        if(this.clip != null)
            gainControl.setValue(decibles);
    }
    
    /**
     * Plays the sound effect once
     * @param trackNums an array of tracks to be played in order
     */
    public void playEffect(int[] trackNums){
        
        this.isPlaying = true;
        try{      
            for(int i=0;i<trackNums.length;i++){
                this.setTrack(trackNums[i]);
                audioInputStream = AudioSystem.getAudioInputStream(
                        this.getClass().getResource(track)); 	
                clip = AudioSystem.getClip(); 
                clip.open(audioInputStream); 
                clip.start();
            }
        }
        catch(UnsupportedAudioFileException| IOException | 
                LineUnavailableException e){
            System.out.println("Error 122");
        } 
        this.isPlaying = false;
    } 
}