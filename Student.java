
public class Student {
	private int id;  // Instance Variable
	private String name;
	private String course;
	private String phone;
	
	//Student(){}
	
	
	void Student() {
		System.out.println("I am a Method Not a "
				+ "Constructor U need to call me");
	}
	
	// Constructor overloading
	// Default 
	Student(){
		//System.out.println("Default Cons Call");
		course = "Java";
		
	}
	Student (int id, String name){
		this(); // Calling must be on first line
		this.id = id ;
		this.name = name;
	}
	// Param
	Student(int id, String name , String phone){
		//this(); // Default Constructor Calling
		this(id, name);
//		this.id = id;
//		this.name = name;
		this.phone = phone;
	}
	
	// Initalize 
	// Local Var
	public void takeInput(int id , String name, String course , String phone) {
		// Instance Var = Local Var
		if(id<=0) {
			System.out.println("Id is Invalid");
			return ;
		}
		this.id = id;
		this.name = name;
		this.course = course;
		this.phone = phone;
	}
	public void print() {
		// this
		System.out.println("Id is "+this.id);
		System.out.println("Name is "+name);
		System.out.println("Course "+course);
		System.out.println("Phone "+this.phone);
	}

}
