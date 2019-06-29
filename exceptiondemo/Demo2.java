package exceptiondemo;

public class Demo2 {

	static String getDataFromDB() {
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("1. DB Connection Open");
			String name = getDataFromDB();
			if(10>2) {
				System.exit(0);
			//return ;
			}
			//name.length();
//			if(name!=null) {
//			name.length();
//			}
			System.out.println("2. QUERY");
			System.out.println("3. Fetch");
		}
		catch(NullPointerException e) {
			System.out.println("Something went wrong contact to System admin");
		}
		finally {
			System.out.println("DB Connection Close");
		}

	}

}
