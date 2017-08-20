import java.text.*;
import java.io.*;
public class MessageFormatTest {
	public static void main(String[] args) throws IOException {
		String message ="{0}���� ������ ����:{1}��, ����:{2}���Դϴ�.";
		MessageFormat mf = new MessageFormat(message);
		Object []input = new Object[3];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�̸� �Է� ==> ");
		input[0] = (String) br.readLine();
		System.out.print("���� ���� ==> ");
		input[1]= br.readLine();
		System.out.print("���� ���� ==> ");
		input[2]= br.readLine();
		System.out.println(mf.format(input));
	}
}
