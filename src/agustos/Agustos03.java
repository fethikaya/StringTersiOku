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
		
		
		
		// Dakikay� saniyeye �eviren Java methodunu yaz�n�z.
		
		int dakika = 5;
		int san = dakika * 60;
		System.out.println(san);
		
		
	
		
		// Girilen Stringdeki  t�m sesli harfleri saymak i�in bir Java Methodu yaz�n�z.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("L�tfen bir String giriniz");
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
		System.out.println("Stringdeki sesli harf say�s�:" + count);
		
		
		
		
		
		
		// �� say� aras�ndaki en k���k say�y� bulmak i�in bir Java METHOD yaz�n.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("L�tfen 3 say� giriniz");
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
		
		
		
		
		  
		 
		// Girilen String de�erin uzunlu�unu yazd�ran Java kodunu yaz�n�z.
		
		Scanner scan = new Scanner (System.in);
		String str = "techproed.com";
		System.out.println(str.length());
		
		
		
		
		
		// Girilecek iki String nesnesinin 
		// ayn� verileri i�erip i�ermedi�ini kontrol etmek i�in bir Java program� yaz�n.
		
		
		Scanner input = new Scanner (System.in);
		System.out.println("L�tfen bir String giriniz");
		String str1 = input.nextLine();
		System.out.println("L�tfen bir String daha giriniz");
		String str2 = input.nextLine();
		
		System.out.println(str1.contains(str2));
		
		
		*/
		
		
	
	}
}
