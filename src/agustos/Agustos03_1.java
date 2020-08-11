package agustos;

public class Agustos03_1 {

	
	public static void main(String[] args) {

		
		String result = "";

		String v = null;	

		try {			

			try {

				result = result + "Iyi";

				v.length();

				result = result + "Kotu";			

			}catch(NullPointerException e) {

				result = result + "Cirkin";

				throw new RuntimeException();

			}finally {

				result = result + "Guzel";

				throw new Exception();

			}			

		}catch(Exception e) {

			result = result + "Akilli";

		}     

		System.out.println(result);

	}

		
		
		
		
		/*
		
		
		
		
		int [] arr = {1,2,3,4}; 
        reverse(arr, arr.length);
	}
	
		private static void reverse(int[] arr, int length)    {
        for(int i=length;i>0;i--)    { 
            System.out.print(arr[i-1]+","); 
        }
        */
	
}
