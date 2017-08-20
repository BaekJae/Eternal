import java.util.*;
public class StringTokenizerExample {
	public static void main(String[] args) {
		String str = "�ڹٴ� �پ��� ���ڿ� ó��,��¥ ó��,"+"�ð� ó���� ���� �޼ҵ带 ���� �ֽ��ϴ�.";
		StringTokenizer st = new StringTokenizer(str,",");
		System.out.println("��ū ','�� ���� " + st.countTokens()+"��");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
