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
    int EndingLocation;
    int PointValue;
    String Name;
    int Weight;
    
    public Object(String name, int startingLocation, int pointValue, int weight) {
        Name = name;
        StartingLocation = startingLocation;
        PointValue = pointValue;
        Weight = weight;
    }
    
    
    public void setStartingLocation(int location) {
        StartingLocation = location;
    }
    public void setEndingLocation(int location) {
        EndingLocation = location;
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
    public void setWeight(int weight) {
        Weight = weight;
    }
    public int getWeight() {
        return Weight;
    }
    
    
}