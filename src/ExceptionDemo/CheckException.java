package ExceptionDemo;

public class CheckException {
	
	
	static int age =17;

	public static void main(String[] args) throws NotEligibibleException,ArithmeticException
	{

		
		if(age<18){
			throw new NotEligibibleException();
		}

		
	}

}
