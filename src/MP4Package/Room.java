/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MP4Package;

/**
 *
 * @author Noah
 */
public class Room {
    
    
    int RoomNumber;
    int RoomsSurrounding[] = new int[4];
    String Description;
    
    
    public void setDescription(String description) {
        Description = description;
    }
    public String displayDescription() {
        return Description;
    }
    
    
    
    
    
}
