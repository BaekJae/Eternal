public class Wrapper8 {
	public static void main(String[] args) {
		Float test = new Float("15.0f");
		System.out.println("���� ��:"+test);
		System.out.println("byte ��:"+test.byteValue());
		System.out.println("short ��:"+test.shortValue());
		System.out.println("int ��:"+test.intValue());
		System.out.println("long ��:"+test.longValue());
		System.out.println("double ��:"+test.doubleValue());
		System.out.println("NaN üũ:"+test.isNaN());
		System.out.println("������ üũ :"+test.isInfinite());
	}
}
