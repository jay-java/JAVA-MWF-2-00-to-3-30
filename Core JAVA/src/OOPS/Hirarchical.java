package OOPS;
class Parent1{
	Parent1(){
		System.out.println("parent constructor");
	}
	public void parentMethod(){
		System.out.println("parent class");
	}
}
class Child1 extends Parent1{
	public void child1Method(){
		System.out.println("child1 class");
	}	
}
class Child2 extends Parent1{
	public void child2Method(){
		System.out.println("child2 class");
	}
}
public class Hirarchical {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.parentMethod();
		c1.child1Method();
		Child2 c2 =new Child2();
		c2.parentMethod();
		c2.child2Method();
	}
}
