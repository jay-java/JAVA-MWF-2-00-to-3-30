import java.util.Scanner;

public class MultiDimensional {
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int r=0;r<3;r++) {
			for(int c=0;c<3;c++) {
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of row : ");
		int row = sc.nextInt();
		System.out.println("enter size of col : ");
		int col = sc.nextInt();
		int a[][] = new int[row][col];
		for(int r=0;r<a.length;r++) {
			for(int c=0;c<a.length;c++) {
				System.out.print("enter value at a["+r+"]["+c+"] : ");
				a[r][c] = sc.nextInt();
			}
		}
	}
}
