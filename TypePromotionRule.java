class Ty{
//	void show(Integer x) {
//		System.out.println("Integer");
//	}
	void show(Long x) {
		System.out.println("Long");
	}
//	void show(int ...x) {  // 1.5
//		System.out.println("int var args");
//	}
	void show(byte x) {
		System.out.println("byte ");
	}
	void show(short x) {
		System.out.println("short");
	}
	/*void show(int x) {
		System.out.println("int");
	}*/
//	void show(long x) {
//		System.out.println("long");
//	}
//	void show(float x) {
//		System.out.println("float");
//	}
}
public class TypePromotionRule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ty t = new Ty();
		//t.show(10);
		//t.show((byte)10);

	}

}
