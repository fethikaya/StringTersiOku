package ornekler;

import java.util.Arrays;

public class temmuz16 {

	public static void main(String[] args) {
		
		
		
		
		String str = "Cok calis mutevazi ol";
		String arr[] = str.split("a");

		System.out.println(arr.length);
		
		
		
		/*
		
		
		
		
		
		
	
		int arr[][] = { {1, 2}, {3}, {4, 5, 6}};

		int x=1;

		for(int i=0; i<arr.length; i++) {

		              for(int j=0; j<arr[i].length; j++ ) {

						x = x*arr[i][j];

					}

		}
		System.out.println();
		
		
	/*	
		
		// Aþaðýdaki multi dimensional array’lerin 
		// iç array’lerinde ayný index’e sahip elemanlarýn toplamýný  
		// ekrana yazdýran bir program yazýnýz. (Zor soru)  
		
		
		int arr1 [][] = { {1,2}, {3,4,5}, {6} };
		int arr2 [][] = { {7,8,9}, {10,11}, {12}};
		
		int sum = 0;
		
		System.out.println(arr1 [0][0] + arr2 [0][0]+ arr1[0][1]+ arr2[0][1]+ 
				arr1 [1][0] + arr2 [1][0]+ arr1[1][1]+ arr2[1][1]+ 
				arr1 [2][0] + arr2 [2][0]);
						   
						   
						   
		//***************************************************************************************
 
		
		//  Aþaðýdaki multi dimensional array’in iç array’lerindeki son elemanlarýn çarpýmýný 
		//  ekrana yazdýran  bir program yazýnýz { {1,2,3}, {4,5}, {6} 
		
		
		int w [][] = { {1,2,3}, {4,5}, {6} };
		System.out.println("Çarpma sonucu : " + w[0][2] *w[1][1] *w[2][0]);
		
		
		// 2.yol 
		
		int w1 [][]= {{1,2,3},{4,5},{6}};
		
		int product = 1;
		for (int i = 0; i < w1.length; i++) {
			product = product * w1[i] [w1[i].length-1];
			
		}
		System.out.println(product);
		
		
	
		//**********************************************************************
		
		//Aþaðýdaki multi dimensional array’in tum elemanlarýnýn çarpýmýný 
		// ekrana yazdýran bir program yazýnýz.  { {1,2,3}, {4,5,6} } 
		
		
		int z [][] = {{1,2,3},{4,5,6}};
		System.out.println("Çarpma sonucu : " + z[0][0]*z[0][1]*z[0][2]*z[1][0]*z[1][1]*z[1][2]);
		
		int y [][] = {{1,2,3},{4,5,6}};
		int product = 1;
		
		for(int i=0; i<y.length;i++) {
			
			for (int k =0; k<y[i].length; k++) {
				product = product * y[i][k];
			}
			
		}
		System.out.println(product);
 
  
  //************************************************************************
		
		int arr [] [] = new int [4][];
			arr [0] = new int [1];
			arr [1] = new int [2];
			arr [2] = new int [3];
			arr [3] = new int [4];
		
			System.out.println(Arrays.deepToString(arr));
			
			int i,j,k = 0;
			for (i = 0; i < 4; i++) {
				for (j = 0; j < i+1; j++) {
					arr[i][j] =k;
					k++;
				}
			}
			
			
			for (i = 0; i < 4; i++) {
				for (j = 0; j < i+1; j++) {
					
				}
			}
			System.out.println(k);
			
	
		//************************************************************
			
		int x [] [] = new int [3][3];		
		arr [0][0] = 10;
		arr [0][1] = 11;
		arr [0][2] = 12;
		arr [1][0] = 13;
		arr [1][1] = 14;
		arr [1][2] = 15;
		
		System.out.println(Arrays.deepToString(x));
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr [1]));
		System.out.println(Arrays.toString(arr [2]));
		
		int arr1 [][] = {{20,11,22,},{23,24,25}};
		System.out.println(Arrays.deepToString(arr1));
		System.out.println(arr1[0][1]);
		System.out.println(arr1 [1][2]);
		System.out.println(arr1 [0][2]);
		
		
*/
	

		
	}

}
