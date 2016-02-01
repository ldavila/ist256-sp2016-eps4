/************************
* 1.4 - Temperature Conversion
* 
* This program evaluates your ability to implement and use custom methods in Java. 
* 
* TASK: 
* Write a program to ask for an integer temperature in degree Fahrenheit then
* convert that to degrees Celsius and degrees Kelvin. Make sure to implement the 
* and use methods I've provided... don't do the conversions in the main method.
* Here's a code outline:
* 1) FIRST: Implement the FtoC method, and FtoK methods, using appropriate conversions.
* NEXT: code the main method()
* 1) Ask user to enter degrees Fahrenheit, store in variable F
* 2) Call FtoC method, store result in variable C
* 3) Call FtoK method, store result in variable K
* 4) Print results
* 
* SAMPLE RUN #1:
* Enter temperature in degrees Fahrenheit ==> 69
* 69 deg.F is 20.56 deg.C or 293.56 deg.K
*
* SAMPLE RUN #2:
* Enter temperature in degrees Fahrenheit ==> 212
* 212 deg.F is 100.00 deg.C or 373.00 deg.K
* 
* NOTES:
* Remember each method only knows about the variables inside it. For example 
* FtoC only knows about F. It will return C as a double.

************************/
package temperatureconversion;

public class Temperatureconversion {
   
    /**
     * Converts  degrees Fahrenheit (F) to  degrees Celsius
     * @param F integer degrees Fahrenheit 
     * @return double value converted to Degrees Celsius 
     */
    public static double FtoC(int F) {
        // TODO: replace this return with an expression based on F which converts to Celsius
        return 0.0;
    }
    
    /**
     * Converts  degrees Fahrenheit (F) to  degrees Kelvin
     * @param F integer degrees Fahrenheit 
     * @return double value converted to Degrees Kelvin 
     */
    public static double FtoK(int F) {
        // TODO: replace this return with an expression based on F which converts to Kelvin
        // HINT: Use FtoC to help you! 
        return 0.0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }

}
