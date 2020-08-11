package ornekler;

import java.util.Arrays;
import java.util.Scanner;

public class temmuz15 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 
		 
		 // Ekrana Amerika bayraðýný yazdýran Java kodunu yazýnýz.
		 
		 
		 char yildiz = '*';
		 char cizgi = '=';
		 for (int i= 0 ; i<=6;i++) {
			
			 System.out.print(yildiz + " ");
			 
		 }
		 
		 
		 
		 
		
			System.out.println("Lütfen bir string giriniz");
			String str = scan.nextLine();
			
			String tersiString = "";
			for (int i = str.length()-1; i >=0; i--) {
				tersiString = tersiString + str.charAt(i);
				
			}
			System.out.println(tersiString);
		 	
  /*	
		 //-------------------------------------------------
		 
		 // Sayýnýn Sayý deðerlerinin toplamasýný yapan Java kodu yazýnýz.
		 
		 	System.out.println("Lütfen sayý giriniz");
		 	int s = scan.nextInt();
		 	
		 	int bas1 = s%10;
		 	int bas2 = (s/10)%10;
		 	System.out.println(bas1+bas2);
		 
			//------------------------------------------------------------
		    int num1 = scan.nextInt();
		    int num2 = scan.nextInt();
		    int num3 = scan.nextInt();
		    int num4 = scan.nextInt();
		    int num5 = scan.nextInt();
		   
		    num1 = 10;
		    num2 = 20;
		    num3 = 30;
		    num4 = 40;
		    num5 = 50;
		    int ortalama = ((num1+num2+num3+num4+num5)/5);
		    System.out.println("5 Sayinin ortalamasi = " + ortalama);
	
		
		int x1 [] = {0,1,2,3};
		int x2 [] = {1,2,2,3};
			
			int i1 = 0;
			int i2 = 0;
			int count = 0;
			
			while (i1<x1.length && i2<x2.length) {
				if (x1 [i1]== x2[i2]) {
					
				}
				count ++;
				i2++;
				
				
				
			} else if (x1 [i1] < x2[i2]) {
				i1++;
			}else {
				i2++;
			}
		System.out.println(count);
			
	
		 
		 //-----------------------------------------		
		
		String str = "Bulbulu altýn kafesa koymuslar, Bulbul ah vatan demiþ!";
		String x [] = str.split(", ");
			System.out.println(Arrays.toString(x));
				System.out.println(x[0]);
				System.out.println(x[1]);
				
		String x1 [] = str.split(" ");
				System.out.println(x1.length);
				
		String x2 [] = str.split("");
			System.out.println(x2.length);
			
	
	
	//-------------------------------------------------
	 
		int x [] = {4,5,9,8,2,10};
		int y [] = {10,2,9,5,4,8};
		
			Arrays.sort(x);
			Arrays.sort(y);
				System.out.println(Arrays.toString(x));
				System.out.println(Arrays.toString(y));
			
				System.out.println(Arrays.equals(x, y));
				
		if (Arrays.equals(x, y)) {
				System.out.println("Ayný");
		}else {
			System.out.println("Farklý");
		}
		
	
		//-----------------------------
		
		String str [] = {"a","f","h","e","j","l"};
			Arrays.sort(str);
				System.out.println(Arrays.toString(str));
					System.out.println(Arrays.binarySearch(str, "c"));
		
		
	
		//-------------------------------------------------
		
		int arr2 [] = {2,1,8,6,4,7,17,13};
		Arrays.sort(arr2);
			System.out.println(Arrays.toString(arr2));
			System.out.println(Arrays.binarySearch(arr2, 8 ));
		
			
			
		int arr2 [] = new int [5];
				arr2 [0] = 2;
				arr2 [1] = 1;
				arr2 [2] = 8;
				arr2 [3] = 6;
				arr2 [4] = 4;
			
		Arrays.sort(arr2);		
			System.out.println(Arrays.toString(arr2));
		Arrays.binarySearch(arr2, 8);
			System.out.println(Arrays.binarySearch(arr2, 8));
			
			
 		
		
		
		
		//------------------------------------------------
		
		String arr1 [] = {"Ali","Kemal","Cemal","Ipek","Zeynep"};
			Arrays.sort(arr1);
				System.out.println(Arrays.toString(arr1));
		
			for (int i = 0; i < arr1.length ; i++) {
					System.out.print(arr1[i] + ",");
			}
		
		
		//------------------------------------------------------
		
		int arr [] = {2,4,1,7,9};
		
		Arrays.sort(arr);
			 System.out.print(Arrays.toString(arr));
		
		//for (int i = 0; i < arr.length; i++) {
			//System.out.print(arr[i] + ",");
		}
		
		*/
		
		
		
		
		
		
		
	}

}
