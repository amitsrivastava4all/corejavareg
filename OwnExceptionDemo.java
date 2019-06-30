package exceptiondemo;

import java.util.Scanner;
// class MinorAgeException extends RuntimeException  // UnChecked
class MinorAgeException extends Exception{  // Checked

	@Override
	public String toString() {
		return "Can't Apply for DL and VoterId card Age is Minor";
	}
	
}
public class OwnExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Age");
		int age = new Scanner(System.in).nextInt();
		try {
		if(age<18) {
			throw new MinorAgeException();
		}
		System.out.println("U can Apply for DL ");
		System.out.println("U Can Apply for VoterId");
		}
		catch(MinorAgeException ex) {
			System.out.println(ex);
			//System.out.println(ex.toString());
			//System.out.println("Can't Apply for DL and VoterId card Age is Minor");
		}

	}

}
