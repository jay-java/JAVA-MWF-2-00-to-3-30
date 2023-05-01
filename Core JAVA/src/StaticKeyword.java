class Student{
	static {
		System.out.println("static block in student class");
	}
	int id;
	String name;
	double per;
	static String cname = "TOPS";
	Student(int id,String name,double per){
		this.id = id;
		this.name=name;
		this.per=per;
	}
	public void showData() {
		System.out.println("id  = "+id+" name = "+name+" per = "+per+" cname = "+cname);
	}
	public static void calling() {
		System.out.println("callling static method : "+cname);
	}
//	public int getID() {
//		return id;
//	}
//	public String getName() {
//		return name;
//	}
//	public double getPer() {
//		return per;
//	}
}
public class StaticKeyword {
	static {
		System.out.println("static block in main class");
	}
	public static void main(String[] args) {
		Student s1 = new Student(1, "jainik", 45.4);
		s1.showData();
//		System.out.println(s1.getID());
//		System.out.println(s1.getName());
//		System.out.println(s1.getPer());
		Student s2 = new Student(2, "dimple", 45.4);
		s2.showData();
		Student s3 = new Student(3, "anvesh", 45.4);
		s3.showData();
		Student s4 = new Student(4, "kunal", 45.4);
		Student s5 = new Student(5, "hitexa", 45.4);
		Student s6 = new Student(6, "vraj", 45.4);
//		s6.calling();
		Student.calling();
	}
}
