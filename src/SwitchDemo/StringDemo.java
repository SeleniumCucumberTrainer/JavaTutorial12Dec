package SwitchDemo;

public class StringDemo {

	public static void main(String[] args) {


		
		String name1 ="Akhileshsdfdsafdsf";
		String name2 ="Akhilesh";
		
		String abc = new String("Akhilesh");
		String xyz = new String("Akhilesh");
		
		//System.out.println(name1.equals(name2));
		//System.out.println(name1==name2);
		
		//System.out.println(abc.equals(xyz));
		//System.out.println(abc==xyz);
		
		//System.out.println(name1.equals(abc));
		//System.out.println(name1==abc);
		
		
	     int numerOfChar = name1.length();
	     
	    // System.out.println(numerOfChar);
	     
	     char charAtZerothIndex = name1.charAt(name1.length()-1);
	     
	    // System.out.println(charAtZerothIndex);
	     
	     /*for(int i=name1.length()-1;i>=0;i--){
	    	 
	    	 char foundChar = name1.charAt(i);
	    	 
	    	 System.out.print(foundChar);
	    	 
	     }*/
	     
	   // String partOfName1 =  name1.substring(name1.length()-3, name1.length());
	    
	    //System.out.println(partOfName1);
	    
	    String name ="Akhilesh Gupta is Teacher  ";
	    
	    System.out.println(name.trim());
		
	    
	    System.out.println(name.replaceAll(" ", ""));
		

	}

}
