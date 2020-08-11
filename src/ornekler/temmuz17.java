package ornekler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class temmuz17 {

	public static void main(String[] args) {

		
			
		
		
		// Girilen sayýnýn pozitif,  
		//negatif veya sýfýr olup olmadýðýný yazdýrýn Java Kodunu yazýnýz.
		
		
		Scanner input = new Scanner (System.in);
		System.out.println("Lütfen gün numarasýný giriniz");
		int day = input.nextInt();
		
		
		switch (day) {
		
			case (1):
				System.out.println("Pazartesi");
		break;
			case (2):
				System.out.println("Salý");
		break;
			case (3):
				System.out.println("Çarþamba");
		break;
			case (4):
				System.out.println("Perþeme");
		break;
			case (5):
				System.out.println("Cuma");
		break;
			case (6):
				System.out.println("Cumartesi");
		break;
			case (7):
				System.out.println("Pazar");
		default:
		
		
		}
		
		
		/*
		
		
		
		//*********************************************************
		 
		int num1 = input.nextInt();
		System.out.println("Lütfen bir sayý daha giriniz");
		int num2= input.nextInt();
		
		if (num1>num2) {
			System.out.println("Ýlk Sayý Büyük");
		
		}else if(num1<num2) {
			System.out.println("Ýlk sayý küçük");
		}else 
			System.out.println("Eþit");
		
		

		//*********************************************************
		 Aþaðýdaki multi dimensional array’in 
		 iç array’lerindeki tum elemanlarýn toplamýný birer birer bulan  
		 ve herbir sonucu yeni bir array’in elemaný yapan ve yeni array’i 
		 ekrana yazdýran bir program yazýnýz   { {1,2,3}, {4,5}, {6,7} }   
		 Ornegin; { {1,2,3}, {4,5}, {6,7} }  ==> 1+2+3=6  4+5=9  6+7=13  ==>  output: {6, 9, 13}

	
		
		int arr [][] = { {1,2,3}, {4,5}, {6,7}};
		
		int arrYeni [] = new int [arr.length];
		
		
		int sum = 0;
		for(int i = 0; i<arr.length;i++) {
			for(int k = 0; k < arr[i].length;k++) {
			sum = sum + arr [i][k];	
			}
			arrYeni [i] = sum; 
			sum=0;
		}
		
		System.out.println(Arrays.toString(arrYeni));
		
		
		
		
		System.out.print(arr[0][0] + arr[0][1]+arr[0][2] + ",");
		System.out.print(arr[1][0] + arr[1][1]+ ",");
		System.out.println(arr[2][0] + arr[2][1]);
		
		int arr1 [] = {6,9,13};
		
		System.out.println(Arrays.toString(arr1));
		
		*/
		
		
		
		
		
	/*
		
		List <String> liste = new ArrayList <>();
		
		liste.add("A");
		liste.add("C");
		liste.add("E");
		liste.add("F");
			
			System.out.println(liste);
			
		liste.add("B");
		liste.add(1,"L");
		System.out.println(liste);
		
		liste.set(3, "D");
		System.out.println(liste);
		
		liste.remove("F");
		System.out.println(liste);
		
		
		Collections.sort(liste);
		System.out.println(liste);
		
		
		
		System.out.println(liste.contains("L"));
		
		System.out.println(liste.contains("M"));
		
		
		System.out.println(liste.size());
		
		liste.clear();
		System.out.println(liste);
	
		System.out.println(liste.isEmpty());
		
		
		
	//*****************************************************************	
	
		List <String> l = new ArrayList <> ();
		
		l.add("Kedi");
		l.add("Köpek");
		l.add("Inek");
		l.add("Koyun");
		
	l.remove(0);			// 0 indexteki elemaný siler
	System.out.println(l);  //  [Köpek, Inek, Koyun] sildikten sonraki son liste 
	System.out.println(l.remove(0)); // Sildiði elemaný gösterir // Köpek
	System.out.println(l.remove("Koyun")); // Treu
		
		
			
		List <String> al = new ArrayList <> ();
		
		al.add("Z");
		al.add("X");
		al.add("W");
		
		System.out.println(l);
		System.out.println(al);
		System.out.println(l.equals(al));
		
		
	
		
		
		List <String> l1 = new ArrayList<>();
		l1.add("Fethi");
		l1.add("Kaya");
		l1.add("Ilyas");
		l1.add("Diyarbakýr");
		l1.add(0, "A");
		l1.add(3, "B");
		System.out.println(l1);
		
		
		// List içindeki elemanlarý görme, list büyüklüðü
		
		l1.size();  					// Hepsini listler  // [A, Fethi, Kaya, B, Ilyas, Diyarbakýr]
		System.out.println(l1.size());	// Adetini verir. // 6
		
		
		System.out.println(l1.isEmpty());
		System.out.println(l.isEmpty());
		
		
		// list de eleman silme
		
		l1.remove(0);
		System.out.println(l1);
		
		System.out.println(l1.remove("X"));
		
		
		List <String> l2 = new ArrayList<>();
		l2.add("Fethi");
		l2.add("Kaya");
		l2.add("Ilyas");
		l2.add("Diyarbakýr");
		l2.add(0, "A");
		l2.add(3, "B");
		
		System.out.println(l2);
		
		// Elemaný deðiþtirme
		
		l2.set(3, "Petersburg");
		System.out.println(l2);
		System.out.println(l2.set(3, "Petersburg"));
		
		
		// Eleman va mý yok mu?
		
		l2.contains("X");
		System.out.println(l2);  // Eleman olmadýðý için iþlem yapmaz.
		System.out.println(l2.contains("X")); // Varsa True, yoksa false
		
		
		// Natural order'e göre sýralama, harf yada büyükten küçüðe
		
		Collections.sort(l2);
		System.out.println(l2);
		
		// Tersten sýlama
		
		Collections.reverse(l2);
		System.out.println(l2);
		
		// Eþit mi?
		
		System.out.println(l2.equals(l));
		
		
		// Tamamen silme
		
		al.clear();
		System.out.println(al);
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
