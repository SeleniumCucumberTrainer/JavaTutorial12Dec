package CollectionDemo.SetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {


		Set<String> xyz = new TreeSet<String>();
	
		xyz.add("Akhilesh3");
		xyz.add("Akhilesh3");
		xyz.add("Akhilesh2");
		xyz.add("Akhilesh5");
		xyz.add("Akhilesh1");
		

		
		/*for(String  x   :  xyz   ){
			
			System.out.println(x);
		}*/
		
	
		
		Iterator<String> iter = xyz.iterator();
		
		while(iter.hasNext()){
		
		    System.out.println(iter.next());
		
		}

		
	}
	

	
   	

	
	


}
