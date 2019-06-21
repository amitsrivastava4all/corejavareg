import java.text.NumberFormat;

class Printer{
	private static  Printer printer;  // null
	private Printer(){}
	void show() {
		System.out.println("CAll Show");
	}
	public static Printer getInstance() {
		if(printer == null) {
			printer = new Printer();
		}
		return printer;
	}
}
public class SingletonDemo {

	public static void main(String[] args) {
		//Printer p1 = new Printer();
		//NumberFormat nf = NumberFormat.getCurrencyInstance();
		Printer printer1=  Printer.getInstance();
		printer1.show();
		Printer printer2=  Printer.getInstance();
		Printer printer3=  Printer.getInstance();
		Printer printer4=  Printer.getInstance();
		Printer printer5=  Printer.getInstance();
		if(printer1 == printer2 && printer1==printer3) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not Same");
		}
//		Printer p1 = new Printer();
//		Printer p2 = new Printer();
//		Printer p3 = new Printer();
//		Printer p4 = new Printer();
//		Printer p5 = new Printer();

	}

}
