/*Teresa Cheng
	*September 6, 2017
	* Our self written math library
	* It contains a series of methods to do basic math functions.
	*/
public final class Calculate {

	//square the input
	public static int square (int oprand)  {
		int squared =oprand*oprand;
		return squared;
	}


	// cube the input
	public static int cube (int oprand) {
		int cube =oprand*oprand*oprand;
		return cube; 
	}

	//average the input 
	public static double average (double oprand, double number) {
		double average =(oprand+number)/2;
		return average;
	}


	//average the input
	public static double average (double oprand, double number, double oprand2) {
		double average =(oprand+number+oprand2)/2;
		return average;
	}
	
	//toDegrees
	public static double toDegrees (double oprand) {
		double toDegrees =(oprand*180)/3.14;
		return toDegrees;
	}
	
	//toRadians
	public static double toRadians (double oprand) {
		double toRadians =(oprand*3.14)/180;
		return toRadians;
	}
	
	//discriminant
	public static double discriminant (double oprandA, double oprandB, double oprandC) {
		double discriminant =((oprandB*oprandB)-(4*oprandA*oprandC));
		return discriminant;
	}
	
	//toImproperFrac
	public static String toImproperFrac (int number, int numerator, int denominator) {
		int toImproperFrac =(number*denominator+numerator);
		return toImproperFrac + "/" + denominator;
		
	}
	
	//toMixedNum
	public static String toMixedNum (int numerator, int denominator) {
		int x =(numerator/denominator);
		int y =(numerator%denominator);
		String toMixedNum = x + "  " + (y + "/" + denominator);
		return toMixedNum; 
	
	}
	
	//foil
	public static String foil (int a, int b, int c, int d, String x) {
		int term1 =(a * c);
		int term2 =(a * d)+(b * c);
		int term3 =(b * d);
		String foil = term1 + x +"^2+"+ term2 + x + "+"+ term3 ;
		return foil; 
	
	}
	
	/*
	 *Determines whether or not one integer 9is evenly divisible by another.
	 *Accepts two integers and returns a boolean.
	 */
	public static boolean isDivisibleBy (int num1, int num2) {
		if (num2 == 0 || num1 == 0) {
			throw new IllegalArgumentException("divisor : 0");
		}
		if (num1 % num2 == 0 || num2 % num1 == 0) {
			return true;
		} else {
			return false;
		}
	}
		
	/*
	 * Returns the absolute value of the number passed.
	 * Accepts a double, returns a double.
	 */
	public static double absValue (double a) {
		if (a > 0) {
			return a;
		} else {
			return a*-1;
		}
	
	}
	
	/* Returns the larger of the values passed.
	 * Accepts two doubles and returns a double.
	 */
	public static double max (double num1, double num2) {
		if (num1 > num2) {
			return num1;
		} else { 
			return num2;
		}
	}
	
	/* Accepts three doubles and returns a double.
	 */
	public static double max (double number1, double number2, double number3) {
		if (number1 > number2 && number1 > number3) {
			return number1;
		} else if (number2 > number1 && number2 > number3) {
			return number2;
		} else {
			return number3;
		}
	}
	
	/* Returns the smaller of the values passed.
	 * Accepts two integers; returns an integer.)
	 */
	public static int min (int num1, int num2) {
		if (num1 < num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	/* Rounds a double correctly to 2 decimal places and returns a double. 
	 */
	public static double round2 (double value) {
		value = (value * 100) + 0.5;
		value = (int) value;
		value = (double)value;
		value = value/100;
		return value;
		
	}
}
	
	
	

	
