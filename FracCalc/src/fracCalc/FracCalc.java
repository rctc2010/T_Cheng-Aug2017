package fracCalc;

import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	
    	Scanner userInput = new Scanner(System.in);
    	String cookie = userInput.nextLine();
    	//System.out.println("Please input your equation: ");
    	System.out.println(produceAnswer(cookie));
    	

    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
    	
        String[] stringSplit = input.split(" ");
        String operand1  = stringSplit[0];
        String operator = stringSplit[1];
        String operand2 = stringSplit[2];
        String[] splitOperand1 = operand1.split("_");
        String wholeNum;
        String numerator;
        String denominator;
        String wholeNum1;
        String numerator1;
        String denominator1;
        if(splitOperand1.length == 2){
        	wholeNum = splitOperand1[0];
            String[] splitOperand1Again = splitOperand1[0].split("/");
        	if(splitOperand1Again.length == 1){
        		numerator = splitOperand1Again[0];
        		denominator = "1";
        	} else{
        		numerator = splitOperand1Again[0];
        		denominator = splitOperand1Again[1];
        	}
        } else{
            String[] splitOperand1Again = splitOperand1[0].split("/");
            wholeNum = "0";
        	if(splitOperand1Again.length == 1){
        		numerator = splitOperand1Again[0];
        		denominator = "1";
        	} else{
        		numerator = splitOperand1Again[0];
        		denominator = splitOperand1Again[1];
        	}
        }
        String[] splitOperand2 = operand2.split("_");
        if(splitOperand2.length == 2){
        	wholeNum1 = splitOperand2[0];
            String[] splitOperand2Again = splitOperand2[1].split("/");
        	if(splitOperand2Again.length == 1){
        		numerator1 = splitOperand2Again[0];
        		denominator1 = "1";
        	} else{
        		numerator1 = splitOperand2Again[0];
        		denominator1 = splitOperand2Again[1];
        	}
        } else{
            String[] splitOperand2Again = splitOperand2[0].split("/");
        	if(splitOperand2Again.length == 1){
        		wholeNum1 = splitOperand2[0];
        		numerator1 = "0";
        		denominator1 = "1";
        	} else{
        		wholeNum1 = "0";
        		numerator1 = splitOperand2Again[0];
        		denominator1 = splitOperand2Again[1];
        	}
        }
        return ("whole:" + wholeNum1 + " numerator:" + numerator1 + " denominator:" + denominator1);
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    


public static int[] parse(String input)
{
	int whole = 0;
    int numer = 0;
    int denom = 1;
    if (input.indexOf('_') >= 0)
    {
    	whole = Integer.parseInt(input.substring(0, input.indexOf('_')));
    	numer = Integer.parseInt(input.substring(input.indexOf('_') + 1, input.indexOf('/')));
    	denom = Integer.parseInt(input.substring(input.indexOf('/') + 1));
    }
    else if (input.indexOf('/') >= 0)
    {
    	numer = Integer.parseInt(input.substring(0, input.indexOf('/')));
    	denom = Integer.parseInt(input.substring(input.indexOf('/') + 1));
    }
    else
    	whole = Integer.parseInt(input);
    int[] arr = {whole, numer, denom};
    return arr;
}

public static void reduce(int[] arr)
{
	if (arr[2] < 0)
	{
		arr[1] *= -1;
		arr[2] *= -1;
	}
	
	arr[0] = arr[1] / arr[2];
	arr[1] %= arr[2];
	
	int gcf = gcf(arr[1], arr[2]);
	arr[1] /= gcf;
	arr[2] /= gcf;
	
	if (arr[0] < 0 && arr[1] < 0)
		arr[1] *= -1;
}

public static String reformat(int[] arr)
{
	String input = arr[0] + "_" + arr[1] + "/" + arr[2];

	if (input.startsWith("0_"))
    	input = input.substring(2);
	
	if (input.indexOf("_0/") > 0)
		input = input.substring(0, input.indexOf("_0/"));
	else if (input.indexOf("0/") == 0)
		input = "0";
	
	if (input.endsWith("/1"))
		input = input.substring(0, input.length() - 2);
	
	return input;
}

public static int gcf(int num1, int num2) {
	/* i is declared before the for loop because
	 * it must be returned after the loop.
	 */
	int i;
	/* i can be initialized as either of
	 * the two inputs because any number
	 * greater than the smaller of the two
	 * is inherently invalid. The for loop
	 * continues while one of the numbers
	 * is not divisible by i.
	 */
	num1 = Math.abs(num1);
	num2 = Math.abs(num2);
	for(i = num2; !(isDivisibleBy(num2, i) && isDivisibleBy(num1, i)); i--) {}
	return i;
}

public static boolean isDivisibleBy(int dividend, int divisor) {
	/* An IllegalArgumentException will be thrown when the divisor
	 * is 0 because you cannot divide by 0.
	 */
	if(divisor == 0) {
		throw new IllegalArgumentException();
	}
	if(dividend % divisor == 0) {
		return true;
	} else {
		return false;
	}
}
}