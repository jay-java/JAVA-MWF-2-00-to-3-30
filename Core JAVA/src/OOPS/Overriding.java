package OOPS;
class Shape{
	public void shapeCall() {
		System.out.println("shape class");
	}
	public void run() {
		System.out.println("run parent");
	}
}
class Circle extends Shape{
	public void shapeCall() {
		System.out.println("circle shape class");
		super.shapeCall();
	}
	public void run() {
		super.run();
		System.out.println("run child");
	}
}
public class Overriding {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.shapeCall();
		c.run();
	}
}
