package PassbyValue_inheritance;

public class PassByValue01 {
	
	// Fiyatý 2000 euro olan bir Waitar Bulding 
	// öðrencilere 500 euor,
	// erken kayýt 300 euro
	// Öðretmenlere de 200 eoru indirim yapýyor
	
	public static void main(String[] args) {
		int bulding = 2000;
		
		ogrenciInd (bulding);
		System.out.println("Oðrenci fiyatý : "+ ogrenciInd (bulding));
		
		ogretmenInd (bulding);
		System.out.println("Oðretmen fiyatý : " + ogretmenInd (bulding));
		erkenKayitInd (bulding);
		System.out.println("Erken Kaytý Fiyatý : " + erkenKayitInd (bulding));
		
	}
	
	public static int ogrenciInd (int bulding) {
		return bulding - 500;
	}
	public static int ogretmenInd (int bulding) {
		return bulding -200;
	}
	
	public static int erkenKayitInd (int bulding) {
		return bulding -300;
	}
	
	
}
