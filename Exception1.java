import java.io.*;
public class Exception1 {
	public static void main(String[] args)throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.print("ù ��° ���� �Է��ϼ��� => ");
			int num1 = Integer.parseInt(in.readLine());
			System.out.print("�� ��° ���� �Է��ϼ��� => ");
			int num2 = Integer.parseInt(in.readLine());
			System.out.println(num1 +"/"+num2+"="+num1/num2);
		}
	}
}
