package ornekler;

import java.util.Scanner;

public class temmuz13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		/* Kullanýcýdan sayý alýn,
		 Sayý çift sayý ise, ekrana kazandýnýz yazdýrýn.
		 sayý tek ise kaybettiniz yazdýrýn. ve yeni bir sayý isteyin 
		 
		 */
		
		int s =0;
		do {
			if (s%2!=0) {
				System.out.println("Kaybetiniz");
				
			}System.out.println("Bir Sayý giriniz");
			s= scan.nextInt();
			
		}while (s%2!=0);
		System.out.println("Kazandýnýz");
		
		//---------------------------------------------------------------------
		
		/* Kullanýcýdan sayý alýn
		 sayý 10 veya 10dan büyükse ekrana kazandýnýz yazýn
		 sayý 10 dan küçükse kaybettiniz yazýn
		
		
		int r = 20 ;
		
		do {
			if (r<=10) {
				System.out.println("Kayabetiniz");
				
			}System.out.println("Bir sayý giriniz");
			r = scan.nextInt();
			
			}while (r<=10);
				System.out.println("Kazandiniz");
				
		
		//-------------------------------------------------
		
		
		/*
		dowhile kullanarak 1-10 rasý sayýlarý ekrana yazdýnýz
		
		
		int i =1;
		do {
			System.out.print(i+ ",");
			i++;
		}while (i<=10);
		
		/*
		Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn ve 
		baþlangýç deðerinden baþlayýp bitiþ deðerinde  biten 4 ve 6 ile 
		bölünebilen tüm tamsayýlarý ekrana yazdýrýnýz.
		
		
		System.out.println("Lütfen sayý giriniz");
		int num1 = scan.nextInt();
		System.out.println("Lütfen ikinci sayý giriniz");
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
		
		// 9 den 190 e kadar 7 nin kati olan tüm tamsayýlarý ekrana yazdýrýnýz.

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
		// Kullanýcýdan iki sayý alýnýz, 
		// ve bu sayýlar arasýda yer alan  tüm sayýlarý çarpýn. 
		
		System.out.println("Lütfen baþlangýc sayýyý giriniz");
		
		int bsayi = scan.nextInt();
		System.out.println("Lütfen bitiþ sayýyý giriniz");
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
		
		// ilk 10 büyük harfin ASCII deðrleri toplamýný ekrana yazdýrýnz
		
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
