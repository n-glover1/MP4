/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MP4Package;
import MP4Package.Object;
import java.util.ArrayList;
/**
 *
 * @author Noah
 */
public class MainCharacter {
    
    
    int Location;
    int CarryWeight = 0;
    int MaxCarryWeight;
    int Score;
    ArrayList<Object> Inventory = new ArrayList<Object>();
    
    
    
    public void setLocation(int location) {
        Location = location;
    }
    
    public void addObject(Object object) {
        Inventory.add(object);
        CarryWeight += object.getWeight();
    }
    public void removeObject(Object object) {
        Inventory.remove(object);
        CarryWeight -= object.getWeight();
    }
    
}
