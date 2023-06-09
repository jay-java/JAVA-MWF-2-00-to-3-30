package OOPS;

import java.util.Scanner;

//Encapsulation -> to wrapping up data into single unit.
class Data{
	private int id;
	private String name;
	private double per;
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setPer(double per) {
		this.per=per;
	}
	public double getPer() {
		return per;
	}
	@Override
	public String toString() {
		return "Data : [id : "+id+" name : "+name+" per : "+per+"]";
	}
}
public class EncapsulationDemo {
	public static void main(String[] args) {
		Data d1 =new Data();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id : ");
		int id = sc.nextInt();
		d1.setId(id);
		System.out.println("enter name : ");
		String name  = sc.next();
		d1.setName(name);
		System.out.println("enter per : ");
		double per= sc.nextDouble();
		d1.setPer(per);
//		System.out.println(d1.getId());
//		System.out.println(d1.getName());
//		System.out.println(d1.getPer());
		System.out.println(d1);
	}
}
