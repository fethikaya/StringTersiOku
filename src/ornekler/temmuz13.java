package ornekler;

import java.util.Scanner;

public class temmuz13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		/* Kullan�c�dan say� al�n,
		 Say� �ift say� ise, ekrana kazand�n�z yazd�r�n.
		 say� tek ise kaybettiniz yazd�r�n. ve yeni bir say� isteyin 
		 
		 */
		
		int s =0;
		do {
			if (s%2!=0) {
				System.out.println("Kaybetiniz");
				
			}System.out.println("Bir Say� giriniz");
			s= scan.nextInt();
			
		}while (s%2!=0);
		System.out.println("Kazand�n�z");
		
		//---------------------------------------------------------------------
		
		/* Kullan�c�dan say� al�n
		 say� 10 veya 10dan b�y�kse ekrana kazand�n�z yaz�n
		 say� 10 dan k���kse kaybettiniz yaz�n
		
		
		int r = 20 ;
		
		do {
			if (r<=10) {
				System.out.println("Kayabetiniz");
				
			}System.out.println("Bir say� giriniz");
			r = scan.nextInt();
			
			}while (r<=10);
				System.out.println("Kazandiniz");
				
		
		//-------------------------------------------------
		
		
		/*
		dowhile kullanarak 1-10 ras� say�lar� ekrana yazd�n�z
		
		
		int i =1;
		do {
			System.out.print(i+ ",");
			i++;
		}while (i<=10);
		
		/*
		Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n ve 
		ba�lang�� de�erinden ba�lay�p biti� de�erinde  biten 4 ve 6 ile 
		b�l�nebilen t�m tamsay�lar� ekrana yazd�r�n�z.
		
		
		System.out.println("L�tfen say� giriniz");
		int num1 = scan.nextInt();
		System.out.println("L�tfen ikinci say� giriniz");
		int num2 = scan.nextInt();
		
		for (int i =num1; i<=num2;i++) {
			if (i%4==0 && i%6==0) {
				System.out.print(i + ",");
			}
		}
		
		
		/*
		int i = num1;
		while (i<=num2) {
			if (i%4==0 && i%6==0) {
				
				System.out.print(i + ",");
			}
			i++;
		}
		*/
		
		
		
		/*
		
		// 9 den 190 e kadar 7 nin kati olan t�m tamsay�lar� ekrana yazd�r�n�z.

		int s1 = 9;
		int s2 = 190;
		
		
		
		 
		int i =9;
		
		while(i<=190) {
			i++;
			System.out.print(i + ",");
		}
		
	/---------------------------------
		
		 * for (int i =9; i<=190;i++) {
			if (i%7==0) {
				System.out.print(i + ",");
			}
		}
		
		*/
		
		
		
		/*
		// Kullan�c�dan iki say� al�n�z, 
		// ve bu say�lar aras�da yer alan  t�m say�lar� �arp�n. 
		
		System.out.println("L�tfen ba�lang�c say�y� giriniz");
		
		int bsayi = scan.nextInt();
		System.out.println("L�tfen biti� say�y� giriniz");
		int sonSayi= scan.nextInt();
		
		int product = 1;
		
		int i = bsayi;
		while (i<=sonSayi) {
			product = product * i;
			i++;
		
			
			//--------------------------------------------
		 //for (int i =bsayi; i<=sonSayi ; i++){
			//product = product * i;
			
			System.out.print(product);
		}
		
		
		/*
		 
		//-------------------------------------
		
		// ilk 10 b�y�k harfin ASCII de�rleri toplam�n� ekrana yazd�r�nz
		
		int sum = 0;
		int i = 'A';
		
		while (i<='J') {
			sum = sum+i;
			i++;
		
			System.out.println("Toplam: " + sum);
			
		}
		
		*/
		
		
		scan.close();
	}

}
