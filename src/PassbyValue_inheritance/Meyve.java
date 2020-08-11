package PassbyValue_inheritance;

public class Meyve extends Bitki {

	public static void main(String[] args) {

		Meyve obj1 = new Meyve ();
		obj1.kok();
		obj1.su();
		obj1.yaprak();
		obj1.urun();
		obj1.agac();
		
		
		
		
		
	}
	//-----------------------------
	
	public void agac () {
		System.out.println("Aðaçta yetiþir");
	}
	
	public void urun () {
		System.out.println("Urun verir");
	}
	
}
