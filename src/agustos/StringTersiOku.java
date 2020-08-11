package agustos;

import java.util.Scanner;

public class StringTersiOku {

	public static void main(String[] args) {

		
		 // Kullanýcýdan bir metin isteyin ve bu metni tersten yazdýrýn
		 
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen bir kelime giriniz");
		String k = scan.nextLine();
		int kTersi =k.length()-1;
		
		
		for (int i = kTersi; kTersi>=0; kTersi--) {
			System.out.print(k.charAt(kTersi));
		}
		
		
	}

}
