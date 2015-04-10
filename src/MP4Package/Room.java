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
    String RoomName;
    int RoomsSurrounding[] = new int[4];
    String Description;
    
    public Room(int roomNumber, String roomName, int[] surroundings) {
        RoomNumber = roomNumber;
        RoomName = roomName;
        RoomsSurrounding = surroundings;
    }
    
    
    public void setDescription(String description) {
        Description = description;
    }
    public String displayDescription() {
        return Description;
    }
    public int getRoomNum() {
        return RoomNumber;
    }
    
    
    
    
}
