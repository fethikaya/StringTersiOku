package PassbyValue_inheritance;

public class Sebze extends Bitki{

	public static void main(String[] args) {

		Sebze obj = new Sebze ();
		obj.kok();
		obj.su();
		obj.yaprak();
		obj.urun();
		obj.yer();
		
	}

	
	//-------------------------------------------------------
	
	public void urun() {
		System.out.println("Urun verir");
	}
	public void yer () {
		System.out.println("Yerde yetiþir");
	}
}
