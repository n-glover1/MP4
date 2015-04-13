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
    
    public MainCharacter(Room location){
        Location = location;
    }
    
    public void setLocation(Room location) {
        Location = location;
    }
    public Room getRoom() {
        return Location;
    }
    public void addObject(Object object) {
        Inventory.add(object);
    }
    public int removeAllObjects() {
        int numObjects;
        numObjects = Inventory.size();
        Inventory.clear();
        return numObjects;
    }
    public void beingHelped() {
        Helping = true;
    }
    public void notBeingHelped() {
        Helping = false;
    }
    public boolean isBeingHelped() {
        return Helping;
    }
    public ArrayList getInventory() {
        return Inventory;
    }
    public void updateScore(int score) {
        Score += score;
    }
    public int getScore() {
        return Score;
    }
    public String Yell() {
        beingHelped();
        return "I'm on my way! \nSomeone comes to help you.";
    }
    
}
