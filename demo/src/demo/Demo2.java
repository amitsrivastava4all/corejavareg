package demo;
class Account implements Runnable{
	int i =1 ;
	int amount = 5000;
	@Override
	//public synchronized void run() {
	public  void run() {
		for(int j=1 ; j<=5; j++) {
			synchronized (this) {
				if(j==5 && amount>=5000 ) {
					amount = amount - 5000;
				}
				i++;
			}
			
			System.out.println("Amount "+amount+"I is "+i+" J is "
		+j+" Name "+Thread.currentThread().getName());
		}
	}
}
public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		Account a = new Account();
		Thread ram =new Thread(a,"ram");
		Thread shyam =new Thread(a,"shyam");
		Thread mike =new Thread(a,"mike");
		Thread tim =new Thread(a,"tim");
		ram.start();
		System.out.println(ram.isAlive());
		ram.join();
		shyam.start();
		mike.start();
		tim.start();
		

	}

}
