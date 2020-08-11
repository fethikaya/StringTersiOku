package agustos;

import java.util.Scanner;

public class PaskalUcgen {

	public static void main(String[] args) {

		
	//	Scanner scan = new Scanner (System.in);
	//	System.out.println("Lütfen satýr sayýsý giriniz");
		int satir = 5;
		int bosluk = satir;
		int sayi = 1;
		
		for (int i = 0; i <satir; i++) {
			for (int j=1; j<=bosluk;j++) {
				System.out.print(" ");
			}
			sayi =1;
			for (int k=0; k<=i;k++) {
				System.out.print(sayi + " ");
				sayi = sayi * (i-k)/(k+1);
			}
			bosluk--;
			System.out.println();
		}
		
		
	}

}
