public class String10 {
	public static void main(String[] args) {
		String str1 = "�ڹ�";
		String str2 = "JAVA";
		String str3 = "java";
		System.out.println("���ڿ� str1 = "+str1);
		System.out.println("���ڿ� str2 = "+str2);
		System.out.println("���ڿ� str3 = "+str3);
		System.out.println("JAVA�� java�� "+((str2.equals(str3))?"����":"Ʋ��"));
		System.out.println("JAVA�� java�� "+((str2.equalsIgnoreCase(str3))?"����":"Ʋ��"));
	}
}
