public class String4 {
	public static void main(String[] args) {
		int i;
		String str= "2002 WorldCup Korea";
		
		System.out.println("���� ���ڿ� : "+str);
		System.out.print("���ڿ� ������ : ");
		for(i = str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.print("\n¦�� ���ڿ� : ");
		for(i=0;i<str.length();i++) {
			if(i%2 !=0) System.out.print(str.charAt(i));
			else System.out.print(" ");
		}
	}
}
