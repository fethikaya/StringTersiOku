package agustos;

public class A�ustos05 {

	public static void main(String[] args) {

		
		// Arraydeki say�lar�n ortalamas�n� hesaplayan Java Kodunu yaz�n�z.

		// Array =  [20, 30, 25, 35, -16, 60, -100 ]
		
		int arr1 [] = {20, 30, 25, 35, -16, 60, -100};
		int sum = 0;
		double ortlama = 0;
	
		
		for (int w: arr1) {
			sum = sum+w;
			
		}
		double ortalama = sum/arr1.length;
		
		System.out.println("Toplam : "+ sum);
		System.out.println("Ortalama : " + ortalama);
		
		
		
		/*
		
		// Arraydeki say�lar� tolpayan Java kodunu yaz�n�z.
		// array  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		
		int arr [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr [i];
		}
		System.out.println(sum);
		
		
		*/
		
		
	}

}
