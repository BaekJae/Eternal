public class System2 {
	public static void main(String[] args) {
		for(int i=1; i<100000000;i++) {
			if((i%2==0)&&(i%12==0)&&(i%30==0)){
				System.out.println("i�� ���� "+i);
				System.exit(0);
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
}
