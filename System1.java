public class System1 {
	public static void main(String[] args) {
		long start,end;
		start=System.currentTimeMillis();
		for(int i=0; i<100000000;i++) {
		}
		end =System.currentTimeMillis();
		System.out.println("1�� �� �ݺ� ���࿡ �ɸ� �ð�  "+(end-start)+" �и���");
	}
}
