package abstract01;

public class ErkenKayit extends SeyhatAcanta{

	public static void main(String[] args) {

		ErkenKayit obj = new ErkenKayit ();
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
		System.out.println("Erkan kay�t inidrimimiz % 35 uyguluuyoruz");
	}
}
