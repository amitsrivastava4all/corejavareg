import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String r = new String("Hello");
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter the Id ");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the Name");
		String name = scanner.nextLine();
		System.out.println("Enter the Phone");
		String phone = scanner.next();
		//int marks[] = {90,88,67};
		int marks [] = new int[3];
		
		for(int i = 0 ; i<marks.length; i++) {
			System.out.println("Enter "+(i+1)+" Mark");
			marks[i] = scanner.nextInt();
		}
		
		int x = 10;
		//Student ram = new Student();
		
		Student ram = new Student(id,name,phone,marks);
		System.out.println("Enter the New Phone Number");
		ram.setPhone(scanner.next());
		//ram.setPhone("4444");
		System.out.println(ram.printReport());
		scanner.close();
		//ram.takeInput(1001, "Ram", "java", "2222");
		//ram.print();
		//ram.Student();
//		System.out.println("Id is "+ram.id);
//		System.out.println("Name is "+ram.name);
//		System.out.println(ram.course);
//		System.out.println(ram.phone);
//		System.out.println("*************");
//		Student shyam = new Student(1002, "Shyam","3333");
//		//shyam.takeInput(-1002, "Shyam", "C", "3333");
////		shyam.id = -1002;
////		shyam.name="Shyam";
//		shyam.print();
//		System.out.println(shyam.id);
//		System.out.println(shyam.name);
//		System.out.println(shyam.course);
//		System.out.println(shyam.phone);
		
		

	}

}
