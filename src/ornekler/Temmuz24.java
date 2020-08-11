package ornekler;

public class Temmuz24 {

	private int sifre = 1317;
	private String isim = "Ilyas";
	private char harf = 'A';
	
	private int dogum = 1979;
	private String memleket = "Diyarbakýr";
	
	//===================================================================
	public static void main(String[] args) {

		
		
	}
//===========================================================================
	
	public int getSifre () {
		return sifre;
	}
	
	
	public String getIsim () {
		return isim;
	}
	
	
	public char getHarf () {
		return harf;
	}
	
	public String getMemleket () {
		return memleket;
	}
		
	//---------------------------------------
	
	public void setDogum (int dogum) {
		this.dogum = dogum;
	}
	
	
	
	public void setMemleket (String memleket) {
		this.memleket = memleket;
	}
	
	
	public void setSifre (int sifre) {
		this.sifre = sifre;
	}
}
