class P{
	int a = 10;
	void show() {
		System.out.println("P Show");
	}
}
class Q extends P{
	int a = 20;
	@Override
	void show() {
		System.out.println("Q Show "+a);
	}
}
class T extends Q{
	int a = 30;
	T(int a){
		int z = ((P)this).a + ((Q)this).a + this.a + a;
		System.out.println("Z is "+z);
	}
	@Override
	void show() {
		System.out.println("T Show");
	}
}
public class ISADemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T t = new T(1);
		P p = new Q();
		p.show();
		System.out.println("A is "+p.a);
		

	}

}
