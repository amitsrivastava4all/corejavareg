import java.lang.reflect.InvocationTargetException;
import java.util.ResourceBundle;

public class TaxFactory {
	private TaxFactory() {}
static ITax getTax() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
	ResourceBundle rb = ResourceBundle.getBundle("object");
	String className = rb.getString("classname");
	return (ITax)Class.forName(className).getConstructor().newInstance();
//	if(className.equals("Vat")) {
//		return new Vat();
//	}
//	else {
//		return new GST();
//	}
	//return new Vat();
}
}
