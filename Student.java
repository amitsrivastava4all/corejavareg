
public class Student {
	private int id;  // Instance Variable
	private String name;
	private String course;
	private String phone;
	private int marks[]= new int[3];
	
	//Student(){}
	
	
	void Student() {
		System.out.println("I am a Method Not a "
				+ "Constructor U need to call me");
	}
	
	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
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
		//StringUtil sb = new StringUtil();
		//this.name = sb.titleCase(name);
		this.name = StringUtil.titleCase(name);
	}
	// Param
	Student(int id, String name , String phone, int marks[]){
		//this(); // Default Constructor Calling
		this(id, name);
//		this.id = id;
//		this.name = name;
		this.phone = phone;
		this.marks = marks;
	}
	public String printReport() {
		String markStr = "";
		for(int mark:marks) {
				markStr+= mark +"\n";
		}
		return "Id "+id+ " Name "+name+"\n"
				+"Course "+course+" Phone "+phone+"\n"
				+"Marks are \n"+markStr+
				"Total "+total()+" Percentage "+per()+
				"\nGrade "+grade();
	}
	private double per() {
		return total()/marks.length;
	}
	private String grade() {
			double percentage = per();
			if(percentage>=90) {
				return "A Grade";
			}
			else
			if(percentage<90 && percentage>=70) {
				return "B Grade";
			}
			else
			if(percentage<70 && percentage>=60) {	
				return "C Grade";
			}
			else {
				return "D Grade";
			}
	}
	private int total() {
		int sum = 0;
		for(int mark : marks) {
			sum+=mark;
		}
		return sum;
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
	/*
	public void print() {
		// this
		System.out.println("Id is "+this.id);
		System.out.println("Name is "+name);
		System.out.println("Course "+course);
		System.out.println("Phone "+this.phone);
	}*/

}
