package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E04 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis1 = null;
		
		try {
		
			fis1= new FileInputStream ("src/exception/TextFile");
		
		int k = 0;
		while ((k=fis1.read())!=-1) {
			System.out.print((char)k);
		}
		
		
		
		
		}catch (IOException e) {
			System.out.println("Dosya adresi bulunmuyor, hatalý ya da Dosya silinmiþ olabilir");
		
		}finally {
			System.out.println("\n => Finally block çalýþtý");
			fis1.available();
		}
		
		
		
		
		
		
		
	}

}
