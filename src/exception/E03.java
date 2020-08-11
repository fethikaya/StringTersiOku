package exception;

import java.io.FileInputStream;
import java.io.IOException;

public class E03 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = null;
		
		try {
			fis  = new FileInputStream ("src/exception/TextFile");
			
			int k = 0;
			while ((k=fis.read())!=-1) {
				System.out.print((char)k);
			}
			
			
		}catch (IOException e){
			System.out.println("Dibe ku dosya winda ye, jê hatiye birin anjî xerabe ye");
		}finally{
			System.out.println(" \n =>Finally Block çalýþtý");
			fis.close();
		}
		
		
		
		
		
		
		
		
		
	}

}
