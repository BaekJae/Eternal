public class String5 {
	public static void main(String[] args) {
		String str = "���� �ʺ���! �ڹ� ���� �ƴϳ�!";
		boolean flag = str.startsWith("���� �����!");
		System.out.println(flag);
		flag=str.startsWith("����");
		System.out.println(flag);
		flag=str.endsWith("���� �ƴϳ�!");
		System.out.println(flag);
	}
}
