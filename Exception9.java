import java.io.*;
public class Exception9 {
	public static void main(String[] args) throws Exception {
		try {
			input();
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void input() throws ArithmeticException, IOException, NumberFormatException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.print("ù ��° ���� �Է��ϼ��� >> ");
			int num1 = Integer.parseInt(in.readLine());
			System.out.print("�� ��° ���� �Է��ϼ��� >> ");
			int num2 = Integer.parseInt(in.readLine());
			dividing(num1,num2);
		}
	}
	public static void dividing(int num1, int num2) throws ArithmeticException {
		System.out.println(num1+"/"+num2+"="+num1/num2);
	}
}
