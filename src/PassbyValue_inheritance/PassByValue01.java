package PassbyValue_inheritance;

public class PassByValue01 {
	
	// Fiyat� 2000 euro olan bir Waitar Bulding 
	// ��rencilere 500 euor,
	// erken kay�t 300 euro
	// ��retmenlere de 200 eoru indirim yap�yor
	
	public static void main(String[] args) {
		int bulding = 2000;
		
		ogrenciInd (bulding);
		System.out.println("O�renci fiyat� : "+ ogrenciInd (bulding));
		
		ogretmenInd (bulding);
		System.out.println("O�retmen fiyat� : " + ogretmenInd (bulding));
		erkenKayitInd (bulding);
		System.out.println("Erken Kayt� Fiyat� : " + erkenKayitInd (bulding));
		
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
