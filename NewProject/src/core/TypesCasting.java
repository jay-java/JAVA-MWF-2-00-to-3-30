package core;

public class TypesCasting {
	public static void main(String[] args) {
		int i =12;
		System.out.println(i);
		double d = 12;
		System.out.println(d);
		double d1 = 12.2;
		System.out.println(d1);
		int j = (int)d1;
		System.out.println(j);
		ChangeValue c = new ChangeValue();
		c.increase();
	}
}
