/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MP4Package;
import MP4Package.Object;
import MP4Package.Room;
import java.util.ArrayList;
/**
 *
 * @author Noah
 */
public class MainCharacter {
    
    
    Room Location;
    int Score;
    boolean Helping = false;
    ArrayList<Object> Inventory = new ArrayList<Object>();
    
    /**
     *Constructor for the Main character
     * @param location the starting location of the character
     */
    public MainCharacter(Room location){
        Location = location;
    }
    
    /**
     * Set the location for the character
     * @param location the new location of the character
     */
    public void setLocation(Room location) {
        Location = location;
    }

    /**
     * gets the current room of the character
     * @return the characters's location
     */
    public Room getRoom() {
        return Location;
    }

    /**
     * adds the object to the player's inventory of items
     * @param object object to be added to the inventory
     */
    public void addObject(Object object) {
        Inventory.add(object);
    }

    /**
     * removes the items in the inventory arraylist
     * @return the number of objects so we can properly calculate score
     */
    public int removeAllObjects() {
        int numObjects;
        numObjects = Inventory.size();
        Inventory.clear();
        return numObjects;
    }

    /**
     * sets Helping to true so character can pick up larger objects
     */
    public void beingHelped() {
        Helping = true;
    }

    /**
     * after getting Help with an object, sets Helping to false so they require help once again
     */
    public void notBeingHelped() {
        Helping = false;
    }

    /**
     * Checks to see if the player is being helped
     * @return true if the player is being helped, false if they are not
     */
    public boolean isBeingHelped() {
        return Helping;
    }

    /**
     * gets the current inventory of the player
     * @return Inventory: the current inventory of the player
     */
    public ArrayList getInventory() {
        return Inventory;
    }

    /**
     * updates the players score
     * @param score the amount to add to the player's score
     */
    public void updateScore(int score) {
        Score += score;
    }

    /**
     * gets the player's score
     * @return player's score
     */
    public int getScore() {
        return Score;
    }

    /**
     * yell function called so the player can get help with an object
     * @return the string to display so the user understands that they are being helped
     */
    public String Yell() {
        beingHelped();
        return "I'm on my way! \nSomeone comes to help you.";
    }
    
}
