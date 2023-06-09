package OOPS;
//inheritance -> to access property of one class to another class
//5 types
//1.single
//2.multilevel
//3.multiple(not supported)->it creates ambiguity(confusion)
//4.hierarchical
//5.hybrid(not supported)->it creates ambiguity(confusion)
class ParentClass{
	public void parentMethod() {
		System.out.println("parent method calling");
	}
}	
class ChildClass extends ParentClass{
	public void childMethod() {
		System.out.println("child method calling");
	}
}
class GrandChild extends ChildClass{
	public void grandchildMethod() {
		System.out.println("grand child method calling");
	}
}
public class Inheritance {
	public static void main(String[] args) {
		System.out.println("PARENT CLASS OBJECT------>");
		ParentClass p =new ParentClass();
		p.parentMethod();
		System.out.println("CHILD CLASS OBJECT------->");
		ChildClass c = new ChildClass();
		c.parentMethod();
		c.childMethod();
		System.out.println("GRNAD CHILD CLASS------>");
		GrandChild g = new GrandChild();
		g.grandchildMethod();
		g.childMethod();
		g.parentMethod();
	}
}
