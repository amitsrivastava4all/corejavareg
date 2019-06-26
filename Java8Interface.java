interface T1{
	void show();
	default void disp() {
		System.out.println("I am T1 Disp");
	}
}
interface T2{
	default void print() {
		
	}
	default void disp() {
		System.out.println("I am T2 Disp");
	}
	static void output() {
		System.out.println("I am Output");
	}
}
class T3 implements T1, T2{
	@Override
	public void disp() {
		T1.super.disp();
		T2.super.disp();
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Java8Interface {

	public static void main(String[] args) {
		T2.output();
		// TODO Auto-generated method stub

	}

}
