package core;

class Area {
	int l, b;

	Area() {
		System.out.println("default cons");
	}

	Area(int l, int b) {
		this.l = l;
		this.b = b;
		System.out.println("l = " + l);
		System.out.println("b = " + b);
		System.out.println("int cons" + (l * b));
	}

	Area(String name) {
		System.out.println("String cons");
	}

	public void getArea() {
		System.out.println("area : " + (l * b));
	}
}

class Rectangle {
	int l, b;

	Rectangle(Area a) {
		this.l = a.l;
		this.b = a.b;
		System.out.println("done");
	}

	public void getArea() {
		System.out.println("area : " + (l * b));
	}
}

public class CostructorDemo {
	public static void main(String[] args) {
		Area a = new Area(3, 4);
		a.getArea();
		Rectangle r =new Rectangle(a);
		r.getArea();
	}
}
