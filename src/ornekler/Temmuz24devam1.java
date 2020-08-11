package ornekler;

public class Temmuz24devam1 {

	private String name = "Fethi Kaya";
	private int maas = 3000;
	private char medenihali = 'E';
	private byte yas = 40;
	private boolean mezun = true;
	
	
	
	public static void main(String[] args) {

		// index'i çift olan sayýlarý yazdýrýnýz
		
		int arr [] = {2,3,5,6,9,11,12};
		
		int i = 0;
		
		while (i<arr.length) {
			if (i%2==0) {
				
				System.out.println(arr[i]);
				i++;
			}
		}
		
		
	}



	public int getMaas() {
		return maas;
	}



	public void setMaas(int maas) {
		this.maas = maas;
	}



	public byte getYas() {
		return yas;
	}



	public void setYas(byte yas) {
		this.yas = yas;
	}



	public String getName() {
		return name;
	}



	public char getMedenihali() {
		return medenihali;
	}



	public boolean isMezun() {
		return mezun;
	}



	public void setMezun(boolean mezun) {
		this.mezun = mezun;
	}
	


}
