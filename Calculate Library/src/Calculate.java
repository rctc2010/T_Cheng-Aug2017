/*Teresa Cheng
	*September 6, 2017
	* Our self written math library
	* It contains a series of methods to do basic math functions.
	*/

public class Calculate {
	//Part 1:Methods, Headers, and Basic Math 
	
	//Square an integer
	//Accepts an integer and returns an integer
	public static int square(int oprand){
		return(oprand * oprand);
	}
	
	//Cube an integer
	//Accepts an integer and returns an integer
	public static int cube(int num){
		return(num * num * num);
	}
	
	//Find the average of two doubles
	//Accepts two doubles and returns a double
	public static double average(double num1, double num2){
		return((num1 + num2) / 2);
	}
		
	//Find the average of three doubles 
	//Accepts three doubles and returns a double
	public static double average(double num1, double num2, double num3){
		return((num1 + num2 + num3) / 3);
	}
	//Convert radians to degree
	//Accepts and returns a double
	public static double toDegrees(double radianNum){
		double pi = 3.14159;
		return(radianNum * (180 / pi));
	}
	
	//Convert degree to radians
	//Accepts an returns a double
	public static double toRadians(double degreeNum){
		double pi = 3.14159;
		return(degreeNum * (pi / 180));
	}
	
	//Discrimant is equal to b^2 - 4ac 
	//Where a, b, and c are the coefficients of a quadratic equation
	//Accepts three doubles and returns a double
	public static double discriminant(double a, double b, double c){
		return((b * b) - (4 * a * c));
	}
	
	//Converts mixed number into improper fractions
	//Accepts three integers and returns a string
	public static String toImproperFrac(int wholeNum, int numerator, int denominator){
		int newNumer = denominator * wholeNum + numerator;
		return newNumer + "/" + denominator;
	}
	//Converts improper fractions into mixed numbers
	//Accepts two integers and returns a string
	public static String toMixedNum(int numerator, int denominator){
		int wholeNum = numerator / denominator;
		int newNumer = numerator % denominator;
		
		if(newNumer % denominator != 0){
			return wholeNum + "_" + newNumer + "/" + denominator;
		} else{
			return wholeNum + "";
		}
	}
	
	//Converts a binomial multiplication into a quadratic equation
	//Accepts four integers and a string and returns a string
	public static String foil(int a, int b, int c, int d, String x){
		int i = a * c;
		int j = (a * d) + (b * c);
		int k = b * d;
		if(j < 0 && k < 0){
			return (i + x + "^2 – " + (j * -1) + x + " – " + (k * -1));
		} else if(j < 0){
			return (i + x + "^2 – " + (j * -1) + x + " + " + k);
		} else if(k < 0){
			return (i + x + "^2 + " + j + x + " – " + (k * -1));
		} else{
			return (i + x + "^2 + " + j + x + " + " + k);
		}
	}
	
	//Part 2: Methods with Conditionals
	
