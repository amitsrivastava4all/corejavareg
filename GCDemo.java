class A5{
	
}
public class GCDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A5 obj = new A5();
		obj = null; // Eligable GC
		if(10>2) {
			A5 obj2 = new A5();
		}  // after i obj2 is eligable for G.C
		A5 obj3 = new A5();
		A5 obj4 = new A5();
		obj3 = obj4; // Reassign eligiable for G.C
	}

}
