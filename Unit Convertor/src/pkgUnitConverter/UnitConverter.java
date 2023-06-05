/*
   Student Name: Zhangying Meng
   Student Number: 041072241
   Course & Section #: 23S_CST8288_023
   Declaration: An interface for implementing unit converters.
   This is my own original work and is free from Plagiarism.
   */
package pkgUnitConverter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * An interface for implementing unit converters.
 * @author Zhangying Meng
 */
public interface UnitConverter {
    
    /**
     * Converts a value from one unit to another.
     * 
     * @param a the value to be converted
     * @return the converted value
     */
    public double convert(double a);
    
    /**
     * Returns the unit type before the conversion.
     * 
     * @return the unit type before the conversion
     */
    public String unitTypeBefore();
    
    /**
     * Returns the unit type after the conversion.
     * 
     * @return the unit type after the conversion
     */
    public String unitTypeAfter();
    

}

