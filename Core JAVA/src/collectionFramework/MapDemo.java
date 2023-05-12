package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//map - interface 
//map has two implementation class -> 1.HashMap 2. HashTable
//in map values will be stored in key and value pair
//single key and value pair called as entry.
//multiple entry called as entrySet.
//key always unique (but single null key allowed)
//value can be duplicate
//Entry (interface) -> is sub interface of Map
//entry interface has methods to fetch key and value differently.
public class MapDemo {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "java"); //entry
		map.put("c++", 2);
		map.put(34.3, "c++");
		map.put(null, "python");
		System.out.println(map);
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Entry)itr.next();
			System.out.println("key : "+entry.getKey());
			System.out.println("value : "+entry.getValue());
		}
	}
}
