class abc{
	public void run() {
		System.out.println("hello run method");
	}
}
public class First {
	public static void main(String[] args) {
		System.out.println("hello java");
		abc obj = new abc();
		obj.run();
	}
}
