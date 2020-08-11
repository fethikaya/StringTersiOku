package PassbyValue_inheritance;

public class Kopek extends MemeliHayvanlar {

	public static void main(String[] args) {

		Kopek obj = new Kopek ();
		obj.icmek();
		obj.yemek();
		obj.besleme();
		obj.koklama();
		obj.havlama();
		
		
	}
	public void havlama () {
		System.out.println("Köpekler Havlarlar");
	}
	public void koklama () {
		System.out.println("Köpekler iyi koku alýrlar");
	}
}
