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
    Object roomObject = null;
    
    /**
     * Constructor
     */
    public Room() {
        RoomNumber = -2;
        RoomName = "";
        RoomsSurrounding[0] = -2;
        RoomsSurrounding[1] = -2;
        RoomsSurrounding[2] = -2;
        RoomsSurrounding[3] = -2;
    }

    /**
     * Constructor
     * @param roomNumber
     * @param roomName
     * @param north
     * @param east
     * @param south
     * @param west
     */
    public Room(int roomNumber, String roomName, int north, int east, int south, int west) {
        RoomNumber = roomNumber;
        RoomName = roomName;
        RoomsSurrounding[0] = north;
        RoomsSurrounding[1] = east;
        RoomsSurrounding[2] = south;
        RoomsSurrounding[3] = west;
    }
    
    /**
     * sets the description of the room
     * @param description description of room
     */
    public void setDescription(String description) {
        Description = description;
    }

    /**
     * gets the room number
     * @return room number
     */
    public int getRoomNum() {
        return RoomNumber;
    }

    /**
     * gets the room description
     * @return room description
     */
    public String getDescription() {
        return Description;
    }
    
    /**
     * Spawns an object in the room
     * @param object object to be spawned
     */
    public void spawnItem(Object object) {
        roomObject = object;
    }

    /**
     * gets the rooms in the 4 cardinal directions of the room
     * @return room surroundings
     */
    public int[] getSurrounding() {
        return RoomsSurrounding;
    }

    /**
     * gets the name of the room
     * @return room name
     */
    public String getRoomName() {
        return RoomName;
    }

    /**
     * gets the current object in the room
     * @return object in room
     */
    public Object getRoomObject() {
        return roomObject;
    }

    /**
     * removes the object of the room
     */
    public void takeObject() {
        roomObject = null;
    }
}
