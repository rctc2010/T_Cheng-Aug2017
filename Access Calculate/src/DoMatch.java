/*Teresa Cheng
	* September 6, 2017
	*This is the runner for the calculate library, It is used to test the methods in calculate.
	*/
public class DoMatch {

	public static void main(String[] args) {
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(2));
		System.out.println(Calculate.average(4.0, 1.0));
		System.out.println(Calculate.average(1.5, 2.5, 3.0));
		System.out.println(Calculate.toDegrees(6.28));
		System.out.println(Calculate.toRadians(360.0));
		System.out.println(Calculate.discriminant(1.0, 9.0, 3.0));
		System.out.println(Calculate.toImproperFrac(5, 1, 2));
		System.out.println(Calculate.toMixedNum(11, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
		System.out.println(Calculate.isDivisibleBy(8, 2));
		System.out.println(Calculate.absValue(1.5));
		
		System.out.println(Calculate.max(1.5, 3.5, 5.5));
		System.out.println(Calculate.min(10, 5));
	
		
	}

}

	