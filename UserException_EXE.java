class UserException extends Exception{
	public UserException(String str) {
		super(str);
	}
}
public class UserException_EXE {
	public static void main(String[] args) {
		try {
			int a = 11;
			if(a%5 != 0) {
				throw new UserException("5�� ����� �ƴ�!");
			}
		}
		catch(UserException e) {
			System.out.println(e.getMessage());
		}
	}
}
