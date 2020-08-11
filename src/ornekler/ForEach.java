package ornekler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {

		
		List <Integer> liste = new ArrayList <> ();
		
		liste.add(10);
		liste.add(11);
		liste.add(12);
		liste.add(13);
		liste.add(14);
		liste.add(15);
		liste.add(1, 8);
		liste.set(3, 16);
		liste.remove(1);
		liste.add(12);
		Collections.sort(liste);
		System.out.println(liste);
		System.out.println(liste.size());
		System.out.println(liste.isEmpty());
		
		int sum = 0;
		for (int w : liste) {
			sum = sum + w;
		}
		System.out.println(sum);
		
		//----------------------------------------
		
		int product = 1;
	
		for (int w : liste) {
			product*=w;
		}
		System.out.println(product);
		
		//---------------------------------
		
		Collections.reverse(liste);
		System.out.println(liste);
		
		int cikarma = 0;
		for (int w : liste) {
			cikarma-=w;
			
		}
		
		System.out.println(cikarma);
		
		//-------------------------------------
		
		// ortalama bul
		
		double sum1 = 0;
		for (int w : liste) {
			sum1 = sum1 + w /7;
		}
		
		System.out.println(sum1);
	
		//-----------------------------------------------
		
		// çift sayılar
		
	
		for (int w : liste) {
			if (w%2==0) {
				System.out.print (w + ",");
			}
		}
		
		//-----------------------------------------
		
		// ilk 3 sayı
		
		System.out.println();
		
		int count = 0;
		for (Integer w : liste) {
				System.out.print(w + ",");
				count++;
			if (count ==3) {
				break;
			}
		}
		
		//----------------------------------------------------
		
		
		
		
		
		
		
		
		
	}

}
