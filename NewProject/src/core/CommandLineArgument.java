package core;

public class CommandLineArgument {
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[3]);
		for(String s:args) {
			System.out.println(s);
		}
	}
}
