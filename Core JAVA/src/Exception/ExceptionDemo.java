package Exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import FileHandling.FileInputOutputStream;

//Exception->is abnormal situation occurs at runtime
//Two types 1.Checked 2. Unchecked
//As per oracle Three types 1.Checked 2. Unchecked 3.Error
//To handle exception we are having five keywords
//1.try 2.catch 3.finally 4.throw 5.throws

class Divide{//B
	public void division() throws ArithmeticException,InputMismatchException{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b=  sc.nextInt();
//		if(b>0) {
			int c = a/b;
//		}
//		else {
//			throw new ArithmeticException(),new InputMismatchException();
//		}
		System.out.println("c = "+c);
	}
}
public class ExceptionDemo {//A
	public static void main(String[] args) {
		try {
			Divide d = new Divide();
			d.division();
			
		} catch (ArithmeticException e) {
			System.out.println("number cannot divide by zero");
		}
		catch (InputMismatchException e) {
			System.out.println("denominator should be numeric value");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		/*try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a = ");
			int a = sc.nextInt();
			System.out.println("enter b = ");
			int b=  sc.nextInt();
			int c = a/b;
			System.out.println("c = "+c);
			System.exit(10);
		} catch (ArithmeticException e) {
			System.out.println("number cannot divide by zero");
		}
		catch(InputMismatchException e) {
			System.out.println("denominator should be numeric value");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("this code will executes everytime");
		}*/
	}
}
