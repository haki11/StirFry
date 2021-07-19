/*
 * Demonstrate the use of Abstract and Generlization
 */
package stirfry;

/**
 *
 * @author haki
 * @date July 19, 2021
 */
public abstract class Vegetable {
    
    private String name;
    private String colour;
    
    protected Vegetable(String name, String colour){
        this.name = name;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }
    
    
    /**
     * A method that returns true if you like the taste of the vegetable
     * Otherwise will return false.
     * @return 
     */
    public abstract boolean isTasty();
}
