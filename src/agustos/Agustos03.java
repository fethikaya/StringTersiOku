package agustos;

import java.util.Arrays;
import java.util.Scanner;

public class Agustos03 {

	public static void main(String[] args) {

		
		int num1 = 12;

		int num2 = 0;

		try {

			  System.out.println(num1/num2);

			  }catch(ArithmeticException e) {

			  System.out.println("Sifir ile bolme yapilmaz");

			  }catch(Exception e) {

			  System.out.println("Her exception'i yakala");

			  }
		
		
		/*
		
		int arr [] = {1,2,3,4};
		
		for(int i=arr.length; i>0;i--)  { 
			
            System.out.print((arr[i-1]) +","); 
		
		}
		
		
		
		// Dakikayý saniyeye çeviren Java methodunu yazýnýz.
		
		int dakika = 5;
		int san = dakika * 60;
		System.out.println(san);
		
		
	
		
		// Girilen Stringdeki  tüm sesli harfleri saymak için bir Java Methodu yazýnýz.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Lütfen bir String giriniz");
		String str = sc.nextLine();
		String sesli = "a,e,i,o,u";
		int count = 0;
		
		
		for(int i = 0 ; i<=str.length()-1;i++){
		for(int j= 0 ; j<=sesli.length()-1;j++){
		if(str.charAt(i)==sesli.charAt(j)) {
			count++;
		}
		
	}

}
		System.out.println("Stringdeki sesli harf sayýsý:" + count);
		
		
		
		
		
		
		// Üç sayý arasýndaki en küçük sayýyý bulmak için bir Java METHOD yazýn.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Lütfen 3 sayý giriniz");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		 
		if (num1<num2 && num1<num3) {
			System.out.println(num1);
		}else if (num2<num1 && num2<num3) {
			System.out.println(num2);
		} else {
			System.out.println(num3);
		}
		
		
		
		
		  
		 
		// Girilen String deðerin uzunluðunu yazdýran Java kodunu yazýnýz.
		
		Scanner scan = new Scanner (System.in);
		String str = "techproed.com";
		System.out.println(str.length());
		
		
		
		
		
		// Girilecek iki String nesnesinin 
		// ayný verileri içerip içermediðini kontrol etmek için bir Java programý yazýn.
		
		
		Scanner input = new Scanner (System.in);
		System.out.println("Lütfen bir String giriniz");
		String str1 = input.nextLine();
		System.out.println("Lütfen bir String daha giriniz");
		String str2 = input.nextLine();
		
		System.out.println(str1.contains(str2));
		
		
		*/
		
		
	
	}
}
