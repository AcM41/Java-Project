/*
   Student Name: Zhangying Meng
   Student Number: 041072241
   Course & Section #: 23S_CST8288_023
   Declaration: THis is the MKconverter class.
   This is my own original work and is free from Plagiarism.
   */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgUnitConverter;

/**
 * A class that converts distance values from miles to kilometers.
 * Implements the UnitConverter interface.
 * @author Zhangying Meng
 */
public class MKconverter implements UnitConverter{
    private final double convFactor = 1.61;
    /**
     * Converts a distance value from miles to kilometers.
     * 
     * @param mile the distance value in miles to be converted
     * @return the equivalent distance value in kilometers
     */
    @Override 
    public double convert(double mile){
        return (mile*convFactor);
    }
    /**
     * Returns the unit type before conversion.
     * 
     * @return the unit type before conversion, which is "Miles"
     */
    @Override
    public String unitTypeBefore(){
        return "Miles";
    }
    /**
     * Returns the unit type after conversion.
     * 
     * @return the unit type after conversion, which is "Kilometres"
     */
    @Override
    public String unitTypeAfter(){
        return "Kilometres";
    }
    
}
