/*Teresa Cheng
 * October 17, 2017
 * Part 5:
 * This program calls the class Quadratic, which includes 
 * methods from the Calculate Library to describe the graph 
 * of a quadratic function." 
 * It will prompt the user to enter coefficients of a quadratic 
 * function in standard form and provide a description of the graph 
 * (the direction it opens, where its vertex is, and its intercepts).
 */
import java.util.*;

public class QuadraticClient {
	
	public static void main(String[] args) {
		Scanner userInput= new Scanner(System.in);
		boolean done = false;
		while (!done) {
			System.out.println("Provide values for coefficients a, b, and c ");
			System.out.print("a: ");
			double a = userInput.nextDouble();
			System.out.print("b: ");
			double b = userInput.nextDouble();
			System.out.print("c: ");
			double c = userInput.nextDouble();
			System.out.println(Quadratic.quadDescriber(a,  b,  c));
			System.out.println("\nDo you want to keep going? (type \"quit\" to end)");
			String finished = userInput.next();
			if (finished.equals("quit")) {
				done = true;
			}
			
		}
		userInput.close();
	}
}