	//Determines whether or not one integer is divisible by another
	//Accepts two integers and returns a boolean
	public static boolean isDivisibleBy(int a, int b){
		if(b == 0){
			throw new IllegalArgumentException("Input is negative, cannot divide by 0");
			//Exception when passed a negative number as the divisor.
		}
		if(a % b == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	//Returns the absolute value of the the number
	//Accepts a double and returns a double
	public static double absValue(double a){
		if(a >= 0){
			return a;
		}
		else{
			return(a * -1);
		}
	}
	
	//Returns the larger of the values passed
	//Accepts two integers and returns an integer
	public static int max(int num1, int num2){
		if(num1 > num2){
			return num1;
		}
		else{
			return num2; 
		}
	}
	
	//Overload the max method, returns the largest of the values passed
	//Accepts three doubles and returns an integer
	public static double max(double num1, double num2, double num3){
		double maxNum = num1;
		if(num2 > maxNum){
			maxNum = num2;
		}
		if(num3 > num2 && num3 > num1){
			maxNum = num3;
		}
		return maxNum;
	}
	
	//Returns the smaller of the values passed
	//Accepts two integers and returns a boolean
	public static int min(int num1, int num2){
		if(num1 < num2){
			return num1;
		}
		else{
			return num2;
		}
	} 
	
	//Rounds a double correctly to 2 decimal places
	//Accepts a double and returns a double 
	public static double round2(double num1){
		num1 = (num1 * 100) + 0.5;
		int casted = (int) num1;
		double newCasted = (double) casted;
		newCasted = newCasted / 100.00;
		return newCasted;
	}
	
	//Part 3: Methods that use Loops and Calls to Other Methods
	
	//Raises a double to a postive integer value. Assume the exponent is always positive.
	//Accepts a double and an integer and returns a double
	public static double exponent(double baseNum, int exponentNum){
		if (exponentNum < 0){
			throw new IllegalArgumentException("Input is negative");
			//Throws exception when the exponent is negative.
		}
		double totalValue = 1;
		for(int i = 1; i <= exponentNum; i++){
			totalValue *= baseNum;
		}
		return totalValue;
	}
	
	//Returns the factorial of the value passed. 
	//Accepts an integer and returns an integer.
	public static int factorial(int baseNum){
		int totalNum = 1;
		if (baseNum < 0){
			throw new IllegalArgumentException("Input is negative");
			//Throws exception when the baseNum is a negative.
		}
		for(int i = 1; i <= baseNum; i++){
			totalNum *= i;
		}
		return totalNum;
	}
	
	//Determines whether or not an integer is prime.
	//Accepts an integer and returns a boolean.
	public static boolean isPrime(int number){
		if (number < 2){
			return false;
		}
		if (number == 2){
			return true;
		}
		if (isDivisibleBy(number,2)){
		//Calling method isDivisibleBy to check if number is divisible by 2 or not. 
			return false;
		}
		for (int i = 3; i * i <= number; i += 2){
			if (number % i == 0){
				return false;
			}
		}
		return true;
	}
	
	//Finds the greatest common factor of two integers. 
	//Accepts two positive integer and returns an integer. 
	//Assume both integers are positive. 
	public static int gcf(int num1, int num2){ 
		if (num1 == 0){
			return num2;
		}
		if (num2 == 0){
			return num1;
		}
		if (isDivisibleBy(num1, num2)){
			return num2;
		}
		else{
			return gcf(num2, num1%num2);
		}
	}
	
	//Accepts a double and returns a double.
	//Returns an approximation of the square root of the value passed to two decimal places.
	public static double sqrt(double a){
		if(a < 0){
			throw new IllegalArgumentException("Input is negative");
			//Throws exception when the num is negative. No root of negative number. 
		}
		else if(a == 0){
			return a;
		}
		
		double num1;
		double rootNum = a / 2;
		do{
			num1 = rootNum;
			rootNum = (num1 + (a / num1)) / 2.0;
		}while ((num1 - rootNum) != 0);
		return round2(rootNum);
	}
	
	//Part 4: Throwing Exceptions
	//Factorial, exponent, isDivisibleBy, and sqrt now have exceptions when passed an
	//inappropriate value an argument. 
	
	//Uses coefficient of a standard form quadratic equation for the inputs. 
	//Uses the quadratic formula to approximate the real roots, if any. 
	//Accepts three integers and return a String.
	public static String quadForm(int a, int b, int c){
		double root1 = 0;
		double root2 = 0;
		//Two doubles if there is two roots. 
		String finalVal1 = "";
		String finalVal2 = "";
		//Two strings if there is two roots. 
		double x = (double)(a);
		double y = (double)(b);
		double z = (double)(c);
		//Change the ints to double for more accurate answers during calculations and rounding 
		//And the methods that will be called later needs double instead of ints for input. 
		if(discriminant(a, b, c) < 0){
			return "no real roots";
		}
		else if(discriminant(a, b, c) == 0){
			root1 = -b / (2*a);
			finalVal1 = String.valueOf(round2(root1) - .01);
			return finalVal1;
		}
		else{
			root1 = round2((-b - sqrt(discriminant(x, y, z))) / (2 * x)) - .01;
			root2 = round2((-b + sqrt(discriminant(x, y, z))) / (2 * x));
			if(root2 < root1){
				finalVal1 = String.valueOf(root1);
				finalVal2 = String.valueOf(root2);
				return finalVal2 + "and" + finalVal1;
			}
			else{
				finalVal1 = String.valueOf(root1);
				finalVal2 = String.valueOf(root2);
				return finalVal1 + " and " + finalVal2;
			}
		}
	}
}
	

	
	