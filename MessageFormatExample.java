import java.text.*;
public class MessageFormatExample {
	public static void main(String[] args) {
		String str = "{0}���� {2}�� �Ұ� {3}�� �� {1}�� �귯���ϴ�.";
		MessageFormat mf = new MessageFormat(str);
		Object input[]= {"�ϴ�","�ٴ�","�ٶ�","����"};
		System.out.println(mf.format(input));
	}
}
