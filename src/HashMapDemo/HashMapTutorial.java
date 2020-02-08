package HashMapDemo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapTutorial {

	public static void main(String[] args) {

   String name ="abcdabeab ";
   
   char[] allChar = name.toCharArray();
   
   
   
   Map<Character,Integer> map = new HashMap<Character,Integer>();
   
   
   for(  char x   :  allChar){
	   
	   
	   if(map.containsKey(x)){
		   
		  int newValue =  map.get(x)+1;
		  
		  map.put(x, newValue);
		   
	   }
	   else{
		   map.put(x, 1);
	   }
	   
	   
	   
   }
   
   
   System.out.println(map);
		
		
	}

}
