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
		System.out.println("Biletler Þirket tarafýndan karþýlanýr");
	}

	@Override
	public void otel() {
		System.out.println("4 yýldýzlý otelde konaklama yapýlýr");
	}

	public void indirim () {
		System.out.println("Erkan kayýt inidrimimiz % 35 uyguluuyoruz");
	}
}
