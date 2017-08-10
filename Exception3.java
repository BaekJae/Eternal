import java.io.*;
public class Exception3 {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			try {
				System.out.print("첫 번째 값을 입력하세요 => ");
				int num1=Integer.parseInt(in.readLine());
				System.out.print("두 번째 값을 입력하세요 => ");
				int num2=Integer.parseInt(in.readLine());
				System.out.println(num1+"/"+num2+"="+num1/num2);
			}
			catch(Exception e) {
				System.out.println("값을 잘못 입력했습니다. 다시 입력하세요.");
			}
		}
	}

}
