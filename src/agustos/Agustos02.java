package agustos;

import java.util.Scanner;

public class Agustos02 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir string giriniz");
		String str = input.nextLine();
		str = "java is fun";
		System.out.println(str.toUpperCase());
		
		
		/*
		
		// Grilen String deðer içinde istenen sýradaki karakteri bulan Java kodunu yazýnýz.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir metin giriniz");
		
		String str = input.nextLine();
		str = "Java is fun" ;
		System.out.println(5 + "." + "pozisiyondaki carekter :" + str.charAt(5));
		
		
		
		// String cümleyi verilen örnek cümle ile karþýlaþtýran Java kodu yazýnýz.
		
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String str1 = input.nextLine();
		str = "techproed.com";
		str1 = "Techproed.com";
		
		System.out.println(str.equals(str1));
		
		
		
		
	    
		  Kullanýcýdan bir harf girmesini isteyiniz. 
		  Girilen harf sesli ise Sesli harf olduðunu, 
		  deðilse sessiz harf olduðunu ekrana yazdýrsýn. 
		  Girdiði deðer harf deðilse yada 1 karakterden fazla ise hata mesajý göstersin. 
		  (Test girilen harfi büyük yada küçüklüðüne duyarlýdýr.)
		  
		  Sesli harfler: a,e,i,o,u
		  
		   
	     Scanner input = new Scanner(System.in);
	        System.out.println("Lütfen bir harf giriniz");
	         
	      char harf = input.next ().charAt(0);
		
			if (harf == 'a' || harf == 'e' || harf == 'i' || harf=='o' || harf=='u') {
				System.out.println(harf + " " + "harfi sesli harftir");
			}else if (harf != 'a' || harf != 'e' || harf != 'i' || harf!='o' || harf!='u') {
				System.out.println(harf + " "+ "harfi sesiz harftýr");
			}else {
				System.out.println("Yanlýþ Karekter Girdiniz");
			}
		
		
		
			
			
		
		
		// Belirlenen sayýnýn 1 den 10 a kadar çarpým sonuçlarýný yapan Java programýný yazýnýz.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen bir sayý giriniz");
		int num1 = scan.nextInt();
		
		int count = 1;
		int product =1;
		
		for (int i = 0; i <=9; i++) {
			product = num1 * count;
			
			System.out.println(num1 + "X" + count + "=" + product);
			count ++;
		}
		
		
	
		 
		// Girilen String deðerde tersten yazan Java kodunu yazýnýz.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir string giriniz");
		String str = input.nextLine();
		for (int i = str.length()-1; i >=0 ; i--) {
			System.out.print(str.charAt(i));
		}
				
		
	
		 
		 
		// Kullanýcýnýn girdiði String deðerlerini büyük harfe çeviren Java kodunu yazýnýz.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir string giriniz");
		String str = input.nextLine();
		System.out.println(str.toUpperCase());
		
	
		
		//------------------------------------

		// Kullanýcýdan alýnan Stringin son karakteirini silep ekrana yazan Java kodunu yazýnýz.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir string giriniz");
		String str = input.nextLine();
		System.out.println(str.substring(0, str.length()-1));
		
		
		
		
		
		//---------------------------
		
		// Bir kelimenin string te yer alýp almadðýný kontrol edin
		
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		str = "Java is easy";
		System.out.println(str.contains("is"));
		System.out.println(str.contains("and"));
		
		
		 
		 //----------------------------------
		 
		 // 2 Stringi uc uca birleþtirin
		  
		System.out.println("Lütfen 2 String giriniz");
	    String str1 = input.nextLine();
	    String str2 = input.nextLine();
		
		System.out.println(str1 + " "+ str2);
		
		*/
		
	}

}
