package PassbyValue_inheritance;

public class PassByValue {

	public static void main(String[] args) {

		// Bir tur seyhatý, 100 tl aile indirimi, çocuk baþý 50 tl indirim 
		// ve 200 tl erken kayýt indirimi yapýyor. Metdonu hazýrlayýp ekrana yazdýrýn
		
		int tatil = 1000;
		
		aileIndirim (tatil);
		System.out.println(tatil); //1000 tl
		System.out.println(aileIndirim (tatil) + " TL");
		
		
		cocukIndirim (tatil);
		System.out.println(tatil + " TL");  // 1000
		System.out.println(cocukIndirim (tatil) + " TL");
		
		erkenKayit (tatil);
		System.out.println(tatil + " TL");
		System.out.println(erkenKayit (tatil) + " TL");
		
		
		
		// Bir dil kursu öðrencilere 200 tl, Erken kayit 300 tl ve 150 kardeþ indirimi yapýyor
		
		int dilKursu =1500;
		
		indOgrenci (dilKursu);
		System.out.println(indOgrenci (dilKursu));
		
		indErken (dilKursu);
		System.out.println(indErken (dilKursu));
		
		indKardes (dilKursu);
		System.out.println(indKardes (dilKursu));
		
		
		
	}

	
	//------------------------------------------------------
	
		public static int indOgrenci (int dilKursu) {
			return dilKursu-200;
		}
	
		public static int indErken (int dilKursu) {
			return dilKursu -300;
		}
	
		public static int indKardes (int dilKursu) {
			return dilKursu-150;
		}
		
		
		
		
		
		
		//-------------------------------
	public static int aileIndirim (int tatil) {
		return tatil-100;
	}
	
	
	public static int cocukIndirim (int tatil) {
		return tatil-(50*3);
	}
	
	public static int erkenKayit (int tatil) {
		return tatil-200;
	}
	
	
}
