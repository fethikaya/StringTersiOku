package kayit;

public class Memur {

	private int sicil;
	private String adi;
	private String soyadi;
	private double maas;
	
	
	public Memur (int sicil, String adi, String soyadi, double maas) {
		this.sicil = sicil;
		this.adi= adi;
		this.soyadi = soyadi;
		this.maas = maas;
	}

	public Memur () {
		
	}

	/**
	 * @return the sicil
	 */
	public int getSicil() {
		return sicil;
	}


	/**
	 * @param sicil the sicil to set
	 */
	public void setSicil(int sicil) {
		this.sicil = sicil;
	}


	/**
	 * @return the adi
	 */
	public String getAdi() {
		return adi;
	}


	/**
	 * @param adi the adi to set
	 */
	public void setAdi(String adi) {
		this.adi = adi;
	}


	/**
	 * @return the soyadi
	 */
	public String getSoyadi() {
		return soyadi;
	}


	/**
	 * @param soyadi the soyadi to set
	 */
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}


	/**
	 * @return the maas
	 */
	public double getMaas() {
		return maas;
	}


	/**
	 * @param maas the maas to set
	 */
	public void setMaas(double maas) {
		this.maas = maas;
	}
	
	
}
