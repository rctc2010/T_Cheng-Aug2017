/*Teresa Cheng
 * October 17, 2017
 * Part 5:
 * This program includes methods from the Calculate Library
 *  to describe the graph of a quadratic function. 
 */

public class Quadratic {
	public static String quadDescriber(double a, double b, double c) {
		if (a == 0) {
			throw new IllegalArgumentException("not a quadratic function");
		}
		String output = "";
		output += "\nDescription of the graph of: \ny = " + a + " x^2 + " + b + " x + " + c + "\n";
		output += direction(a);
		output += "\nAxis of Symmetry: ";
		output += axisofSym(a, b);
		output += "\nVertex: ";
		output += vertex(a, b, c);
		output += "\nx-intercept(s): ";
		output += quadForm(a, b, c);
		output += "\ny-intercept: " + c;
		return output;
	}
	//Accepts a double and returns a string.
	//Determines if the function opens up or down.
	public static String direction(double a) {
		if(a < 0) {
			return "\nOpens: Down";
		} else {
			return "\nOpens: Up";
		}
	}

	//Accepts two doubles and returns a double.
	//Determines the axis of symmetry of the function. 
	public static double axisofSym(double a, double b) {
		double axs = -b / (2 * a);
		return axs;
	}

	//Accepts three doubles and returns a string.
	//determines the vertex of the function.
	public static String vertex (double a, double b, double c) {
		double x = axisofSym(a, b);
		double y = a * x * x + b * x + c;
		return "(" + x + ", " + y + ")";
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
	//Accepts two doubles and returns a double
	public static double max(double num1, double num2){
		if(num1 > num2){
			return num1;
		}
		else{
			return num2; 
		}
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
	
	//Discrimant is equal to b^2 - 4ac 
	//Where a, b, and c are the coefficients of a quadratic equation
	//Accepts three doubles and returns a double
	public static double discriminant(double a, double b, double c){
		return((b * b) - (4 * a * c));
	}
	
	//Uses coefficient of a standard form quadratic equation for the inputs. 
		//Uses the quadratic formula to approximate the real roots, if any. 
		//Accepts three doubles and return a String.
		public static String quadForm(double a, double b, double c){
			double root1 = 0;
			double root2 = 0;
			//Two doubles if there is two roots. 
			String finalVal1 = "";
			String finalVal2 = "";
			//Two strings if there is two roots. 
			double x = (double)(a);
			double y = (double)(b);
			double z = (double)(c);
			
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

