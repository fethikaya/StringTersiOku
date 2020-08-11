package PassbyValue_inheritance;

public class Biber extends Sebze{

	public static void main(String[] args) {

		Biber obj3 = new Biber ();
		obj3.kok();
		obj3.su();
		obj3.yaprak();
		obj3.urun();
		obj3.yer();
		obj3.tat();
		obj3.renk();
		
		
	}

	public void tat () {
		System.out.println("Genelde tadý acýdýr");
	}
	
	public void renk () {
		System.out.println("Rengi genelde yeþildir");
	}
}
