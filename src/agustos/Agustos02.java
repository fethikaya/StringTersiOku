package agustos;

import java.util.Scanner;

public class Agustos02 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("L�tfen bir string giriniz");
		String str = input.nextLine();
		str = "java is fun";
		System.out.println(str.toUpperCase());
		
		
		/*
		
		// Grilen String de�er i�inde istenen s�radaki karakteri bulan Java kodunu yaz�n�z.
		
		Scanner input = new Scanner(System.in);
		System.out.println("L�tfen bir metin giriniz");
		
		String str = input.nextLine();
		str = "Java is fun" ;
		System.out.println(5 + "." + "pozisiyondaki carekter :" + str.charAt(5));
		
		
		
		// String c�mleyi verilen �rnek c�mle ile kar��la�t�ran Java kodu yaz�n�z.
		
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String str1 = input.nextLine();
		str = "techproed.com";
		str1 = "Techproed.com";
		
		System.out.println(str.equals(str1));
		
		
		
		
	    
		  Kullan�c�dan bir harf girmesini isteyiniz. 
		  Girilen harf sesli ise Sesli harf oldu�unu, 
		  de�ilse sessiz harf oldu�unu ekrana yazd�rs�n. 
		  Girdi�i de�er harf de�ilse yada 1 karakterden fazla ise hata mesaj� g�stersin. 
		  (Test girilen harfi b�y�k yada k���kl���ne duyarl�d�r.)
		  
		  Sesli harfler: a,e,i,o,u
		  
		   
	     Scanner input = new Scanner(System.in);
	        System.out.println("L�tfen bir harf giriniz");
	         
	      char harf = input.next ().charAt(0);
		
			if (harf == 'a' || harf == 'e' || harf == 'i' || harf=='o' || harf=='u') {
				System.out.println(harf + " " + "harfi sesli harftir");
			}else if (harf != 'a' || harf != 'e' || harf != 'i' || harf!='o' || harf!='u') {
				System.out.println(harf + " "+ "harfi sesiz harft�r");
			}else {
				System.out.println("Yanl�� Karekter Girdiniz");
			}
		
		
		
			
			
		
		
		// Belirlenen say�n�n 1 den 10 a kadar �arp�m sonu�lar�n� yapan Java program�n� yaz�n�z.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("L�tfen bir say� giriniz");
		int num1 = scan.nextInt();
		
		int count = 1;
		int product =1;
		
		for (int i = 0; i <=9; i++) {
			product = num1 * count;
			
			System.out.println(num1 + "X" + count + "=" + product);
			count ++;
		}
		
		
	
		 
		// Girilen String de�erde tersten yazan Java kodunu yaz�n�z.
		
		Scanner input = new Scanner(System.in);
		System.out.println("L�tfen bir string giriniz");
		String str = input.nextLine();
		for (int i = str.length()-1; i >=0 ; i--) {
			System.out.print(str.charAt(i));
		}
				
		
	
		 
		 
		// Kullan�c�n�n girdi�i String de�erlerini b�y�k harfe �eviren Java kodunu yaz�n�z.
		
		Scanner input = new Scanner(System.in);
		System.out.println("L�tfen bir string giriniz");
		String str = input.nextLine();
		System.out.println(str.toUpperCase());
		
	
		
		//------------------------------------

		// Kullan�c�dan al�nan Stringin son karakteirini silep ekrana yazan Java kodunu yaz�n�z.
		
		Scanner input = new Scanner(System.in);
		System.out.println("L�tfen bir string giriniz");
		String str = input.nextLine();
		System.out.println(str.substring(0, str.length()-1));
		
		
		
		
		
		//---------------------------
		
		// Bir kelimenin string te yer al�p almad��n� kontrol edin
		
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		str = "Java is easy";
		System.out.println(str.contains("is"));
		System.out.println(str.contains("and"));
		
		
		 
		 //----------------------------------
		 
		 // 2 Stringi uc uca birle�tirin
		  
		System.out.println("L�tfen 2 String giriniz");
	    String str1 = input.nextLine();
	    String str2 = input.nextLine();
		
		System.out.println(str1 + " "+ str2);
		
		*/
		
	}

}
