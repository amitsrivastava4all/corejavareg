
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String r = new String("Hello");
		int x = 10;
		//Student ram = new Student();
		Student ram = new Student(1001,"Ram","2222");
		//ram.takeInput(1001, "Ram", "java", "2222");
		ram.print();
		ram.Student();
//		System.out.println("Id is "+ram.id);
//		System.out.println("Name is "+ram.name);
//		System.out.println(ram.course);
//		System.out.println(ram.phone);
		System.out.println("*************");
		Student shyam = new Student(1002, "Shyam","3333");
		//shyam.takeInput(-1002, "Shyam", "C", "3333");
//		shyam.id = -1002;
//		shyam.name="Shyam";
		shyam.print();
//		System.out.println(shyam.id);
//		System.out.println(shyam.name);
//		System.out.println(shyam.course);
//		System.out.println(shyam.phone);
		
		

	}

}
