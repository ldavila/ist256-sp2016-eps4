/************************
* 3.1 - Guess a Number!
* 
* This program evaluates your ability to use a sentinel-controlled while loop 
* It does not involve any custom classes or unit tests. 
* 
* TASK: 
* Write a program to play the "guess a number" game. In this game the computer
* should pick a number between 1 and 10 and your job is to guess it. The program
* should tell you whether you are right or wrong and suggest if you should guess
* higher or lower. After you make correct guess the program should tell you
* how many tries it took 
* 
* SAMPLE RUN:
* Guess a number between 1 and 10: 5
* Incorrect. Guess higher.
* Guess a number between 1 and 10: 10
* Incorrect. Guess lower
* Guess a number between 1 and 10: 8
* CORRECT! That took 3 tries.
* 
* ALGORITHM: 
* Here's a step-by-step algorithm for the main() method:
* 
* number = generate a random number between 1 and 10
* tries = 0
* loop:
*   print "Guess a number between 1 and 10"
*   guess = input from user
*   tries = tries + 1
*   if guess equals number then 
*       print "CORRECT! that took " tries " tries "
*       quit the loop
*   else if (guess less than number)
*       print "Incorrect. Guess higher."
*   else 
*       print "Incorrect. Guess lower."
* end loop
* 
* 
************************/
package guessanumber;

public class GuessANumber {

    public static void main(String[] args) {
        // TODO code application logic here

        
    }
    
}
