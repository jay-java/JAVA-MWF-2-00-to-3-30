package OOPS;
//interface->interface is same as class but not class.
//gives solution of multiple inheritance
//we cannot create object of interface->but can create reference.
//by default all properties in interface are abstract
//							without abstract keyword)
//interface provides 100% ABSTRACTION.
//ABSTRACT class doesn't provide 100% abstraction.
class InterfaceCall implements inter1,inter2{
	@Override
	public void interface3() {
		// TODO Auto-generated method stub
		System.out.println("interface3");
	}

	@Override
	public void interface2() {
		// TODO Auto-generated method stub
		System.out.println("interface 2");
	}

	@Override
	public void interface1() {
		// TODO Auto-generated method stub
		System.out.println("interface 1");
	}
}
public class INterfaceDemo {
	public static void main(String[] args) {
		InterfaceCall i = new InterfaceCall();
		i.interface1();
		i.interface2();
		i.interface3();
		inter1.staticInterface1();
		inter2.staticInterface2();
		inter3.staticInterface3();
	}
}
