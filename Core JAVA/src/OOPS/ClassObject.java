package OOPS;
//1.class
//2.object
//3.inheritance
//4.polymorphism
//5.abstraction
//6.encapsulation
class A{
	public void callingA() {
		System.out.println("a class calling");
	}
}
public class ClassObject {
	public static void main(String[] args) {
		System.out.println("main method");
		A a = new A();
		a.callingA();
		
	}
}
