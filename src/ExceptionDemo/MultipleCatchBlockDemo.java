package ExceptionDemo;

public class MultipleCatchBlockDemo {

	public static void main(String[] args) {


		try{
			
			int c =2/0;
			ExceptionTutorial abc=null;
			abc.equals("");
			// check file is available
			// Box abc;
			
		}
		catch(NullPointerException t){

			
			System.out.println("NullPointerException issue");

	    }
       catch(ArithmeticException x){

			try{
			System.out.println("ArithmeticException issue");
			}catch(Exception t){
				
			}finally{
				
			}
			

	    }
		finally{
			
			System.out.println("Hi finally");
			
			
		}
		
		

}
}