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
	// Part 3: Methods that use Loops and Calls to Other Methods
	
		public static double exponent (double base, int power) { // accepts a double and an integer and returns a double
			// raises a value to a positive integer power
			if (power < 0) {
				throw new IllegalArgumentException("negative exponent: " + power);
			}
			double answer = 1;
			for (int i = 1; i <= power; i++) {
				answer *= base;
			}
			return answer;
		}
		
		public static int factorial (int a) { // accepts an integer and returns an integer
			// returns the factorial of the value passed
			if (a < 0) {
				throw new IllegalArgumentException("negative a: " + a);
			}
			int answer = 1;
		    for ( int i = 2; i <= a; i++ ) {  
		        answer *= i;
		    }  
		    return answer;
		}  
		
		public static boolean isPrime (int a) { // accepts an integer and returns a boolean
			// determines whether or not an integer is prime
		    boolean check;
		    if (a > 1) {
		    	for (int i = a - 1; i > 1; i--) {
		    		check = Calculate.isDivisibleBy(a, i);
		    		if (check == true) {
		    			return false;
		    		}
		    	}
		    } else {
		    	return false;
		    }
		    return true;
			}

		public static int gcf (int num1, int num2) { // accepts two positive integers and returns an integer
			// finds the greatest common factor of two integers
			while (num2 != 0) {
				int c = num1;
				num1 = num2;
				num2 = c % num2;
			}
			return (int)Calculate.absValue(num1);
		}
		
		public static double sqrt (double a) { // accepts and returns a double
			// returns an approximation of the square root of the value passed, accurate to two decimal places
			if (a < 0) {
				throw new IllegalArgumentException ("negative a:" + a);
			}
			return Math.sqrt(a);
		}
	// Part 4: Throwing Exceptions
			// 1. See factorial, exponent, isDivisibleBy, and sqrt
			// 2.
		public static String quadForm (int a, int b, int c) { // accepts three integers and returns a String
			// uses the coefficients of a quadratic equation in standard form and uses the quadratic formula to approximate the real roots
			double answer = Calculate.discriminant(a, b, c);
			double discriminantRoot = Calculate.sqrt(answer);
			double root1 = (-b + discriminantRoot) / (2 * a);
			double root2 = (-b - discriminantRoot) / (2 * a);
			if (answer < 0) {
			   return ("no real roots");
			} else if (answer > 0) {
			   return (root1 + " and " + root2);
			} else if (answer == 0) {
			   return (root1 + " ");
			}
		    return 0 + "";
			}
		
	}

}
	
	
	

	
