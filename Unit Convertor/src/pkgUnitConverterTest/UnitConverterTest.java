//standard Algonquin header here
package pkgUnitConverterTest;

import pkgUnitConverter.*;
/**
 * simple class to test 2 classes for converting Fahrenheit to Celsius and the reverse
 * @author kriger
 */
public class UnitConverterTest {

    /**
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
                
                Unit u = new Unit();
		
		
		System.out.printf("%5.2f in %s is %5.2f %s\n", 70.0,u.unitBefore(), u.convert(70.0),u.unitAfter());
		
                u.changeUnitTo(new CFconverter());
		System.out.printf("%5.2f in Celsius is %5.2f Fahrenheit\n", 20.0, u.convert(20.0));
		
                u.changeUnitTo(new KMconverter());
                System.out.printf("%5.2f in %s is %5.2f %s\n", 70.0,u.unitBefore(), u.convert(70.0),u.unitAfter());
                
                u.changeUnitTo(new MKconverter());
                System.out.printf("%5.2f in %s is %5.2f %s\n", 70.0,u.unitBefore(), u.convert(70.0),u.unitAfter());
                
	}

}
