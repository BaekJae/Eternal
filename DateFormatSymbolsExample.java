import java.util.*;
import java.text.*;
public class DateFormatSymbolsExample {
	public static void main(String[] args) {
		String week[ ] = {"��","��","��","�","��","��","��"};
		String format = "������ yyyy�� MM�� dd�� E�����Դϴ�.";
		DateFormatSymbols obj = new DateFormatSymbols(Locale.KOREA);
		obj.setShortWeekdays(week);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(format,obj);
		System.out.println(sdf.format(date));
	}
}
