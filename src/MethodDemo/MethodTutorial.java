package MethodDemo;

public class MethodTutorial {

	

	
	public int sum(int a){	
		return a*a;
		
	}
	
	public String name(String x){
		
		return x+" Gupta";
		
		
	}
	
	public boolean getBoolean(int a){
		
		if(a%2==0){
			
			return true;
			
		}
		else{
			return false;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		MethodTutorial abc = new MethodTutorial();
		
		int c = abc.sum(3);
		
		System.out.println(c);
		
		String y = abc.name("Akhilesh");
		
		System.out.println(y);
		
		boolean f = abc.getBoolean(4);
		
		System.out.println(f);
		
       boolean e = abc.getBoolean(5);
		
		System.out.println(e);
		
		
		
	}
	
	
	
}
