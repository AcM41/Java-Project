// standard Algonquin header goes here.
/*
   Student Name: Zhangying Meng
   Student Number: 041072241
   Course & Section #: 23S_CST8288_023
   Declaration: This is the FCconverter class.
   This is my own original work and is free from Plagiarism.
   */
package pkgUnitConverter;
/**
 * class to convert Fahrenheit to Celsius
 * @author kriger
 */
public class FCconverter implements UnitConverter{
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
	
	/**
	 * @param fahrenheit value in Fahrenheit to be converted
	 * @return equivalent in Celsius
	 */
        @Override
	public double convert(double fahrenheit) {
		return (fahrenheit - convOrigin)/convFactor;
	}
        /**
	 * Returns the unit type before conversion.
	 * 
	 * @return the unit type before conversion, which is "Fahrenheit"
	 */
        @Override
        public String unitTypeBefore(){
            return "Fahrenheit";
        }
        
	/**
	 * Returns the unit type after conversion.
	 * 
	 * @return the unit type after conversion, which is "Celsius"
	 */
        @Override
        public String unitTypeAfter(){
            return "Celsius";
        }
}
