class Z{
	void disp() {
	if(10>2) {
		
	}
	}
}

class Y{
	//final int W = 100;
	final int W ;
	Y(){
		W = 100;
	}
//	void show() {
//		W = 100;
//	}
	
}
class X{
	int a, b;
	X(){
		a = 100;
		b = 200;
	}
}
class Loan{
	private final void applyForLoan() {
		System.out.println("Apply For Loan");
	}
}
class HomeLoan extends Loan{
	//@Override
	void applyForLoan() {
		
	}
}
//final class Math{
//	void sin() {
//		
//	}
//	void cos() {
//		
//	}
//	void tan() {
//		
//	}
//}
public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int EE = 100;
		//EE = 100;
		final int []t = new int[10];
		t[0]= 10000;
		
		final int MAX = 100;
		final X obj = new X();
		obj.a++;
		obj.b++;
		System.out.println(obj.a+" "+obj.b);
		
		//obj = new X();
		Math.sin(90);
		System.out.println();

	}

}
