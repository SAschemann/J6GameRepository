/*
    This is the class for the game gui. It has four clickable options and a text area for setting text. 
    There are two nested classes here, and were nested so that they could change the prompts and options texts.
*/
package prototwopulled;

public class GameGUI extends javax.swing.JFrame {

    //Variable declarations
    UserPlayer internalPlayer;     
    String option;
    //Declare a VaultLogic object to call that classes method on
    VaultLogic vLogic = new VaultLogic();
    
    
    public GameGUI(UserPlayer player) {
        initComponents();
        setLocation(415,100);
        setResizable(false);
        //set internalplayer variable to the player variable which is passed in
        internalPlayer = player;
        //declare a vaultrooms object to call the starting method on
        VaultRooms vRooms = new VaultRooms();
        //this method call using the vRooms object created here sets the prompt and options for the first "room" at the start of the game.
        vRooms.example();
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jButton1.setText(Op1);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
    }
    
    //Use this method to set the prompts for continuing to view text on a computer terminal. 
    public void contComputerTerm(){
        jButton1.setText(">");
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
    }
    
    //Use this method to set the prompts for concluding to view text on a computer terminal. Should be called only after contComputerTerm() is called.
    public void contComputerTermConclude(){
        jButton1.setText("Conclude Reading");
    }
    
    public void setTwoOptions(String Op1, String Op2){
        jButton1.setText(Op1);
        jButton2.setText(Op2);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //This is what happens when a button is clicked. The variable option is set to a string for this option, then
        //the gameLogic method is called which contains the switch statement. It takes the variable option as well as the
        //internalPlayer variable which is the player class object. 
        option = "Option1";
        //The player object is returned from the gameLogic method so that any changes made to the user's character don't go out of scope
        internalPlayer = vLogic.gameLogic(internalPlayer, option);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //This is what happens when a button is clicked. The variable option is set to a string for this option, then
        //the gameLogic method is called which contains the switch statement. It takes the variable option as well as the
        //internalPlayer variable which is the player class object. 
        option = "Option2";
        //The player object is returned from the gameLogic method so that any changes made to the user's character don't go out of scope
        internalPlayer = vLogic.gameLogic(internalPlayer, option);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //This is what happens when a button is clicked. The variable option is set to a string for this option, then
        //the gameLogic method is called which contains the switch statement. It takes the variable option as well as the
        //internalPlayer variable which is the player class object. 
        option = "Option3";
        //The player object is returned from the gameLogic method so that any changes made to the user's character don't go out of scope
        internalPlayer = vLogic.gameLogic(internalPlayer, option);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //This is what happens when a button is clicked. The variable option is set to a string for this option, then
        //the gameLogic method is called which contains the switch statement. It takes the variable option as well as the
        //internalPlayer variable which is the player class object. 
        option = "Option4";
        //The player object is returned from the gameLogic method so that any changes made to the user's character don't go out of scope
        internalPlayer = vLogic.gameLogic(internalPlayer, option);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    //This is the private nested class VaultRooms. It contains the methods which are called to set the game gui's prompts and options.
    private class VaultRooms{
    
        //This is an example of what a room method would look like. It contains method calls to the game screen class's methods that set the prompt and 
        //options text. These options are able to be called on the game screen class because this is a nested class.
        public void example(){
            setPrompt("You slowly wake up and begin to look around. You're unsure of where you are, and as your vision clears, you take stock of what's around you." + 
                    " There is a computer terminal in the corner, a dead body on the floor, and two doors. One door leads to a hallway, " +
                    "and another door appears to lead to a dead end. You notice a stripe on your left arm near the wrist paler than the rest of your skin, as if some item is "+
                    "missing.");
            
            setAllOptions("Go out the door", "Inspect dead end", "Inspect terminal", "Inspect body");
        }
        public void exampleCont(){
            setPrompt("This is the second room. First Option goes back to the first room.");
            
            setAllOptions("Go to first room", "does nothing yet", "this option does nothing yet", "this option does nothing yet");
        }
        
        public void firstDeadEndRoom(){
            setPrompt("You enter the adjacent room. The general back alley ambiance of this room is so rotten, so incredibly foul. "
                    + "How long had you been lying outside this room? Who was responsible for the political propaganda plastering every wall?" + 
                    " What could possibly be made of these black and white photos strewn about, all copies of the same blurry photo, what you figure to be lights in the night sky." +
                    " You tip over a pyramid of empty liquor bottles, and they clatter to the ground.");
            
            setOneOption("Go back to the previous room");
        }
        
        public void firstTerminalPartOne(){
            setPrompt("This is some text on the computer terminal. Imagine this message was too big to fit on one screen. You should click the button below to see the rest of " + 
                    "the text.");
            
            contComputerTerm();
        }
        
        public void firstTerminalPartTwo(){
            setPrompt("This is the continuation of the information on the first temrinal.");
            
            contComputerTermConclude();
        }
        
        public void inspectDeadBody(){
            setPrompt("This dead body appears to be in a vault jumpsuit three sizes too big. Cause of death isn't apparent, but you're not a doctor, so don't feel bad. " +
                    "A pipboy is on the body's wrist.");
            setTwoOptions("Take the Pipboy!", "Don't take the Pipboy.");
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
                                exampleCont();
                                passedPlayer.updatePosition("exampleCont");
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
                                inspectDeadBody();
                                passedPlayer.updatePosition("deadBody");
                             break;
                                
                            
                        }//end of internal switch statement for room "start"
                        break;
                        
                    case "exampleCont":
                        switch (option){
                            
                            case "Option1":
                                example();
                                passedPlayer.updatePosition("start");
                                break;
                                
                        }//end of internal switch statement for room "exampleCont"
                        break;
                        
                    case "firstDeadEnd":
                        switch (option){
                            
                            case "Option1":
                                example();
                                passedPlayer.updatePosition("start");
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
                                example();
                                passedPlayer.updatePosition("start");
                            break;
                                
                        }//end of intenral switch statement for room "firstTerminalPartTwo
                        break;
                    
                    case "deadBody":
                        switch (option){
                                
                                case "Option1":
                                    passedPlayer.equipPipBoy();
                                    example();
                                    passedPlayer.updatePosition("start");
                                break;
                                
                                case "Option2":
                                    example();
                                    passedPlayer.updatePosition("start");
                                break;
                        }//end of internal switch statement for room "deadBody"
                    break;
                    
            }//end of external switch statement
            return passedPlayer;
        }//end of gamelogic method
    }//end of vault logic class

}//end of GameGUI class
