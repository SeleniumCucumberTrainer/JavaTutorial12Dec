package CollectionDemo.SetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {


		Set<String> xyz = new HashSet<String>();
		
	     int totalItems = xyz.size();  //0
	     
	     
		
		//System.out.println(totalItems);
		
		//xyz.add(1);
		//xyz.add(1.2);
		xyz.add("Akhilesh");
		xyz.add("Akhilesh");
		xyz.add("Akhilesh");
		xyz.add("Akhilesh");
		

		//xyz.add(true);
		//xyz.add('a');
		
		int totalItem = xyz.size();
		
		System.out.println(totalItem);
		
		//System.out.println(xyz.contains("Akhilesh1"));
		
		
		
		/*for(String  x   :  xyz   ){
			
			System.out.println(x);
		}*/
		
	
		
		Iterator<String> iter = xyz.iterator();
		
		while(iter.hasNext()){
		
		    System.out.println(iter.next());
		
		}

		
	}

}
