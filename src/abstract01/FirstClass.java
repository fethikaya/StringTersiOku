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
			System.out.println("Biletler Þirket tarafýndan karþýlanýr");
	}

	@Override
	public void otel() {
		System.out.println("4 yýldýzlý otelde konaklama yapýlýr");
	}

	public  void servis () {
		System.out.println("First Class yoluculara yönelik servis mevcuttur");
	}
}
