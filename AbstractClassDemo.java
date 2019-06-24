abstract  class Insurance{
	int x;
	int y ;
	//static final int z;
	Insurance(){
		x = 100;
		y = 200;
	//	z = 1000;
	}
	void withDraw() {
		System.out.println("X is "+x+" and y is "+y);
	}
	abstract void mature();
	abstract void pay();
}
class LifeInsurance extends Insurance{

	@Override
	void pay() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void mature() {
		// TODO Auto-generated method stub
		
	}
	
}
 abstract class AccInsurance extends Insurance{
	 @Override
		void pay() {
			// TODO Auto-generated method stub
			
		}
}
  class HdfcAccInsurance extends AccInsurance{
	 @Override
		void mature() {
			// TODO Auto-generated method stub
			
		}
}

public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Insurance insurance = new Insurance();
		LifeInsurance l = new LifeInsurance();

	}

}
