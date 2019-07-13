package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

class Job implements Runnable{
	String source = "/Users/amit/Documents/filecopy/sample.mp3";
	String target ;
	Job(String fileName){
			this.target  = fileName;
	}
	@Override
	public void run() {
		System.out.println("Copy Start "+this.target);
		int EOF = -1;
		FileInputStream fs = null;
		FileOutputStream fo = null;
		try {
		 fs = new FileInputStream(source);
		 fo = new FileOutputStream(target);
		int read = fs.read();
		while(read!=EOF) {
			fo.write(read);
			read = fs.read();
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
			if(fs!=null) {
				fs.close();
			}
			if(fo!=null) {
				fo.close();
			}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
//		fs.close();
//		fo.close();
//		for(int i = 1; i<=5; i++) {
//			System.out.println("I is "+i
//					+" Name "+Thread.currentThread().getName());
//		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job job = new Job("/Users/amit/Documents/filecopy/sample1.mp3");
		Thread worker = new Thread(job,"ram");
		Job job2 = new Job("/Users/amit/Documents/filecopy/sample2.mp3");
		Thread worker2 = new Thread(job2,"shyam");
		Job job3 = new Job("/Users/amit/Documents/filecopy/sample3.mp3");
		Thread worker3 = new Thread(job3,"tim");
		worker.start();
		worker2.start();
		worker3.start();
//		for(int i = 10; i>=1; i--) {
//			System.out.println("I is "+i
//					+" Name "+Thread.currentThread().getName());
//		}
		

	}

}
