import java.util.*;
import java.text.*;
public class SimpleDateFormatExample {
	public static void main(String[] args) {
		String format = "������ yyyy�� MM�� dd�̰� E�����̸�";
	    format += " ���ؿ��� D��° ���̸�, ���� w��° ���Դϴ�.";
	    Date date = new Date();
	    SimpleDateFormat sdf = new SimpleDateFormat(format);
	    System.out.println(sdf.format(date));
	}
}
