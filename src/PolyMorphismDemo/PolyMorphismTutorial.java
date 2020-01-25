package PolyMorphismDemo;

public class PolyMorphismTutorial {

	 void sum(){
		
		int c=10;
		System.out.println("Hi Sum 1");
	}
	
    public void sum(int a){
    	
    	int r =20;
    	
    	System.out.println("Hi Sum 2");
		
	}
    
}

class Child extends PolyMorphismTutorial{
	
	public void sum(int a, int b){
		
	}
	
}

