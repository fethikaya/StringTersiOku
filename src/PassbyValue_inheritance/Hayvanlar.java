package PassbyValue_inheritance;

public class Hayvanlar {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hayvanlar obj = new Hayvanlar ();
		obj.icmek();
		obj.yemek();
		
		
	}
		public void yemek() {
			System.out.println("Tüm hayvanlar yemek yerler");
		}
		
		public void icmek () {
			System.out.println("Tüm Hayvanlar su içerler");
		}
}
