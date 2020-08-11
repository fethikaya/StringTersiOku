package kayit;

import java.util.ArrayList;
import java.util.Scanner;

public class MemurKayit {

		
	
	public static void main(String[] args) {

		ArrayList <Memur> memurListesi = new ArrayList <Memur> ();
		Scanner scan = new Scanner (System.in);
		
		
		while (true) {
			System.out.println("Hangi i�lemi yapmak istiyorsun? \n 1- Memur Kaydet \n 2- Memur Sil \n 3- Memur listesi g�r�nt�le \n 4- ��k�� yap");
		int islem = scan.nextInt();
		scan.nextLine();
			if (islem ==1) {
			System.out.println("Memur sicilini giriniz");
			int sicil = scan.nextInt();
			System.out.println("Memurun Ad�n� giriniz");
			String adi = scan.nextLine();
			System.out.println("Memur Sayad�n� giriniz");
			String soyadi = scan.nextLine();
			System.out.println("Memur maa��n� giriniz");
			double maas = scan.nextDouble();
			
	scan.nextLine();
			
			Memur mem = new Memur (sicil, adi, soyadi, maas);
			memurListesi.add(mem);
	
			
		}else if (islem ==2) {
			System.out.println("Hangi Memuru silmek istiyorsun");
			String adi = scan.nextLine();
			Memur mem = null;
			for (Memur memur : memurListesi) {
				if(mem.getAdi().equals(adi)) {
					memur = mem;
				}
			}
			memurListesi.remove(mem);
			
		}else if (islem == 3) {
			if (memurListesi.isEmpty()) {
				System.out.println("�uan Listede kay�tl� memur bulunmamaktad�r \n-------------------------------------");
			}
			for (Memur mem : memurListesi) {
				System.out.println(" Memurun Adi :" + mem.getAdi()+ "\n Memurun Soyadi :" + mem.getSoyadi()+
						"\n Memurun Numarasi : " + mem.getSicil() + "\n Memurun maa�� :" + mem.getMaas());
				System.out.println("----------------------------");
			}
		}else if (islem == 4) {
			System.out.println("��lem sonlandirildi");
			break;
		}
		
		
		}
		
	}

}

