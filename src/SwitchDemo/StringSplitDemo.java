package SwitchDemo;

import java.util.Arrays;

public class StringSplitDemo {

	public static void main(String[] args) {

      String name ="This is Akhilesh";
      
      String output="";
      
     /* StringBuffer bf = new StringBuffer(name);
      
      System.out.println(bf.reverse().toString());*/
      
      
      
      /*for(int i=name.length()-1;i>=0;i--){
    	  
    	  output = output +name.charAt(i);
    	  
      }
      
      System.out.println(output);*/
      
      
      
      String[] allWord = name.split(" ");
      
      for(  String x  :   allWord  ){
    	  
    	//x=This
    	  
    	  StringBuffer bf = new StringBuffer(x);
    	  
    	  String rev = bf.reverse().toString();
    	  
    	  output=output+rev+" ";
      }
      
      System.out.println(output.trim());
      //System.out.println(Arrays.toString(allWord));
      
      
		
      
      
		
	}

}
