class Thread_EX2 extends Thread{
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				Thread.sleep(1000);
				System.out.println(i+"�� : ������");
			}
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
public class Thread_EXE2 {
	public static void main(String [] str) {
		try {
			Thread_EX2 thread = new Thread_EX2();
			thread.start();
			for(int i=0;i<5;i++) {
				Thread.sleep(1000);
				System.out.println(i+"�� : main �޼ҵ�");
			}
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
