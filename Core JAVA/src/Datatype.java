import java.util.Scanner;

//three types of stream -> 
//1.in(user input)
//2.out(print stream)
//3.err(error msg)

public class Datatype {
	public static void main(String[] args) {
		System.out.println("main method in xyz class");
		System.out.println("hello java");
		//1.primitive ->byte,short,int,long,float,double,boolean,char
		//2.non-primitive->array,class,String
//		byte b = 127;
//		System.out.println(b);
		int i=11,j=2;
		int k = i+j;
		System.out.println("i+j = "+k);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		System.out.println(a+b);
		System.out.println("enter long value = ");
		long l = sc.nextLong();
		System.out.println(l);
		
	}
}
