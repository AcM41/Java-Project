// standard Algonquin header goes here.
/*
   Student Name: Zhangying Meng
   Student Number: 041072241
   Course & Section #: 23S_CST8288_023
   Declaration: This is the CFconverter class.
   This is my own original work and is free from Plagiarism.
   */
package pkgUnitConverter;
/**
 * class to convert Celsius to Fahrenheit
 * @author kriger
 */
public class CFconverter implements UnitConverter{
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
	/**
	 * @param celsius value in Celsius to be converted
	 * @return equivalent in Fahrenheit
	 */
        @Override
	public double convert(double celsius) {
		return celsius*convFactor + convOrigin;
	}
        /**
	 * Returns the unit type before conversion.
	 * 
	 * @return the unit type before conversion, which is "Celsius"
	 */ 
        @Override
        public String unitTypeBefore(){
            return "Celsius";
        }

        /**
	 * Returns the unit type after conversion.
	 * 
	 * @return the unit type after conversion, which is "Fahrenheit"
	 */

        @Override
        public String unitTypeAfter(){
            return "Fahrenheit";
        }
}
