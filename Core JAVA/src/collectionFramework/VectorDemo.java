package collectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector vr = new Vector();
		vr.add(1);
		vr.add(12345);
		vr.add("java");
		vr.add('a');
		vr.add(true);
		vr.add(3245.3);
		vr.add(1);
		System.out.println(vr);
		System.out.println(vr.size());
		Enumeration em = vr.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
		
	}
}
