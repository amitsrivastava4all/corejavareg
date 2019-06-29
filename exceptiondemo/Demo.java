package exceptiondemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
	static int firstNumber = 0;
	static int secondNumber = 0;
	static int result = 0;
	static Scanner scanner = new Scanner(System.in);
	static void takeFirstNumber() {
		try {
			
			System.out.println("Enter the First Number");
			 firstNumber = scanner.nextInt();  // throw new InputMismatchException()
			}
			catch(InputMismatchException ex) {
				scanner.nextLine();
				System.out.println("Only Number Allowed U enter something else");
				takeFirstNumber();
			}
	}
	static void takeSecondNumber() {
try {
			
			System.out.println("Enter the Second Number");
			 secondNumber = scanner.nextInt();  // throw new InputMismatchException()
			}
			catch(InputMismatchException ex) {
				scanner.nextLine();
				System.out.println("Only Number Allowed U enter something else");
				takeSecondNumber();
			}
	}
	static void divide() {
		try {
			 result = firstNumber / secondNumber;
			 
			}
			catch(ArithmeticException ex) {
				System.out.println("U Divide a number with Zero ");
				takeSecondNumber();
				divide();
			}
	}
	static void print() {
		System.out.println("Result is "+result);
		scanner.close();
	}

	public static void main(String[] args) {
		takeFirstNumber();
		takeSecondNumber();
		divide();
		print();
//		int firstNumber = 0;
//		int secondNumber = 0;
//		int result = 0;
//		try {
//		
//		System.out.println("Enter the First Number");
//		 firstNumber = scanner.nextInt();  // throw new InputMismatchException()
//		}
//		catch(InputMismatchException ex) {
//			scanner.nextLine();
//			System.out.println("Only Number Allowed U enter something else");
//		}
//		try {
//		System.out.println("Enter the Second Number");
//		secondNumber =  scanner.nextInt();
//		}
//		catch(InputMismatchException ex) {
//			System.out.println("Only Number Allowed U enter something else");
//		}
//		try {
//		 result = firstNumber / secondNumber;
//		}
//		catch(ArithmeticException ex) {
//			System.out.println("U Divide a number with Zero ");
//		}
//		System.out.println("Result is "+result);
//		scanner.close();
		
	}

}
