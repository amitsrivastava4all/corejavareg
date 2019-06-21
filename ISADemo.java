class Account{
	double balance;
	int id;
	String name;
	void deposit() {
		System.out.println("Account Deposit");
	}
	void withDraw() {
		System.out.println("Account WithDraw");
	}
	void roi() {
		System.out.println("4% ROI");
	}
}
class SavingAccount extends Account {
	@Override
	void deposit() {
		System.out.println("WithDraw Need Pan Card > 50K");
	}
	void transLimit() {
			System.out.println("Trans Limit");
	}
}
class CurrentAccount extends Account{
	
	@Override
	 public void roi() {
		
		System.out.println("5% ROI");
		super.roi();
	}
	 void odLimit() {
		System.out.println("Od Limit");
	}
}
class CorpAccount extends CurrentAccount{
	
}
public class ISADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sa = new SavingAccount();
		sa.deposit();
		sa.withDraw();
		sa.transLimit();
		sa.roi();
		System.out.println("********************************");
		CurrentAccount ca = new CurrentAccount();
		ca.deposit();
		ca.withDraw();
		ca.odLimit();
		ca.roi();

	}

}
