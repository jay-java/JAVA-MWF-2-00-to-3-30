package OOPS;

//polymorphism->poly(many) morphism(forms)==>same method name
//				but having different functionalities
//Two types->1.Compile time->Method overloading
//			2.Runtime->Method Overriding
class Calculate {
	public void addition(int a,int b) {
		System.out.println("addition 1 method : "+(a+b));
	}
	public void addition(int a,String name) {
		System.out.println("addition 2 method");
	}
}

public class Polymorhpism {
	public static void main(String[] args) {
		Calculate c = new Calculate();
		c.addition(1,"java");
	}
}
