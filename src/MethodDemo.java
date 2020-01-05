
public class MethodDemo {

	
	 public void sum(){
		 
		 
		 int c =2+3;
		 
	 }
	
	 public String getName(){
		 
		 return "Akhilesh";
		 
		
	 }
	 
	 public boolean isMatchRunning(){
		 
		 return true; 
	 }
	 
	 public char getFirstChar(){
		 
		 return 'a';
	 }
	 
	 
	 public Box createBoxObject(){
	 
		 return new Box();
	 }
	 
	 
	 
	 
	 public static void main(String[] args) {
		
		 MethodDemo abc = new MethodDemo();
		
		 String a = abc.getName();
		
		 System.out.println(a);
		 
		 
	}
	
	
	

}
