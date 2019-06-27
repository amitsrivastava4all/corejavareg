import java.util.ArrayList;

class MyCustomer{
	long id;
	String name;
	MyCustomer(long id , String name){
		this.id = id;
		this.name = name;
	}
}
public class HeapDemo {
void add(int x, double y) {
		
	}
	void add(int x, int y) {
		
	}
void add(double x, int y) {
		
	}
	void add(int x, int y, int z) {
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		for(int i = 1;i<=100000;i++) {
			
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		ArrayList l = new ArrayList();
		long a = 1;
		System.out.println("Program Start");
		while(true) {
			MyCustomer obj = new MyCustomer(a,"Ram"+a);
			l.add(obj);
			Thread.sleep(50);
			
		}

	}

}
