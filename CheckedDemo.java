package exceptiondemo;

import java.io.File;
import java.io.IOException;

public class CheckedDemo {

	public static void main(String[] args) {
		//c:\\abcd\\xyz
		// UnChecked
		int p = 10/0;
		
		
		// Checked 
		File file = new File("/Users/amit/Documents/javabatchjunreg/exceptiondemo");
		if(file.exists()) {
			file.delete();
		}
		else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Unable to create a file");
				
			}
		}
	}

}
