package PassbyValue_inheritance;

public class MemeliHayvanlar extends Hayvanlar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemeliHayvanlar obj = new MemeliHayvanlar ();
		obj.icmek();
		obj.yemek();
		obj.besleme();
	}
	public void besleme () {
		System.out.println("Yavrularýný beslerler");
	}
}
