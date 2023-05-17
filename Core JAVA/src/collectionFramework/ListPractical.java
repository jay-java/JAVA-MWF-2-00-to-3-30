package collectionFramework;

import java.util.ArrayList;
import java.util.List;

class Users{
	private int id;
	private String name;
	private double value;
	private String city;
	Users(int id,String name,double value,String city){
		this.id=id;
		this.name=name;
		this.value=value;
		this.city=city;
	}
	@Override
	public String toString() {
		return "id : "+id+" name : "+name+" value : "+value+" city : "+city;
	}
}

public class ListPractical {
	public static void main(String[] args) {
		Users u1 = new Users(1, "krunal", 100, "ahmedabad");
		Users u2 = new Users(2, "anvesh", 300, "ahmedabad");
		Users u3 = new Users(3, "jainik", 400, "ahmedabad");
		Users u4 = new Users(4, "dimple", 34, "ahmedabad");
		Users u5 = new Users(5, "suhani", 500, "ahmedabad");
		List<Users> list = new ArrayList<Users>();
		list.add(u1);
		list.add(u2);
		list.add(u3);
		list.add(u4);
		list.add(u5);
		System.out.println(list);
		for(Users u:list) {
			System.out.println(u);
		}
	}
}
