package ornekler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class temmuz18 {

	public static void main(String[] args) {

		
		// Bir String oluþturunuz, 
		// bu String’deki character’leri yukarýdan aþaðýya for-each loop kullanarak yazdýrýnýz. 
		
		String str = "Gözlerinden ötesini göremem ah göremem yar";
		
		String arr [] =str.split("");
		System.out.println(Arrays.toString(arr));
		List <String> list = Arrays.asList(arr);
		System.out.println(list);
		
		for (String w : list) {
			System.out.println(w);
		}
		
		
		
		/*
		
		//*******************************************
		
		List <String> liste3 = new ArrayList <> ();
		
		liste3.add("Fethi");
		liste3.add("Kaya");
		liste3.add("Ilyas");
		liste3.add("Zeynep");
		liste3.add("Emel");
		liste3.add("Oya");
		
		System.out.println(liste3);
		
	
		
	//**************************************************************	
		
		
	//	Ýki String array oluþturunuz ve bu array’lerdeki ortak elemanlarý For-each loop kullanarak bulunuz. 
	//	Sonucu ekrana yazdýrýnýz.  Ortak eleman yoksa ekrana “Ortak eleman yok” yazdýrýnýz 
		
		
		String arr1 []  = {"a","c","d","e","f","h","i"};
		String arr2 []  = {"a","e","i","o","u"};
		
		List <String> l1 = Arrays.asList(arr1);
		List <String> l2 = Arrays.asList(arr2);
		
		int count =0;
		
		for (String w :l1) {
		for (String w1 :l2) {
			if (w==w1) {
				System.out.print( w + ",");
				count++;
			}
		}
		}
		
		
		
		// *************************************************************
		
		
		//Bir integer list oluþturunuz ve bu list’deki tum sayýlarýn karesinin toplamýný 
		// For-each loop kullanarak bulunuz. Sonucu ekrana yazdýrýnýz.

		
		List <Integer> liste1 = new ArrayList <> ();
		
		liste1.add(2);
		liste1.add(3);
		liste1.add(4);
		liste1.add(5);
		
		int sum = 0;
		
		for (Integer w : liste1) {
			sum = sum +w*w ;
		}
			
		System.out.println(sum);
		
		
		
		 
		 
		 //*************************************************************
		 
	//	Bir integer array oluþturunuz ve bu array’deki tum sayýlarýn çarpýmýný 
	//	For-each loop kullanarak bulunuz. Sonucu ekrana yazdýrýnýz. 
		
		
		List <Integer> liste = new ArrayList <>();
		liste.add(2);
		liste.add(4);
		liste.add(6);
		liste.add(8);
		
		System.out.println(liste);
		
		int product = 1;
		
		for (Integer w :liste) {
			product = product * w ;
			
		}
		
		System.out.println(product);
		
		*/
		
		
		
		
		
		
	}

}
