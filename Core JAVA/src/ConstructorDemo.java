//constructor -> special member function of class which has same name as class name
//			  -> have no return type
//			  -> automatically called when object is created

//3 types -> 1.default 2.parameterized 3.copy
//this->to access current class property/used as current class object
class Cons {
	int l,b;
	Cons() {
		System.out.println("defualt cons");
	}
	Cons(int l,int b){
		this.l = l;
		this.b = b;
		System.out.println("l = "+l+" b = "+b);
		System.out.println("area of rectangle = "+(l*b));
	}
	Cons(double per){
		System.out.println("para");
	}
	Cons(String name){
		System.out.println("para "+name);
	}
	Cons(double per,int i){
		System.out.println("para with int : "+per+" i = "+i);
	}
	public void area() {
		System.out.println("area of rectangle = "+(l*b));
	}
}
class Rectangle{
	int l,b;
	Rectangle(Cons c) {
		this.l = c.l;
		this.b = c.b;
	}
	public void area() {
		System.out.println("area of rectangle = "+(l*b));
	}
}
public class ConstructorDemo {
	public static void main(String[] args) {
		Cons c = new Cons(2,3);
		c.area();
		Rectangle r = new Rectangle(c);
		r.area();
	}
}
