package abstract01;

public class Aile extends SeyhatAcanta {

	public static void main(String[] args) {

		Aile obj = new Aile ();
		obj.bilet();
		obj.otel();
		obj.indirim();
		
	}

	@Override
	public void bilet() {
		System.out.println("Biletler �irket taraf�ndan kar��lan�r");
		
	}

	@Override
	public void otel() {
		System.out.println("4 y�ld�zl� otelde konaklama yap�l�r");
	}

	
	public void indirim () {
		System.out.println( "Ailelere y�nelik % 25 indirimimiz var");
	}
}
