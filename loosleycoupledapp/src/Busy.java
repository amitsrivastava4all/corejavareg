import java.lang.reflect.InvocationTargetException;

public class Busy {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
//		GST gst = new GST();
//		gst.tax();
//		gst.types();
//		ITax tax = new GST();
//		tax.tax();
		ITax tax = TaxFactory.getTax();
		tax.tax();
		//tax.types();

	}

}
