package collectionFramework;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashTableDemo {
	public static void main(String[] args) {
		Map map = new Hashtable();
		map.put(1, "java"); //entry
		map.put("c++", 2);
		map.put(34.3, "c++");
		map.put(2, "python");
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
