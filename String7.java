public class String7 {
	public static void main(String[] args) {
		String str = "�� ���� �ܾ ���ԵǾ� �������?";
		int count=0;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)==' ')
				count++;
		}
		System.out.println(str+" ���� �ȿ� ���Ե� �ܾ�� "+(count+1)+"��");
	}
}
