/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MP4Package;
import MP4Package.Object;
/**
 *
 * @author Noah
 */
public class Room {
    
    
    int RoomNumber;
    String RoomName;
    int RoomsSurrounding[] = new int[4];
    String Description;
    Object roomObject;
    
    public Room() {
        RoomNumber = -2;
        RoomName = "";
        RoomsSurrounding[0] = -2;
        RoomsSurrounding[1] = -2;
        RoomsSurrounding[2] = -2;
        RoomsSurrounding[3] = -2;
    }
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
    public String getDescription() {
        return Description;
    }
    
    public void spawnItem(Object object) {
        roomObject = object;
    }
    public int[] getSurrounding() {
        return RoomsSurrounding;
    }
    
    
    
}
