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
    
    public Object(String name, int startingLocation, int pointValue) {
        Name = name;
        StartingLocation = startingLocation;
        PointValue = pointValue;
    }
    
    
    public void setStartingLocation(int location) {
        StartingLocation = location;
    }
    public void setPointValue(int pointValue) {
        PointValue = pointValue;
    }
    public int getPointValue() {
        return PointValue;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getName() {
        return Name;
    }
    
}
