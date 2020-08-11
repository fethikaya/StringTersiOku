package PassbyValue_inheritance;

public class Kedi extends MemeliHayvanlar {

	public static void main(String[] args) {

		Kedi obj = new Kedi () ;
		obj.yemek();
		obj.icmek();
		obj.besleme();
		obj.temiz();
		obj.miyav();
			
		
		
	}
	public void miyav () {
		System.out.println("Kediler miyavlarlar");
	}
	public void temiz () {
		System.out.println("Kediler çok temizler");
	}
}
