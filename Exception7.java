public class Exception7{
	public static void Exception1() {
		try {
			throw new NumberFormatException("���� ��ȯ ���� �߻�");
		}
		catch (NumberFormatException e) {
			System.out.println("������ �߻��� ���� >> "+e.getMessage());
			throw new ArithmeticException("catch ��Ͽ��� �߻���Ų ����");
		}
	}
	public static void main(String[] args) {
		try {
			System.out.println("====> ���� �߻��� <====");
			Exception1();
		}
		catch(ArithmeticException e) {
			System.out.println("�ߺ��� ���� ó�� ��� >> "+e.getMessage());
		}
	}
}
