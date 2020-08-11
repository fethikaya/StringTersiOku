package ornekler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Temmuz20 {

	public static void main(String[] args) {

		
		// Array elemanlarý arasýnda en büyük elemaný bulan methodu yazalim.
		
		int arr3 [] = {9,13,18,7,45,22,60};
		
		Arrays.sort(arr3);
		int buyukRakam = 0;
		System.out.println(Arrays.toString(arr3));
		
		for (int i = 0; i < arr3.length; i++) {
			buyukRakam = arr3.length-1;
			
		}
		System.out.println();
		
	/*	
		
	//----------------------------------------------------------	
		
		// tas >makas
		// makas >kagit
		//kagit >tas
		
		
		int benKazandim = 0;
		int bilgisayarKazandi = 0;
		int oyunBitti = 3;
		
		List <String> oyun = new ArrayList <> ();
		
		oyun.add("Tas") ;
		oyun.add("Kagit");
		oyun.add("Makas");
		
		Scanner scan = new Scanner (System.in);
		
		while (benKazandim <oyunBitti && bilgisayarKazandi<oyunBitti) {
			 System.out.println("Tas secmek icin 0 \n Kagit secmek icin 1 \n Makas secmek icin 2 \n secin" );
		
			 int benimTahmin = scan.nextInt();
			 int bilgisayarTahmin = new Random().nextInt(3);
			 System.out.println(benimTahmin + "\n" + bilgisayarTahmin);
		
		if (benimTahmin == bilgisayarTahmin) {
			System.out.println("Beraber");
	
		}else if ((benimTahmin==0 && bilgisayarTahmin==2) ||(benimTahmin==1 && bilgisayarTahmin==0) || (benimTahmin ==2 && bilgisayarTahmin ==1)) {
			System.out.println("Kazandýnýz");
			benKazandim++;
		} else {
			System.out.println("Bilgisayar Kazandý");
			bilgisayarKazandi++;
		}
	}
		
		System.out.println("==GAME OVER==");
		System.out.println("Scor sen: " + benKazandim);
		System.out.println("Scon Bilgisayar: " + bilgisayarKazandi);
		
		
		
		
		
	
	

	//----------------------------------------------------------
	
	
		// Array elemanlarinin ortalamasini bulan java kodu yazalim.
		// 20,30,40,25,-15,55
		
		int arr2 [] = {10,-35,30,25,-15,55};		
		
		double sum = 0;
		double ortalama = 0;
		for (int i =0; i < arr2.length ; i++) {
			sum = sum + arr2[i];
			
		}
		ortalama = sum / arr2.length;
		System.out.println("Toplam : " + sum);
		System.out.println("Ortalama : " + ortalama);
		
		
		//-----------------------------------------------------------
		
	
	
		 
		
		//Array elemanlarinin matematige gore tersini alan bir method yazalim.
		
		 int arr1 [] = {2,3,-4,-1,-7,6,9,8,7};
		 Arrays.sort(arr1);
		 System.out.println(Arrays.toString(arr1));
		 
		 for (int w : arr1) {
			 w = w*-1;
			 System.out.print(w + " ");
		 }
		
		
	//-------------------------------------------------------------
		
		
		// 3 elamanlý String array oluþturulm
		// Fethi, Ýlyas, Angelika  
		// (tek tek ve liste halinde yazýn, her bir array elemanýni "Kaya" ekleyni)
		
		
		String arr [] = {"Fethi" , "Ilyas", "Angelika"};
		
		System.out.println(Arrays.toString(arr));
		
		for(int i =0; i< arr.length ; i++) {
		System.out.println(arr[i]);
		}
		
		System.out.println("==========================");
			for (String w: arr) {
				System.out.println(w);
			}
			
			
			System.out.println("==========================");
			
			String soyAdi = "Kaya";
			
			for (int i = 0; i <arr.length ; i++) {
				System.out.println(arr [i] + " " + soyAdi);
			}
			
			
			for (String w : arr) {
				System.out.println(w + " " + soyAdi);
			}
			
			
			
	//------------------------------------------------------------
		
		// Asal sayýyý bulan bir method yazýnýz
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen bir sayý giriniz");
		int sayi = scan.nextInt();
		
		int count = 0;
		
		for (int i = 0; i <= sayi; i++) {
			if (sayi%i==0) {
				count++;
			}
		}
		
		if (count ==2) {
			System.out.println("Asal sayý");
		}else {
			System.out.println("Asal deðil");
				
		}	
		
		*/
		
		
		
	}
	
}
