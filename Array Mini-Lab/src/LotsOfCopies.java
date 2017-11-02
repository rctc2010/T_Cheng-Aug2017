//Teresa Cheng
//November 1, 2017
//Period 2
import java.util.Arrays;

public class LotsOfCopies {
	public static void main(String[] args){
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1, 2, 3, 4, 5};
		changeMe(num, strMain, arrMain);
		System.out.println("In Main, num:" +num);
		System.out.println("In Main, strMain:" +strMain);
		System.out.println("In main, arrMain:"+Arrays.toString(arrMain));
	}
	public static void changeMe(int x, String str, int[] arr){
	//Part 1
		System.out.println("In changeMe, before the change, num (aka x)" + x);
		x = 6;
		System.out.println("In changeMe, after the change, num (aka x)" + x);
		
		System.out.println("In changeMe, before the change, strMain (aka str)" + str);
		str = "APCS at Mills";
		System.out.println("In changeMe, after the change, strMain (aka str)" + str);
		
		System.out.println("In changeMe, before the change, arrMain (aka arr)" + arr);
		arr[0] = 5;
		System.out.println("In changeMe, after the change, arrMain (aka arr)" +Arrays.toString(arr));
		
	//Part 2
		//a = start
		//b = a
		//a == new
		//b == ?
		
		//integer
		x=3;
		int bint = x;
		x=23;
		System.out.println("b:" + bint);
		//string
		str = "hello";
		String bstr = str;
		str = "hello there";
		System.out.println("bstr:" + bstr);
		//array
		int[] barr= arr;
		arr[0]=200;
		System.out.println("barr:" +Arrays.toString(barr));
	}

}


