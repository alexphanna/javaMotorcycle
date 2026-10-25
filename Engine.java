/**

 * Project: Lab 1.5
 * Purpose Details: Engine for Motorcycle
 * Course: CMPSC 221
 * Author: Alex Hanna
 * Date Developed: 10/23/2026
 * Last Date Changed: 10/23/2026
 * Rev: 1

 */

// Engine class
public class Engine {
    /**
     * The size of the engine
     */
    private double size;
    /**
     * The type of the engine
     */
    private String type;

    /**
     * Adds two numbers and returns the result.
     *
     * @param size This is the size of the engine.
     * @param type This is the type of the engine.
     */
    public Engine(double size, String type) {
        this.size = size;
        this.type = type;
    }

    public double getSize(){
        return size;
    }

    public void setSize(double size){
        this.size = size;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }
}
