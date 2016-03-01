/************************
* 2.2 - The Game of Dominoes
* 
* This program has a lot going on. Main emphasis is on writing methods, using 
* unit tests to verify methods are correct then using objects to write 
* a program with working methods.
* 
* FIRST you should use DominoTests.Java to help you write the Domino.Java 
* incomplete methods. Your goal is to write the logic to get the tests to pass.
* 
* SECOND write DominoRun.java a program to create two random dominoes and then 
* print out information about them. 
* 
 
Algorithm for main()
1. Create random number generator   
2. Create two random numbers from 0-6 
3. Create one "random" domino, d1 using the two random numbers.
    
4.  Create another "random" domino, d2, using two DIFFERENT random numbers
5.  Print both dominos, and information about each, like this:
    (HINT: call the methods on d1 and d2....)
        Domino #1: [6| ] Has Same Ends=false, Has Blank End=true,  Total=6
        Domino #2: [4|4] Has Same Ends=true,  Has Blank End=false, Total=8
6.  If d1 is the same as d2
6.1     print "The dominoes are the SAME"
6.2 Else
6.3     print "The dominoes are NOT THE SAME"

Each time the program is run two different dominoes should be selected at 
random and therefore the output will be different.
* 
 *********************/

package dominorun;

import dominos.Domino;
import java.util.Random;

public class DominoRun {

    public static void main(String[] args) {
        // I'll give you some setup steps 1. - 3.
        Random generator = new Random();
        int end1 = generator.nextInt(7);    // generates a random # 0-6 
        int end2 = generator.nextInt(7);    // generates a random # 0-6 
        Domino d1 = new Domino(end1, end1); // Random domino
        // TODO: Start your code here with step 4 of my algorithm.
        
        
        
        
    }
    
}
