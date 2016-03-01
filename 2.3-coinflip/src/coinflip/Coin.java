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
    private CoinValue face;
    
    /**
     * Creates a object of class Coin
     */
    public Coin() {
        generator = new Random();
        face = CoinValue.Unknown;        
    }
    
    /**
     * Flips the coin, returns the result of the flip "HEADS" or "TAILS"
     * @return A String result of the flip "HEADS" or "TAILS"
     */
    public CoinValue Flip() {
        return (face = generator.nextInt(2) == 1 ? CoinValue.Heads : CoinValue.Tails);        
    }
    
    /**
     * Does not flip the coin, only returns the side that is facing "HEADS" or "TAILS"
     * @return A string representing the current side facing "HEADS" or "TAILS"
     */
    public CoinValue Face() {
        return face;
    }
}
