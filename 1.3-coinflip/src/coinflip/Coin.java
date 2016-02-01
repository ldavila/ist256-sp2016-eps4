/**
 * No need to edit this code... I wrote it all for you! Just use it in the 
 * coinflip.java program.
 */
package coinflip;

import java.util.Random;

/**
 * Simulates a Coin Flip
 * @author mafudge
 */
public class Coin {
    
    private Random generator;
    private String face;
    
    /**
     * Creates a object of class Coin
     */
    public Coin() {
        generator = new Random();
        face = "NOT FLIPPED YET";
    }
    
    /**
     * Flips the coin, returns the result of the flip "HEADS" or "TAILS"
     * @return A String result of the flip "HEADS" or "TAILS"
     */
    public String Flip() {
        return (face = generator.nextInt(2) == 1 ? "HEADS" : "TAILS");
    }
    
    /**
     * Does not flip the coin, only returns the side that is facing "HEADS" or "TAILS"
     * @return A string representing the current side facing "HEADS" or "TAILS"
     */
    public String Face() {
        return face;
    }
}
