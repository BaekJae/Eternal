import java.io.*;
public class Exception4 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			try {
				System.out.print("ù ��° ���� �Է��ϼ��� => ");
				int num1 = Integer.parseInt(in.readLine());
				System.out.print("�� ��° ���� �Է��ϼ��� => ");
				int num2 = Integer.parseInt(in.readLine());
				System.out.println(num1+"/"+num2+"="+num1/num2);
			}
			catch(NumberFormatException e) {
				System.out.println("�Է��� ���ڸ� ���� �������� ������ �� �����ϴ�.");
			}
			catch(ArithmeticException e) {
				System.out.println("0���� ������ ����� ó���� �� �����ϴ�.");
			}
		}
		
	}

}
