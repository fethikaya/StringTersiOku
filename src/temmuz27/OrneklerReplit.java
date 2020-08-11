package temmuz27;

import java.util.Scanner;

public class OrneklerReplit {

	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lütfen bir harf giriniz");
		char harf = scan.next().charAt(0);
		
		if (harf == 'a' && harf == 'e' && harf == 'i' && harf=='o' &&harf=='u') {
			System.out.println(harf + " " + "i hafri sesli harftir");
		}else {
			System.out.println(harf + " "+ "harfi sesiz harftýr");
		}
		
		
		/*
		System.out.println("Lütfen bir string giriniz");
		String str = scan.nextLine();
		
		String tersiString = "";
		for (int i = str.length()-1; i >=0; i--) {
			tersiString = tersiString + str.charAt(i);
			
		}
		System.out.println(tersiString);
		
		
		
	
	//--------------------------------------------------------------
	 * 
		StringBuilder stb = new StringBuilder ("Diyarbakýr");
		
		stb.reverse();
		System.out.println(stb);
		
	//	String tersiString = "";
		for (int i = stb.length()-1; i <=0; i--) {
		//	tersiString = tersiString + stb.charAt(i);
			
		}
	
		System.out.println(stb);
		
		*/
		
	}		
}
