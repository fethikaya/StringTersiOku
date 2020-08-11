package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E05 {

	public static void main(String[] args) throws IOException {

		
		FileInputStream fis2 = null;
		
		try {
		fis2 = new FileInputStream ("src/exception/TextFile");
		int k = 0;
		while ((k=fis2.read())!=-1) {
			System.out.print((char)k);
		}
		
		
	}	catch (IOException e){
		System.out.println("Dosya bulunmuyor yada silinmiþ");
	}finally {
		System.out.println("\n => Finally Block okundu");
		
		fis2.close();
	}
		
		
		
		
		
	}

}
