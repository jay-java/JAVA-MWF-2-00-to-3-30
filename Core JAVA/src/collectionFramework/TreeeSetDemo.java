package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeeSetDemo {
	public static void main(String[] args) {
		Set set = new TreeSet();
		set.add(1);
		set.add(-120);
		set.add(1223);
		set.add(0);
		set.add(465);
		System.out.println(set);
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
