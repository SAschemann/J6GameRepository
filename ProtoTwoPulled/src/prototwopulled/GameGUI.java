/*
    This is the class for the game gui. It has four clickable options and a text area for setting text. 
    There are two nested classes here, and were nested so that they could change the prompts and options texts.
*/
package prototwopulled;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import utilities.SessionHandler;
import java.io.*;
import java.lang.reflect.*;


public class GameGUI extends javax.swing.JFrame {

    //Variable declarations
    public static UserPlayer internalPlayer;     
    String option;
    //Declare a VaultLogic object to call that classes method on
    VaultLogic vLogic = new VaultLogic();
    
    //**Declared an object of type session handler to call the session ahndler on
    SessionHandler sesh = new SessionHandler();
    
    //grabs the boolean variable startingState from ProtoGUI used in determining
    //whether a new game is being created or loaded
    
    //New Game Constructor
    public GameGUI(UserPlayer player) {
            initComponents();
            setLocation(415,100);
            setResizable(false);
            jLabel1.setVisible(false);
            //set internalplayer variable to the player variable which is passed in
            internalPlayer = player;
            //declare a vaultrooms object to call the starting method on
            VaultRooms vRooms = new VaultRooms();
            //this method call using the vRooms object created here sets the prompt and options for the first "room" at the start of the game.
            vRooms.start();
    }
    
