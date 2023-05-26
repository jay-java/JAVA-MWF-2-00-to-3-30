package core;

class Em{
	int id;
	String name;
	double salary;
	static String cname = "TOPS";
	Em(int id,String name,double salary){
		this.id =id;
		this.name=name;
		this.salary=salary;
	}
	public void showData() {
		System.out.println("id  :"+id+" name : "+name+" salary : "+salary+" cname : "+cname);
	}
}
public class StaticKeyword {
	public static void main(String[] args) {
		Em e1 = new Em(1,"java",3454.3);
		e1.showData();
		Em e2 = new Em(2,"python",3454.3);
		e2.showData();
		Em e3 = new Em(3,"php",3453.3);
		e3.showData();
	}
}
