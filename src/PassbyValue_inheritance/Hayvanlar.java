package PassbyValue_inheritance;

public class Hayvanlar {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hayvanlar obj = new Hayvanlar ();
		obj.icmek();
		obj.yemek();
		
		
	}
		public void yemek() {
			System.out.println("T�m hayvanlar yemek yerler");
		}
		
		public void icmek () {
			System.out.println("T�m Hayvanlar su i�erler");
		}
}
