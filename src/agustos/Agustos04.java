package agustos;

public class Agustos04 {

	public static void main(String[] args) {

		
		
		System.out.println(SayininTersi (53));
		System.out.println (isEquals(25,35));
		System.out.println (cardHide ("1234123456785678"));
	}
      
	
	// �ki basamakl� say�n�n tersinin kendisinden b�y�kl�k durumunu kontrol eden Methodu yaz�n�z. 
	// Say�n�n kendisi tersinden b�y�k ise TRUE k���k ise FALSE return etmeli.
	
	public static boolean SayininTersi (int num) {
    	  int sayi = 53;
    	  if ((sayi/10)%10 > sayi%10 )  {
    		 return true;
    		  // System.out.println("true");
    	  }else {
    		 return false;
    		  // System.out.println("false");
    	  }
    	  
      }
      
      // �ki integer say�n�n e�itli�ini kontrol eden java methodunu yaz�n�z.
	
		public static boolean isEquals(int num1, int num2) {
			
			int sayi1 = 25;
			int sayi2 = 35;
			if(sayi1 ==sayi2) {
				return true;
			}else {
				return false;
			}
			
		}
		
		// Kredi kart� numaras� alan ve yaln�zca son d�rt karakteri g�r�nt�leyen bir method yaz�n. 
		//Kart numaras�n�n geri kalan� ************ ile de�i�tirilmelidir.
		
		
		public static String cardHide(String c) {
			
			String cart = "1234123456785678";
			cart.replaceAll("\\w", "*");
			cart.substring(12);
			return cart;
		}
		
		
		
		
}
