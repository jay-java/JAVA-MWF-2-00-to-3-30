package core;

import java.util.Scanner;
interface calling{
	public void call();
}
class B{
	public void call() {
		System.out.println("call in B class");
	}
}
class A extends B implements calling{
	public void call() {
		super.call();
		System.out.println("call in A class");
	}
}

public class Jainik {
	static public void main(String[] jainikkkk) {
		A a = new A();
		a.call();
		
		
		System.out.println("hello jainik");
		ChangeValue c = new ChangeValue();
		c.increase();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter i = ");
		int i= sc.nextInt();
		System.out.println("enter char : ");
		char c1 = sc.next().charAt(0);
		System.out.println(c1);
	}
}
class ChangeValue{
	static int i=1;
	public void increase() {
		i++;
		System.out.println(i);
	}
}
