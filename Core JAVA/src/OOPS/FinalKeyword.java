package OOPS;
//1.final variable->we cannot change value of variable
//2.final method->then that method cannot be override
//3.final class ->class cannot be inherited
final class AAA{
	final int i=10;
	final public void call() {
//		i++;
		System.out.println(" i = "+i);
	}
}
class B extends AAA{
	public void call() {
		System.out.println("call in B class");
	}
}
public class FinalKeyword {
	public static void main(String[] args) {
		AAA a = new AAA();
		a.call();
		B b  = new B();
		b.call();
	}
}
