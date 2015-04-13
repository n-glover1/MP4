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
public class Object {
    
    
    
    int StartingLocation;
    int PointValue;
    String Name;
    
    /**
     * Constructor
     * @param name
     * @param startingLocation
     * @param pointValue
     */
    public Object(String name, int startingLocation, int pointValue) {
        Name = name;
        StartingLocation = startingLocation;
        PointValue = pointValue;
    }
    
    /**
     * sets the starting location of the object for it to spawn in
     * @param location
     */
    public void setStartingLocation(int location) {
        StartingLocation = location;
    }

    /**
     *  sets the point value of the object
     * @param pointValue
     */
    public void setPointValue(int pointValue) {
        PointValue = pointValue;
    }

    /**
     * gets the point value of the object
     * @return the point value of the object
     */
    public int getPointValue() {
        return PointValue;
    }

    /**
     * sets the name of the object
     * @param name
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     * gets the name of the object
     * @return name of object
     */
    public String getName() {
        return Name;
    }
    
}
