import java.util.Scanner;
//typecasting -> to convert one datatype to another datatype
//two types 
//1.implicit
//2.explicit
public class TypeCasting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		float c = (float)a/(float)b;
		System.out.println(c);
		
		int i = (int)10.45;
		System.out.println(i);
	
	}
}
