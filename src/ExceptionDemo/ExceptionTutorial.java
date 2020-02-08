package ExceptionDemo;

import java.util.Scanner;

public class ExceptionTutorial {
	
	static int c;

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the a value");
	
		int a = input.nextInt();
		
		//System.out.println(a);
		
		System.out.println("Please enter the b value");
		
		int b = input.nextInt();
		
		
		//System.out.println(b);
		
		
		try{
			
		  c =a/b;
		
		}
		
		catch(Throwable t){
			
			System.out.println(" Pleae enter correct b value");
			
			
		}
		
		

	}

}
