/*
   Student Name: Zhangying Meng
   Student Number: 041072241
   Course & Section #: 23S_CST8288_023
   Declaration: This class provides methods to perform the conversion and retrieve the unit types before and after conversion.
   This is my own original work and is free from Plagiarism.
   */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgUnitConverter;

/**
 * A class representing a unit value that can be converted using different UnitConverter implementations.
 * This class provides methods to perform the conversion and retrieve the unit types before and after conversion.
 * Implements the UnitConverter interface.
 * @author Zhangying Meng
 */
public class Unit {
    
    private UnitConverter uc;
    /**
     * Constructs a Unit object with the default UnitConverter set to FCconverter.
     * The default UnitConverter converts temperature values from Fahrenheit to Celsius.
     */
    public Unit(){
        this.uc = new FCconverter();
        
    }
    /**
     * Converts a unit value using the current UnitConverter implementation.
     * 
     * @param a the unit value to be converted
     * @return the converted unit value
     */
    public double convert(double a){
        return this.uc.convert(a);
    }
    /**
     * Returns the unit type before conversion.
     * 
     * @return the unit type before conversion, as provided by the current UnitConverter implementation
     */
    public String unitBefore(){
        return uc.unitTypeBefore(); 
    }
    /**
     * Returns the unit type after conversion.
     * 
     * @return the unit type after conversion, as provided by the current UnitConverter implementation
     */
    public String unitAfter(){
        return uc.unitTypeAfter();
    }
    
    /**
     * /**
     * Changes the current UnitConverter implementation to the specified UnitConverter.
     * @param UnitConverter the UnitConverter implementation to set
     */
    public void changeUnitTo(UnitConverter UnitConverter){
        this.uc = UnitConverter;
    }
    
    
}
