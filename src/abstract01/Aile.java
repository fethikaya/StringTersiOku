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
		System.out.println("Biletler Þirket tarafýndan karþýlanýr");
		
	}

	@Override
	public void otel() {
		System.out.println("4 yýldýzlý otelde konaklama yapýlýr");
	}

	
	public void indirim () {
		System.out.println( "Ailelere yönelik % 25 indirimimiz var");
	}
}
