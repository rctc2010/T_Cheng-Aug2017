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
	public static double average (double oprand) {
		double average =(oprand+oprand)/2;
		return average;
	}

	
