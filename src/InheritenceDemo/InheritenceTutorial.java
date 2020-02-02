package InheritenceDemo;

import EncapsulationAndAbstractionDemo.Mobile;

public class InheritenceTutorial {

	public static void main(String[] args) {
		

		/*Child abc = new Child();
		
		System.out.println(abc.a);
		
		abc.sing();
		
		abc.sum();
		
		abc.dance();*/
		
	    Parent abc = new Child();
		
		//System.out.println(abc.a);
		
		abc.sing();
		
		//abc.sum();
		
		
		

	}

}


class Parent{
	
	public Parent(){
	
		//System.out.println("Hi Parent Cunstructor");
		
	}
	
	int a=10;
	
	public void sing(){
		
		System.out.println("Hi Parent");
		
	}
	
	public void sum(){
		System.out.println("Hi Sum");
	}
	
}

class Child extends Parent{
	
	public Child(){
		
		//System.out.println("Hi Child Cunstructor");
		
	}
	
	public void sing(){
		super.sing();
		System.out.println("Hi Child");
	}
	
	public void dance(){
		System.out.println("Dancing");
	}
	
	
}
