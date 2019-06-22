class A{
	int x;
	A(){
		this(100);
		x = 100;
		System.out.println("A Cons call");
	}
	A(int x){
		//this();
		System.out.println("A Param Cons Call");
	}
}
class B extends A{
	int x;
	int y ;
	B(){
		//super(10);
		x = 200;
		y = 9999;
		System.out.println("B Cons call");
	}
	B(int x){
		this();
		//super(10);
		System.out.println("B Param Cons Call");
	}
}
class C extends B{
	int x;
	C(){
		super(20);
		
		// Implicit Super constructor call
		//super(); // Call to parent default cons
		x = 300 + y;
		System.out.println("C Cons call");
	}
	C(int x){
		this();
		//super(200);
		// super();
		System.out.println("C Param Cons Call");
	}
}
public class ISADemo3 {

	public static void main(String[] args) {
		C c = new C(100);
		// TODO Auto-generated method stub

	}

}
