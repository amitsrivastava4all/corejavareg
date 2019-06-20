import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Formatting {
//	public static void main(String[] args) {
//		System.out.println(dateFormat());
//	}
	private Formatting() {}
	public static String currencyFormat(BigDecimal bg) {
		Locale locale =new Locale("fr", "FR");
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		return nf.format(bg.doubleValue());
	}
	public static String dateFormat() {
		Date date = new Date();
		Locale locale =new Locale("fr", "FR");
		DateFormat df = DateFormat.
				getDateInstance(DateFormat.FULL, locale);
		//System.out.println("Date is "+date);
		return df.format(date);
		//return null;
//		Locale locale =new Locale("fr", "FR");
//		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
//		return nf.format(bg.doubleValue());
	}
}
