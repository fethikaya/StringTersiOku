package ornekler;

import java.util.Scanner;

public class Temmuz23 {

	public static void main(String[] args) {


		StringBuilder stb = new StringBuilder ();
		
		stb.append("Fethi");
		System.out.println(stb);
		
		stb.append("Kaya");
		System.out.println(stb );
		
		
		//-------------------------
		
		StringBuilder stb1 = new StringBuilder (12);
		stb1.append("Diyarbakýr");
		System.out.println(stb1);
		
		//---------------------
		
		StringBuilder stb2 = new StringBuilder ("Fethi Kaya");
		System.out.println(stb2);
		
		
		
		stb2.charAt(5);
		System.out.println(stb2.charAt(5));
		
		
		
		// stb2.delete(5, 8);
		// System.out.println(stb2);
		
		
		stb2.indexOf("K");
		System.out.println(stb2.indexOf("K"));
		
		
		stb2.lastIndexOf("a");
		System.out.println(stb2.lastIndexOf("a"));
		
		
		stb2.insert(5, "-");
		System.out.println(stb2);
		
		stb2.length();
		System.out.println(stb2.length());
		
		stb2.replace(0, 5, "Ilyas");
		System.out.println(stb2);
		
		
		
		stb2.setCharAt(4, 'z');
		System.out.println(stb2);
		
		
		stb2.reverse();
		System.out.println(stb2);
		
		
		stb2.capacity();
		System.out.println(stb2.capacity());
		
		//----------------------------------------------------
		
		/*
		 Kullýncýdan bir String alýn
		 Stringin içinde küçük a varsa "Kazandýnýz",
		 yoksa kaybetiniz yazsýn ve yeni sayý isteyin. 
		 */
		
		
		
		
		Scanner scan = new Scanner (System.in);
		String str = "a";
		
		
		do {
			if (!str.contains("a")){
				System.out.println("Kaybettiniz");
			}
			System.out.println("Lütfen bir string giriniz");
			str = scan.nextLine();
			
		}while (!str.contains("a"));
		System.out.println("Kazandýnýz");
			
		
		
		
		
		
		
		
	}

}
