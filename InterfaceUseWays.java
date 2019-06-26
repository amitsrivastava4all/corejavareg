@FunctionalInterface
interface Calculate{
	//int compute2(int x,int y);
	
	int compute(int x,int y);
}

class A1{
	void show() {
		System.out.println("A Show");
	}
	void print() {
		System.out.println("A Print");
	}
}

class MyCalc implements Calculate{
	@Override
	public int compute(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}
	
	
}
public class InterfaceUseWays {

	public static void main(String[] args) {
		A1 a1 = new A1() {
			@Override
			void show() {
				super.show();
				System.out.println("A1 Show...");
			}
		};
		a1.show();
		a1.print();
		System.out.println("***********************");
		Calculate ca1 = (a,b)->{
			a= a*b;
			return a+b;
		};
		Calculate ca = (a,b)->a+b;
		System.out.println(ca.compute(10000, 20000));
		
		MyCalc c = new MyCalc();
		Calculate e= new Calculate() {
			
			@Override
			public int compute(int x, int y) {
				// TODO Auto-generated method stub
				return x-y;
			}
		};
		System.out.println(e.compute(10, 20));
		System.out.println(c.compute(100, 200));
		if(10>2) {
			//Calculate d = new ________()
		Calculate d = new Calculate() {
			int x,y;
			void init() {
				x = 100;
				y = 200;
			}
			@Override
			public int compute(int x, int y) {
				// TODO Auto-generated method stub
				init();
				return x * y;
			}
		};
		
		System.out.println(d.compute(100, 2));
		}
		
		
		// TODO Auto-generated method stub

	}

}
