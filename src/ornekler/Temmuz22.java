package ornekler;

import java.util.Scanner;

public class Temmuz22 {

	public static void main(String[] args) {

		
		
		
		
		
		
		
		// Varargs 
		
		carpma (2,3,5,6,1,10);
				
		kelime ('F','e','t','h','i');
		
		
		//---------------------------------
	}

	public static void carpma (int... y) {
		
	int product = 1;
	for (int w : y) {
		product = product *w;
		
	}
	System.out.println(product);
	}
	
	//----------------------------------------
	
	
	public static void kelime (char... x) {
		
		String yazi = "";
		
		for (char w : x) {
			yazi = yazi+w;
		}
		System.out.print(yazi + ",");
	}
	
	
	
}
