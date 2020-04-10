/*
    This is the class for the userPlayer. It contains the variables and methods necessary
    for the player character. 
*/
package prototwopulled;
public class UserPlayer {
    
    private String curWeapon;
    private int hp;
    private String[] inventory = new String[0];
    private String position;
    private boolean hasPipBoy;
    
    public UserPlayer(){
        hp = 100;
        curWeapon = "fisticuffs";
        //this is going to need to be changed once the methods for the rooms are written
        position = "start";
        hasPipBoy = false;
    }
    
    public void setHP(int health){
        hp = health;
    }
    
    public void damageUpdateHP(int damage){
        hp = hp - damage;
    }
    
    public void healsUpdateHP(int heals){
        if((hp + heals) < 100)
            hp = hp + heals;
        if((hp + heals) > 100)
            hp = 100;
    }
    
    public void updateInventory(String item){
        String[] newInventory = new String[inventory.length + 1];
        System.arraycopy(inventory, 0, newInventory, 0, inventory.length);
        newInventory[inventory.length] = item;
        inventory = newInventory;
    }
    
    public void updateWeapon(String weapon){
        curWeapon = weapon;
    }

    public String getCurWeapon(){
        return curWeapon;
    }
    
    public int getCurHP(){
        return hp;
    }
    
    public void equipPipBoy(){
        hasPipBoy = true;
    }
    
    public void updatePosition(String place){
        position = place;
    }
    
    public String getPlayerPosition(){
        return position;
    }
    
    public boolean inquirePipBoy(){
        return hasPipBoy;
    }
    
    public void setPip(boolean boy){
        hasPipBoy = boy;
    }
    
    //this comment is only a gitTest
    
    
/*
    //these methods exist for visualization.
    public void printInventory(){
	for(String a : inventory)
		System.out.println(a);
    }

    public void printHP(){
	System.out.println(hp);
    }
    
    public void printCurrentWeapon(){
        System.out.println(curWeapon);
    }
*/
}