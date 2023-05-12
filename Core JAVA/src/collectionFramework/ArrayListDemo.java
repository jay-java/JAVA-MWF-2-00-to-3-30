package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("java");
		list.add('a');
		list.add(false);
		list.add(12424);
		list.add(45.4);
		System.out.println(list);
		System.out.println("size of list : "+list.size());
		list.add(3);
		System.out.println(list);
		System.out.println("size of list : "+list.size());
		list.remove(3);
		System.out.println(list);
		System.out.println("size of list : "+list.size());
		list.add("hello java");
		System.out.println(list);
		System.out.println("size of list : "+list.size());
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
