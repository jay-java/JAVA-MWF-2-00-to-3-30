//1.for(initialize;condition;incre/decre)
//2.while(condition){body}
//3.do while
//4.for each
public class Loops {
	public static void main(String[] args) {
		System.out.println("for loop");
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		System.out.println("while loop");
		int j = 1;
		while(j<=5) {
			System.out.println(j);
			j++;
		}
		System.out.println("do while");
		int k=10;
		do {
			System.out.println(k);
			k++;
		}
		while(k<=5);
	}
}
