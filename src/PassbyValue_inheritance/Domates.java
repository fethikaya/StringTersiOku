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
		System.out.println("Ek�imsi bir tat� var");
	}
	
	public void renk () {
		System.out.println("Genelde K�rm�z� olur");
	}
	
}
