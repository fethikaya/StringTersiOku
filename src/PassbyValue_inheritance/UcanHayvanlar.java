package PassbyValue_inheritance;

public class UcanHayvanlar extends Hayvanlar{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UcanHayvanlar obj = new UcanHayvanlar ();
		obj.icmek();
		obj.yemek();
		obj.ucmak();
		
	}
	public void ucmak () {
		System.out.println("Uçarlar");
	}
}
