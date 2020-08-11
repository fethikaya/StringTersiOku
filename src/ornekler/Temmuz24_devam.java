package ornekler;

import java.util.Scanner;

public class Temmuz24_devam {

	public static void main(String[] args) {

		
		
		// Kullanicidan alinan 3 sayinin en kucugunu ekrana yazdýran program.
				Scanner sc=new Scanner(System.in);
				System.out.println("uc sayi giriniz");
				int num1=sc.nextInt();
				int num2=sc.nextInt();
				int num3=sc.nextInt();
				
				enKucuk (num1,num2, num3);
		
		
		
		
		
		
		/*
		Temmuz24 obj = new Temmuz24 ();
		obj.getSifre();
		System.out.println(obj.getSifre());
		
		
		
		Temmuz24 obj1 = new Temmuz24();
		obj1.getIsim();
		System.out.println(obj1.getIsim());
		
		
		
		Temmuz24 obj2 = new Temmuz24 ();
		obj2.getHarf();
		System.out.println(obj2.getHarf());
		
		
		Temmuz24 obj3 = new Temmuz24 ();
		obj3.setDogum(1981);

		
		Temmuz24 obj4 = new Temmuz24 ();
		obj4.setMemleket("Kurdistan");
		obj4.getMemleket();
		System.out.println(obj4.getMemleket());
		
		
		Temmuz24 obj5 = new Temmuz24 ();
		obj5.setSifre(1234);
		obj5.getSifre();
		System.out.println(obj5.getSifre());
		
		
		
		
		
		Temmuz24devam1 obj6 = new Temmuz24devam1 ();
		System.out.println(obj6.getName());
		
		obj6.getMaas();
		obj6.setMaas(400);
		System.out.println(obj6.getMaas());
		
		obj6.getMedenihali();
		System.out.println(obj6.getMedenihali());
		
		obj6.setYas((byte) 41);
		obj6.getYas();
		System.out.println(obj6.getYas());
		
		obj6.isMezun();
		obj6.setMezun(false);
		
		System.out.println(obj6.isMezun());
		
		*/
	}
	
	public static void enKucuk (int num1, int num2, int num3) {
		
		if (num1==num2 && num2 ==num3) {
			System.out.println(num1);
		}if (num1<num2 && num1<num3) {
			System.out.println(num1);
		}else if (num2<num1 && num2<num3) {
			System.out.println(num2);
		}else {
			System.out.println(num3);
		}
		
		
		
		
		
		
	}

}
