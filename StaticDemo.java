import static java.lang.System.in;
import static java.lang.System.out;


import java.util.Scanner;

// Utility Interface
interface Validation{
	
	static void emailCheck() {
		
	}
	static void phoneCheck() {
		
	}
}

// Utility Class
//final class Validation{
//	private Validation() {}
//	static void emailCheck() {
//		
//	}
//	static void phoneCheck() {
//		
//	}
//}
class Emp{
	int id ;
	String name;
	//int counter;
	static int counter;
	static void print() {
		out.println("I am Static Print");
	}
	static {
		counter = 1000 + 90 - 100;
		counter = counter * 12;
		//id = 100;
		out.println("I call during class load");
	}
	static {
		out.println("Static 2");
	}
	
	{
		out.println("Init Block");
	}
	{
		out.println("init block2");
	}
	Emp(int id , String name){
		this.id = id;
		this.name = name;
		counter++;
		out.println("Cons Counter is "+counter);
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(in);
		Validation.emailCheck();
		Emp.print();
		Emp ram = new Emp(1001,"Ram");
		Emp shyam = new Emp(1002,"Shyam");
		Emp tom = new Emp(1003,"Tom");
		out.println(Emp.counter);
		

	}

}
