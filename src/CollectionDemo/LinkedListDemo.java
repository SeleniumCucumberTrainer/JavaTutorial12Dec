package CollectionDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
public static void main(String[] args) {
		
		
		List<String> xyz = new LinkedList<String>();
				
	
		int totalItems = xyz.size();
		
		//System.out.println(totalItems);
		
		//xyz.add(1);
		//xyz.add(1.2);
		xyz.add("Akhilesh1");
		xyz.add("Akhilesh2");
		xyz.add("Akhilesh3");
		xyz.add("Akhilesh4");

		//xyz.add(true);
		//xyz.add('a');
		
		int totalItem = xyz.size();
		
		//System.out.println(totalItem);
		
		System.out.println(xyz.contains("Akhilesh1"));
		
		for(int i=0;i<xyz.size();i++){
			
			if(xyz.get(i).equals("Akhilesh3")){
				xyz.remove(i);
				xyz.add(i, "Akhilesh Gupta");
			}
			
		
		//System.out.println(xyz.get(i));
		
		}
		
		for(String  x   :  xyz   ){
			
			System.out.println(x);
		}
		
	
		
		/*Iterator<String> iter = xyz.iterator();
		
		while(iter.hasNext()){
		
		    System.out.println(iter.next());
		
		}*/

		
	}

}
