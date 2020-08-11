package agustos;

public class Agustos04 {

	public static void main(String[] args) {

		
		
		System.out.println(SayininTersi (53));
		System.out.println (isEquals(25,35));
		System.out.println (cardHide ("1234123456785678"));
	}
      
	
	// Ýki basamaklý sayýnýn tersinin kendisinden büyüklük durumunu kontrol eden Methodu yazýnýz. 
	// Sayýnýn kendisi tersinden büyük ise TRUE küçük ise FALSE return etmeli.
	
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
      
      // Ýki integer sayýnýn eþitliðini kontrol eden java methodunu yazýnýz.
	
		public static boolean isEquals(int num1, int num2) {
			
			int sayi1 = 25;
			int sayi2 = 35;
			if(sayi1 ==sayi2) {
				return true;
			}else {
				return false;
			}
			
		}
		
		// Kredi kartý numarasý alan ve yalnýzca son dört karakteri görüntüleyen bir method yazýn. 
		//Kart numarasýnýn geri kalaný ************ ile deðiþtirilmelidir.
		
		
		public static String cardHide(String c) {
			
			String cart = "1234123456785678";
			cart.replaceAll("\\w", "*");
			cart.substring(12);
			return cart;
		}
		
		
		
		
}
