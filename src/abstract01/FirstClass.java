package abstract01;

public class FirstClass extends SeyhatAcanta {

	public static void main(String[] args) {

		FirstClass obj = new FirstClass ();
		obj.bilet();
		obj.otel();
		obj.servis();
	}

	@Override
	public void bilet() {
			System.out.println("Biletler �irket taraf�ndan kar��lan�r");
	}

	@Override
	public void otel() {
		System.out.println("4 y�ld�zl� otelde konaklama yap�l�r");
	}

	public  void servis () {
		System.out.println("First Class yoluculara y�nelik servis mevcuttur");
	}
}
