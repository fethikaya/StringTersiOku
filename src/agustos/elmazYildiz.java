package agustos;

import java.util.Scanner;

public class elmazYildiz {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen satýr sayýsý belirleyin");
		int n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
				
			}for (int k = 1; k<2*i; k++) {
				System.out.print("*");
			}System.out.println();
		}
		
		for (int i=n-1 ; i>=1; i--) {
			for (int j=n; j>i;j--) {
				System.out.print(" ");
			}for(int k =1;k<2*i;k++) {
				System.out.print("*");
			}System.out.println();
		}
		
		scan.close();
	}
}
