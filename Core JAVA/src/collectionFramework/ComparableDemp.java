package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Comparable -> interface used for sort value from list
//				(compile-time comparison).
class Phone implements Comparable<Phone>{
	int price;
	String model;
	Phone(int price,String model){
		this.price=price;
		this.model=model;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public int compareTo(Phone o) {
		if(this.getPrice()>o.getPrice()) {
			return 1;
		}
		else {
			return 0;
		}
	}
	@Override
	public String toString() {
		return "Phone [price=" + price + ", model=" + model + "]";
	}
}
public class ComparableDemp {
	public static void main(String[] args) {
		Phone p1 = new Phone(10000, "samsung");
		Phone p2 = new Phone(90000, "iphone");
		Phone p3 = new Phone(40000, "onplus");
		Phone p4 = new Phone(70000, "vivo");
		Phone p5 = new Phone(60000, "oppo");
		List<Phone> list = new ArrayList<Phone>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		Collections.sort(list);
		for(Phone p:list) {
			System.out.println(p);
		}
		
	}
}
