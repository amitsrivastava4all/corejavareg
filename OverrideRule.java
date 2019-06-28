class X1{
	int a, b;
}
class XPlus extends X1{
	int c, d;
}

class Bill{
	Person person = new Person(1001,"Ram");
	Order order  = new Order();
	Payment pay =new Payment();
}
class Person{
	int id;
	String name;
	String address;
	String phone;
	String email;
	Person(int id , String name){
		this.id = id;
		this.name = name;
	}
}
class Order{
	int id =11;
}
class Payment{
	String mode = "Card";
}

class N{
	
	X1 show() {
		System.out.println("N Show");
		return new X1();
	}
}
class M extends N{
	@Override
	protected XPlus show() {
		System.out.println("M Show");
		return new XPlus();
	}
//	void takePersonData(int id, String name, String address,String phone, String gender, String currentAddress, String tempAddress){
//		
//	}
void takePersonData(Person person) {
	}
	Bill print() {
//		Person p = new Person(1001, "Amit");
//		return p;
		//return new Person(1001,"Amit");
		return new Bill();
		//return 10;  // 10 , Amit
	}
//	Person print() {
////		Person p = new Person(1001, "Amit");
////		return p;
//		return new Person(1001,"Amit");
//		//return 10;  // 10 , Amit
//	}
}
public class OverrideRule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M m  = new M();
		Bill bill = m.print();
		System.out.println(bill.person.id);
		System.out.println(bill.person.name);
		System.out.println(bill.order.id);
		System.out.println(bill.pay.mode);

	}

}
