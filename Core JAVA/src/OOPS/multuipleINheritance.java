package OOPS;

class P1 {
	public void run() {

	}
}

class P2 {
	public void run() {

	}
}

class P3 {
	public void run() {

	}
}

class C1 extends P1,P2,P3{
	
}
public interface multuipleINheritance {
	public static void main(String[] args) {
		C1 c = new C1();
		c.run();
	}
}
