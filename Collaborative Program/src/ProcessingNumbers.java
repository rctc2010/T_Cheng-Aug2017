
/*Teresa Cheng
 * 10/04/17
 * Practicing writing pseudo code and programming according to another person's pseudo code.
 * Processing numbers using a scanner. 
 */
import java.util.*;
 
 public class ProcessingNumbers {
 	public static void main(String args[]) {
 		Scanner userInput = new Scanner(System.in);
 		System.out.print("How many numbers do you want to add? ");
 		int totalNumber = userInput.nextInt();
 		System.out.println("Enter your numbers.");
 		int min = 0;
 		int max = 0;
 		int maxEven = 0; 
 		int sumEven = 0;
		boolean minSet = false;
 		boolean maxSet = false;
     	boolean maxEvenSet = false;
 		for (int i = 0; i < totalNumber; i++) {
 			
 			int next = userInput.nextInt();
 					
 			if(next % 2 == 0) {
 				sumEven += next;
 				if(!maxEvenSet || next > maxEven) {
 					maxEvenSet = true;
 					maxEven = next;
 				}
 			}
 			if(!minSet || next < min) {
 				minSet = true;
 				min = next;
 			}
 		if(!maxSet || next > max) {
 				maxSet = true;
 				max = next;
 			}
 		}
 		System.out.println("Smallest number = " + min);
 		System.out.println("Largest number = " + max);
 		System.out.println("Sum of even numbers = " + sumEven);
 		System.out.println("Largest even number = " + maxEven);
 		
 		
 		}
 	}




	
