package exceptiondemo;

public class ThrowsThrow {
	static void db() throws ArithmeticException {
		try {
		System.out.println("Open DB");
		System.out.println("Query");
		int e = 100/0;  // throw new ArithmeticException();
		}
		finally {
		System.out.println("Close DB");
		}
	}
	static void helper() throws ArithmeticException  {
		System.out.println("I am in Helper calling DB");
		db();
		System.out.println("Helper Ends");
	}
	static void view() {
		try {
			System.out.println("I am in View Calling Helper");
		helper();
		System.out.println("View Ends");
		}
		catch(ArithmeticException e) {
			System.out.println("SOMe DB Problem occur ");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		view();
		/*try {
			String name = null;
			name.toUpperCase(); // NullPointor
			int x = 100/0; // Arithmetic 
			int y [] = new int [5];
			y[50] =100;
			
		}
		catch(NullPointerException e) {
			System.out.println("Values not coming");
		}
		catch(ArithmeticException e) {
			System.out.println("Divide a no with zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exced the range");
		}
		catch(Exception e) {
			System.out.println("Contact to System Admin");
		}*/

	}

}
