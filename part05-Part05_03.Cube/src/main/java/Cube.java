/*
 * 
 * This program is * 
 */

/**
 *
 * @author Dantes
 */
public class Cube {
    private int edgeLength;

    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
        
        
    }
    
    public int volume(){
        
        int result= 0;
        result = (edgeLength * edgeLength) * edgeLength;
        
        return result;
    }

    @Override
    public String toString() {
        return "The length of the edge is "+ edgeLength +" and volume "+ volume();
    }
    
    
    
    
    
    
}
