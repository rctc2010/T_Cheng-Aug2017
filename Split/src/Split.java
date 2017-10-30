//Teresa Cheng
//10/23/17
//Split

import java.util.Arrays;

public class Split 
{

	public static void main(String[] args) 
	{
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
		//		it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples"split("really")
		//		it will split at the word "really" and return an array of ["I "," like "," apples!"]
		
		//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?
		
		String str = "I reallyreally like apples";
		String[] split = str.split("really");
		System.out.println(Arrays.toString(split));
		
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
		splitBread("applespineapplesbreadlettustomatobaconmayohambreadcheese");
		
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/
		splitSpaces("apples pineapples bread lettus tomato bacon mayo ham bread cheese");

		
	}
	public static void splitBread(String bread){
		String str = bread;
		String[] arrayBread = str.split("bread");
		//Test to see if it is a sandwich or not(two breads at least)
		if (arrayBread.length <= 2){
			System.out.println("Not a sandwich");
		}
		else {
			for(int i = 1; i < arrayBread.length - 1; i++){
				String breadMiddle = arrayBread[i];
				if(arrayBread[i].equals(" ")){
				}
				else{
					System.out.println("The sandwich includes: " + breadMiddle);
					//Only prints the text between bread. 
				}
			}
		}
	}
	
	public static void splitSpaces(String sandwich){
		String str = "";
		String strNoSpaces = " ";
		String[] arraySpaces = sandwich.split(" ");
		String[] breadArray = sandwich.split("bread");
		for(int i = 0; i < arraySpaces.length; i++){
			strNoSpaces += arraySpaces[i];
		}
		strNoSpaces = " " + strNoSpaces + " ";
		//Add spaces to the end just in case it will affect the code
		if (arraySpaces.length <= 2){
			System.out.println("It is not a sandwich");
			//Check if the String is a sandwich. 
		}
		else{
			for(int i = 1; i < breadArray.length - 1; i++){
				if(breadArray[i].equals("") && i == breadArray.length - 2){
					System.out.println("It is not a sandwich");
				}
				else{
					str += breadArray[i];
				}
			}
		}
		System.out.println("The sandwich includes: " + str);
		//Prints the text inside the two bread including the spaces
	}


}