    //Load game constructor, same as new game constructor but loads game functionality
    public GameGUI(UserPlayer player, String str){
            //SessionHandler.load();
            //System.out.println(internalPlayer.getPlayerPosition());
            initComponents();
            setLocation(415,100);
            setResizable(false);
            
            //set internalplayer variable to the elements in the file passed in
            SessionHandler.load();
            
            //this if statement checks the player object to see if they have the pipboy equipped and then hides or displays the pipboy accordingly 
            if(internalPlayer.inquirePipBoy() == false){
                jLabel1.setVisible(false);
            } else{
                jLabel1.setVisible(true);
            }

            //declare a vaultrooms object to call the starting method on
            VaultRooms vRooms = new VaultRooms();
            //declare a vaultlogic object to call the starting method on
            VaultLogic vLogic = new VaultLogic();
            
            
            
            //This SOP statement prints to the console to check for the player position            
            System.out.println("Before switch statement + " + internalPlayer.getPlayerPosition() + internalPlayer.inquirePipBoy());
            
            //switch statement that sets prompt and options after the user chooses to load a save, runs off internalplayer object which is 
            //the loaded player object from the sessionhandler.load() method
            switch (internalPlayer.getPlayerPosition()){
                
                //each room will need a case, but that's not so bad for a save and load feature. 
                case "firstDeadEnd":
                    //this sop statement checks to make sure we're getting inside the switch statement
                    System.out.println("Inside switch statement");
                    //this method call sets the prompt and option for the firstDeadEndRoom
                    vLogic.firstDeadEndRoom();
                break;
                
                case "firstHallway":
                    vLogic.firstHallway();
                break;
                
                case "firstTerminalPartOne":
                    vLogic.firstTerminalPartOne();
                break;
                
                case "deadBody":
                    vLogic.inspectDeadBody();
                break;
                
                case "deadBodyEquipped":
                    vLogic.inspectDeadBodyHasPipBoy();
                break;
                
                case "startCont":
                    vLogic.startCont();
                break;
                
                case "endOfHallDoor":
                    vLogic.endOfHallDoor();
                break;
                
                case "bunkhouse":
                    vLogic.bunkhouse();
                break;
                
                case "showerRoom":
                    vLogic.showerRoom();
                break;
                
                case "firstTerminalPartTwo":
                    vLogic.firstTerminalPartTwo();
                break;
                
                case "bunkroom":
                    vLogic.bunkroom();
                break;
                
                case "maintenanceCloset":
                    vLogic.maintenanceCloset();
                break;
                
                case "upStairsLanding":
                    vLogic.upStairsLanding();
                break;
                
                case "arcingWires":
                    vLogic.arcingWires();
                break;

            }//end of loading switch statement
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Escape Vault 23");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 255, 0));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jTextArea1.setFocusable(false);
        jTextArea1.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 255, 0));
        jButton1.setBorder(null);
        jButton1.setFocusable(false);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 255, 0));
        jButton2.setBorder(null);
        jButton2.setFocusable(false);
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 255, 0));
        jButton3.setBorder(null);
        jButton3.setFocusable(false);
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 255, 0));
        jButton4.setBorder(null);
        jButton4.setFocusable(false);
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 51));
        jLabel1.setText("Pip Boy: Equipped");
        jLabel1.setFocusable(false);
        jLabel1.setOpaque(true);

        jBSave.setText("Save");
        jBSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBSave)
                        .addGap(157, 157, 157)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSave))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //This method updates the game gui's prompt
    public  void setPrompt(String prompt){
        jTextArea1.setText(prompt);
    }
    
    //This method sets all options. It will be possible to write methods for setting any number of options and hiding the others, based on what that particular
    //"room" requires
    public void setAllOptions(String Op1, String Op2, String Op3, String Op4){
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton1.setText(Op1);
        jButton2.setText(Op2);
        jButton3.setText(Op3);
        jButton4.setText(Op4);
    }
    
    //Use this method to set the prompts for one option
    public void setOneOption(String Op1){
        jButton1.setVisible(true);
        jButton1.setText(Op1);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
    }
    
    //Use this method to set the prompts for continuing to view text on a computer terminal. 
    public void contComputerTerm(){
        jButton1.setVisible(true);
        jButton1.setText("Continue Reading");
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
    }
    
    //Use this method to set the prompts for concluding to view text on a computer terminal. Should be called only after contComputerTerm() is called.
    public void contComputerTermConclude(){
        jButton1.setText(">");
    }
    
    public void setTwoOptions(String Op1, String Op2){
        jButton1.setText(Op1);
        jButton2.setText(Op2);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
    }
    
    public void setThreeOptions(String Op1, String Op2, String Op3){
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(false);
        jButton1.setText(Op1);
        jButton2.setText(Op2);
        jButton3.setText(Op3);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //This is what happens when a button is clicked. The variable option is set to a string for this option, then
        //the gameLogic method is called which contains the switch statement. It takes the variable option as well as the
        //internalPlayer variable which is the player class object. 
        option = "Option1";
        //The player object is returned from the gameLogic method so that any changes made to the user's character don't go out of scope
        internalPlayer = vLogic.gameLogic(internalPlayer, option);
        //Resets the save prompt
        jBSave.setText("Save");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //This is what happens when a button is clicked. The variable option is set to a string for this option, then
        //the gameLogic method is called which contains the switch statement. It takes the variable option as well as the
        //internalPlayer variable which is the player class object. 
        option = "Option2";
        //The player object is returned from the gameLogic method so that any changes made to the user's character don't go out of scope
        internalPlayer = vLogic.gameLogic(internalPlayer, option);
        //Resets the save prompt
        jBSave.setText("Save");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //This is what happens when a button is clicked. The variable option is set to a string for this option, then
        //the gameLogic method is called which contains the switch statement. It takes the variable option as well as the
        //internalPlayer variable which is the player class object. 
        option = "Option3";
        //The player object is returned from the gameLogic method so that any changes made to the user's character don't go out of scope
        internalPlayer = vLogic.gameLogic(internalPlayer, option);
        //Resets the save prompt
        jBSave.setText("Save");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //This is what happens when a button is clicked. The variable option is set to a string for this option, then
        //the gameLogic method is called which contains the switch statement. It takes the variable option as well as the
        //internalPlayer variable which is the player class object. 
        option = "Option4";
        //The player object is returned from the gameLogic method so that any changes made to the user's character don't go out of scope
        internalPlayer = vLogic.gameLogic(internalPlayer, option);
        //Resets the save prompt
        jBSave.setText("Save");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jBSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSaveActionPerformed
        sesh.save();
        jBSave.setText("FILE SAVED!");
    }//GEN-LAST:event_jBSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    //This is the private nested class VaultRooms. It contains the methods which are called to set the game gui's prompts and options.
    private class VaultRooms{
    
        
        //This is an example of what a room method would look like. It contains method calls to the game screen class's methods that set the prompt and 
        //options text. These options are able to be called on the game screen class because this is a nested class.
        public void start(){
            setPrompt("You slowly wake up and begin to look around. You're unsure of where you are, and as your vision clears, you take stock of what's around you." + 
                    " There is a computer terminal in the corner, a dead body on the floor, and two doors. One door leads to a hallway, " +
                    "and another door appears to lead to a dead end. You notice a stripe on your left arm near the wrist paler than the rest of your skin, as if some item is "+
                    "missing.");
            
            setAllOptions("Go out the door", "Inspect dead end", "Inspect terminal", "Inspect body");
        }
        
        public void startCont(){
            setPrompt("There is a computer terminal in the corner, a dead body on the floor, and two doors. One door leads to a hallway, " +
                    "and another door appears to lead to a dead end. You notice a stripe on your left arm near the wrist paler than the rest of your skin, as if some item is "+
                    "missing.");
            
            setAllOptions("Go out the door", "Inspect dead end", "Inspect terminal", "Inspect body");
        }
        public void firstHallway(){
            setPrompt("You enter the hallway off the room you woke up in. The door to that room is behind you. The hallway is deserted and red emergency" +
                    " lights running along the ceiling illuminate it. There are two doors on the wall opposite you, and a door at the end of the hallway." +
                    " The doors opposite you are labeled 'bunkhouse' and 'shower/fitness room' respectively.");
            
            setAllOptions("Go back", "Take door at end of the hallway", "Enter bunkhouse", "Enter shower/fitness room");
        }
        
        public void firstDeadEndRoom(){
            setPrompt("You enter the adjacent room. The general back alley ambiance of this room is so rotten, so incredibly foul. "
                    + "How long had you been lying outside this room? Who was responsible for the political propaganda plastering every wall?" + 
                    " What could possibly be made of these black and white photos strewn about, all copies of the same blurry photo, what you figure to be lights in the night sky." +
                    " 'Death to the Observer' is spray painted on the ceiling. You tip over a pyramid of empty liquor bottles, and they clatter to the ground.");
            
            setOneOption("Go back to the previous room");
        }
        
        public void firstTerminalPartOne(){
            setPrompt("The terminal is currently displaying messages from the observer. 'The Interloper,' he writes, 'Has caused nothing but trouble since their arrival." 
            + " They are too rowdy and speak nonsense about lights in the sky. And that dreaded cat they brought with them got loose in the ventilation system. I wish"
            + " we could return to the way things were before their arrival.' You click to read the next message.");
            
            contComputerTerm();
        }
        
        public void firstTerminalPartTwo(){
            setPrompt("'The Interloper has now begun spreading their dreadful idealogy and the other residents are beginning to wonder about the lights in their blurry photo." 
            + " In addition, that dreadful cat is still missing in the ventilation sytstem despite our efforts to locate it. I fear a showdown between they and myself is inevitable.'");
            
            contComputerTermConclude();
        }
        
        public void inspectDeadBody(){
            setPrompt("This dead body appears to be in a vault jumpsuit three sizes too big. Cause of death isn't apparent, but you're not a doctor, so don't feel bad. " +
                    "A pipboy is on the body's wrist.");
            setTwoOptions("Take the Pipboy!", "Don't take the Pipboy.");
        }
        
        public void inspectDeadBodyHasPipBoy(){
            setPrompt("This dead body appears to be in a vault jumpsuit three sizes too big. Cause of death isn't apparent, but you're not a doctor, so don't feel bad.");
            setOneOption("Enough morbid consideration");
        }
        
        public void endOfHallDoor(){
            setPrompt("Before you is a staircase leading up. Just isnide this door there is a room marked 'Maintenance Closet' on your left. Behind you is "
            + "the hallway you just came from.");
            setThreeOptions("Go back", "Maintenance Closet", "Go Upstairs");
        }
        
        public void bunkhouse(){
            setPrompt("A corridor divides this room, and on either side there are a half dozen more doors, " +
                    "presumambly behind which are the actual bunkrooms. The same red emergency lighting is in use here.");
            setTwoOptions("Go back to hallway", "Check the nearest bunkroom");
        }
        
        public void bunkroom(){
            setPrompt("This is a tiny living space. A twin bed takes up more than half the space, and a wash basin and chair take up the rest. The concrete walls are unpainted.");
            setOneOption("Go back to the bunkhouse");
        }
        
        public void showerRoom(){
            setPrompt("The fitness and shower room looks untouched since whenever it was last used. Dumbbells line one of the walls, and a variety of nice exercise machines" +
                    " are arranged in a neat pattern. A door marked showers is open, and you can see that it is a tiled room with a row of shower heads along one wall"+
                    " and lockers on the other. This room is vacant and was well cared for.");
            setOneOption("Go back to hallway");
        }
        
        public void upStairsLanding(){
            setPrompt("You find yourself on the landing of the main floor. The stairs you came up are behind you. You can see a room marked 'Observer's Office'"
            + ". Opposite you there appears to be a railing. To the left of where you are, is the vault door. It looks like a door to the world's biggest safe.");
            setAllOptions("Go back", "Look over railing", "Inspect vault door", "Go to 'Observer's Office'");
        }
        
        public void maintenanceCloset(){
            setPrompt("It's a small maintenance closet. A small tool box and cleaning supplies are scattered about on the floor. On the wall, surrounded by yellow"
            + " signs with warnings such as 'Caution! High Voltage' is an open breaker box. Several breakers appear to have been ripped out and two wires are " 
            + "arcing menacingly. The wire(and the air) crackles with possibilities.");
            setTwoOptions("Go back", "Touch the wires!");
        }
        
        public void arcingWires(){
            setPrompt("You grab hold and are electrocuted. You try to let go but cannot, the electricity forcing your hands to grasp the wires tighter. Images "
            + "flash through your mind, mostly nonsensical. After several more seconds, you succumb to electrocution.");
            setOneOption("Game Over!");
        }
    }//end of vault rooms class
    
    //This is the vault logic class. It contains the switch statements. The big switch statement has as its cases the "rooms" of the game. It gets the player
    //position which is initially set to start(in the UserPlayer class) and goes to that particular case. Then, there is a switch statement nested there, which
    //works off the option the user chose. The options and prompt are set accordingly, and the player position is updated. The calls to the nested class vualtrooms methods
    //work without an object because this class extends the vaultrooms class. 
    private class VaultLogic extends VaultRooms{
        
        //This will be the only method in this class
        public UserPlayer gameLogic(UserPlayer passedPlayer, String option){
            
            switch (passedPlayer.getPlayerPosition()) {
                
                    case "start":
                        /*
                            The following SOP statement is used for testing to see if the pipboy is actually equipped after the player takes it off the dead body.
                            GETTING THE PIPBOY IS CURRENTLY WORKING - 3/4/20
                        */
                        //System.out.println(passedPlayer.inquirePipBoy());
                        
                        switch (option) {
                            
                            case "Option1":
                                firstHallway();
                                passedPlayer.updatePosition("firstHallway");
                                break;
                            
                            case "Option2":
                                firstDeadEndRoom();
                                passedPlayer.updatePosition("firstDeadEnd");
                                break;
                            
                            case "Option3":
                                firstTerminalPartOne();
                                passedPlayer.updatePosition("firstTerminalPartOne");
                            break;
                            
                            case "Option4":
                                if(passedPlayer.inquirePipBoy() == false){
                                    inspectDeadBody();
                                    passedPlayer.updatePosition("deadBody");
                                }
                                else{
                                    inspectDeadBodyHasPipBoy();
                                    passedPlayer.updatePosition("deadBodyEquipped");
                                }
                             break;                                                            
                        }//end of internal switch statement for room "start"
                    break;
                    
                    case "startCont":
                        switch(option){
                            case "Option1":
                                firstHallway();
                                passedPlayer.updatePosition("firstHallway");                                
                            break;
                            case "Option2":
                                firstDeadEndRoom();
                                passedPlayer.updatePosition("firstDeadEnd");                                
                            break;
                            case "Option3":
                                firstTerminalPartOne();
                                passedPlayer.updatePosition("firstTerminalPartOne");                                
                            break;
                            case "Option4":
                                if(passedPlayer.inquirePipBoy() == false){
                                    inspectDeadBody();
                                    passedPlayer.updatePosition("deadBody");
                                }
                                else{
                                    inspectDeadBodyHasPipBoy();
                                    passedPlayer.updatePosition("deadBodyEquipped");
                                }                                
                            break;
                        }//end of internal switch statement for startcont
                    break;
                        
                    case "firstHallway":
                        switch (option){
                            
                            case "Option1":
                                startCont();
                                passedPlayer.updatePosition("startCont");
                            break;
                            
                            case "Option2":
                                endOfHallDoor();
                                passedPlayer.updatePosition("endOfHallDoor");
                            break;
                            
                            case "Option3":
                                bunkhouse();
                                passedPlayer.updatePosition("bunkhouse");
                            break;
                            
                            case "Option4":
                                showerRoom();
                                passedPlayer.updatePosition("showerRoom");
                            break;
                                
                        }//end of internal switch statement for room "exampleCont"
                    break;
                        
                    case "firstDeadEnd":
                        switch (option){
                            
                            case "Option1":
                                startCont();
                                passedPlayer.updatePosition("startCont");
                                break;
                                
                        }//end of internal switch statement for room "exampleOfOneButton"
                    break;
                        
                    case "firstTerminalPartOne":
                        switch (option){
                            
                            case "Option1":
                                firstTerminalPartTwo();
                                passedPlayer.updatePosition("firstTerminalPartTwo");
                            break;
                                
                        }//end of internal switch statement for room "firstTerminalPartOne"
                    break;
                        
                    case "firstTerminalPartTwo":
                        switch (option){
                            
                            case "Option1":
                                startCont();
                                passedPlayer.updatePosition("startCont");
                            break;
                                
                        }//end of intenral switch statement for room "firstTerminalPartTwo
                    break;
                    
                    case "deadBody":
                        switch (option){
                                
                                case "Option1":
                                    passedPlayer.equipPipBoy();
                                    jLabel1.setVisible(true);
                                    startCont();
                                    passedPlayer.updatePosition("startCont");
                                break;
                                
                                case "Option2":
                                    startCont();
                                    passedPlayer.updatePosition("startCont");
                                break;
                        }//end of internal switch statement for room "deadBody"
                    break;
                    
                    case "deadBodyEquipped":
                        switch(option){
                            
                            case "Option1":
                                startCont();
                                passedPlayer.updatePosition("startCont");
                            break;
                        }//end of internal switch statement fcr room deadbodyequipped
                    break;
                    
                    case "showerRoom":
                        switch(option){
                            case "Option1":
                                firstHallway();
                                passedPlayer.updatePosition("firstHallway");
                            break;
                        }//end of internal switch statement for room showerroom
                    break;
                    
                    case "bunkhouse":
                        switch(option){
                            case "Option1":
                                firstHallway();
                                passedPlayer.updatePosition("firstHallway");
                            break;
                            
                            case "Option2":
                                bunkroom();
                                passedPlayer.updatePosition("bunkroom");
                            break;
                        }//end of internal switch statement for room bunkhouse
                    break;
                    
                    case "bunkroom":
                        switch(option){
                            case "Option1":
                                bunkhouse();
                                passedPlayer.updatePosition("bunkhouse");
                            break;
                        }//end of internal switch statement for room bunkroom
                    break;
                    
                    case "endOfHallDoor":
                        switch(option){
                            case "Option1":
                                firstHallway();
                                passedPlayer.updatePosition("firstHallway");
                            break;
                            
                            case "Option2":
                                maintenanceCloset();
                                passedPlayer.updatePosition("maintenanceCloset");                                
                            break;
                            
                            case "Option3":
                                upStairsLanding();
                                passedPlayer.updatePosition("upStairsLanding");
                            break;
                        }//end of room endofhalllanding nested switch statement
                    break;
                    
                    case "maintenanceCloset":
                        switch(option){
                            case "Option1":
                                endOfHallDoor();
                                passedPlayer.updatePosition("endOfHallDoor");
                            break;
                            
                            case "Option2":
                                arcingWires();
                                passedPlayer.updatePosition("arcingWires");
                            break;
                        }//end of room maintenance closet internal switch statement
                    break;
                    
                    case "arcingWires":
                        switch(option){
                            case "Option1":
                                ProtoGUI gameOverGui = new ProtoGUI();
                                gameOverGui.setVisible(true);
                                dispose();
                            break;
                        }//end of room arcing wires 
                    
                    
                    
            }//end of external switch statement
            return passedPlayer;
        }//end of gamelogic method
    }//end of vault logic class

}//end of GameGUI class
