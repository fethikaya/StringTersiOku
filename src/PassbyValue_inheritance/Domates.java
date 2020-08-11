package PassbyValue_inheritance;

public class Domates extends Sebze {

	public static void main(String[] args) {

		Domates obj2 = new Domates ();
		obj2.kok();
		obj2.su();
		obj2.yaprak();
		obj2.urun();
		obj2.yer();
		obj2.renk();
		obj2.tat();
		
	}

	//----------------------------
	
	public void tat () {
		System.out.println("Ekþimsi bir tatý var");
	}
	
	public void renk () {
		System.out.println("Genelde Kýrmýzý olur");
	}
	
}
