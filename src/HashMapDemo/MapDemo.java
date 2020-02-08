package HashMapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {


		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(11, "2000");
		map.put(2, "3000");
		map.put(3, "4000");
		map.put(4, "4000");
		map.put(4, "5000");
		map.put(5, "5000");
		map.put(null,"6000");
		map.put(null,"7000");
		
		
		//System.out.println(map.size());
		
		//System.out.println(map.get(4));
		
		
		for(Entry<Integer,String>  entry    : map.entrySet()){
			
			
			//System.out.println(entry.getKey()+"==== "+entry.getValue());
			
		}
		
		Set<Integer>  allKeys = map.keySet();
		
		System.out.println(allKeys.size());
		
		/*for( int x  :  allKeys){
			
			//System.out.println(x);
			
		}*/
		
		Collection<String>  allValues = map.values();
		
      for( String x  :  allValues){
			
			System.out.println(x);
			
		}
		
		
		
		//System.out.println(map.containsKey(12));
		
		
		
	}

}
