package agustos;

import java.util.Scanner;

public class StringTersiOku {

	public static void main(String[] args) {

		
		 // Kullan�c�dan bir metin isteyin ve bu metni tersten yazd�r�n
		 
		Scanner scan = new Scanner (System.in);
		System.out.println("L�tfen bir kelime giriniz");
		String k = scan.nextLine();
		int kTersi =k.length()-1;
		
		
		for (int i = kTersi; kTersi>=0; kTersi--) {
			System.out.print(k.charAt(kTersi));
		}
		
		
	}

}
