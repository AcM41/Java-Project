/*
   Student Name: Zhangying Meng
   Student Number: 041072241
   Course & Section #: 23S_CST8288_023
   Declaration: This is the KMconverter class.
   This is my own original work and is free from Plagiarism.
   */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgUnitConverter;

/**
 * A class that converts distance values from kilometers to miles.
 * Implements the UnitConverter interface.
 * @author Zhangying Meng
 */
public class KMconverter implements UnitConverter{
    private final double convFactor = 0.62;
    /**
     * Converts a distance value from kilometers to miles.
     * 
     * @param kilo the distance value in kilometers to be converted
     * @return the equivalent distance value in miles
     */
    @Override 
    public double convert(double kilo){
        return (kilo*convFactor);
    }
    /**
     * Returns the unit type before conversion.
     * 
     * @return the unit type before conversion, which is "Kilometres"
     */
    @Override
    public String unitTypeBefore(){
        return "Kilometres";
    }
    /**
     * Returns the unit type after conversion.
     * 
     * @return the unit type after conversion, which is "Miles"
     */
    @Override
    public String unitTypeAfter(){
        return "Miles";
    }
    
}
