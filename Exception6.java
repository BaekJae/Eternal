public class Exception6 {
	public static void main(String[] args) {
		try {
			System.out.println("=====> ���� �߻� �� <=====");
			throw new NumberFormatException("���� ��ȯ ���� �߻�");
		}
		catch(NumberFormatException e) {
			System.out.println("������ �߻��� ���� >> "+e.getMessage());
		}
	}
}
