
public class StringDemo {
	public static void main(String[] args) {
		String s = "hello 12445@#$.?, java how are you ?";
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.charAt(14));
		System.out.println(s.indexOf('1'));
		String name="TOPS";
		String name2="ToPS";
		System.out.println(name.concat(name2));
		System.out.println(name);
		System.out.println(name.compareTo(name2));
		System.out.println(name.compareToIgnoreCase(name2));
		System.out.println(name.equals(name2));
		System.out.println(name.equalsIgnoreCase(name2));
		System.out.println(name.endsWith("P"));
		String a = "		ja   va			";
		System.out.println(a.isBlank());
		System.out.println(a.isEmpty());
		System.out.println(name.hashCode());
		System.out.println(a);
		System.out.println(a.trim());
	}
}

