package core;

import java.util.Scanner;

public class ConditionalStatements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		// simple if
		if (a > b) {
			System.out.println("a is  greater than b");
		}

		// if else
		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b  is greater than a");
		}

//		nested if()
		System.out.println("enter age : ");
		int age = sc.nextInt();
		if (age > 18) {
			if (age < 60) {
				System.out.println("you are eligible");
			} else {
				System.out.println("age is above 18 but not less than 60");
			}
		} else {
			System.out.println("age is less than 18");
		}

		// else if ladder
		System.out.println("enter marks : ");
		int marks = sc.nextInt();
		if (marks < 35) {
			System.out.println("fail");
		} else if (marks >= 35 && marks <= 50) {
			System.out.println("D grade");
		} else if (marks >= 51 && marks <= 70) {
			System.out.println("C grade");
		} else if (marks >= 71 && marks <= 80) {
			System.out.println("B grade");
		} else if (marks >= 81 && marks <= 90) {
			System.out.println("A grade");
		} else if (marks >= 91 && marks <= 100) {
			System.out.println("A+ grade");
		} else {
			System.out.println("invalid input");
		}

		// switch case
		System.out.println("1.english 2.Hindi 3.Gujarati");
		System.out.println("enter  your choice : ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("you selected english");
			break;
		case 2:
			System.out.println("you selected hindi");
			break;
		case 3:
			System.out.println("you selected gujarati");
			break;
		default:
			System.out.println("invalid input");
		}
	}
}
