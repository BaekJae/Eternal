import java.util.*;
public class Calendar1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("Calendar Ŭ������ �̿��� �ð��� ��¥ ���");
		System.out.print(cal.get(Calendar.YEAR)+"�� ");
		System.out.print((cal.get(Calendar.MONTH)+1)+"�� ");
		System.out.print(cal.get(Calendar.DATE)+"�� ");
		System.out.print(cal.get(Calendar.HOUR)+"�� ");
		System.out.print(cal.get(Calendar.MINUTE)+"�� ");
		System.out.print(cal.get(Calendar.SECOND)+"��");
	}
}
