import java.lang.reflect.InvocationTargetException;

public class Tally {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
//		ITax tax = new GST();
//		tax.tax();
		ITax tax = TaxFactory.getTax();
		tax.tax();
	}	

}
