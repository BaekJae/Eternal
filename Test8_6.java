import java.io.IOException;
import java.util.Date;
class Timer extends Thread{
	public Timer(String name) {
		super(name);
	}
	public void run() {
		try {
			while(true) {
				Thread.sleep(10000);
				System.out.println("����ð�:"+new Date());
			}
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
class KeyLogger extends Thread{
	public KeyLogger(String name) {
		super(name);
	}
	public void run() {
		try {
			while(true) {
				int data = System.in.read();
				System.out.println(data+"��"+ new Date() +"�� �ԷµǾ����ϴ�.");
				}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
public class Test8_6 {
	public static void main(String[] str) {
		Timer timer = new Timer("Ÿ�̸�");
		KeyLogger key = new KeyLogger("Ű ����");
		timer.start();
		key.start();
	}

}
