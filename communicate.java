class ������ extends Thread{
	���� shop;
	public ������(���� shop) {
		this.shop=shop;
	}
	public void run() {
		for(int i=0; i<20; i++) {
			shop.put(i);
			System.out.println("�����ڰ� : "+i+" ����");
			try {
				sleep(100);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class �Һ��� extends Thread{
	���� shop;
	public �Һ���(���� shop) {
		this.shop=shop;
	}
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println("�Һ��ڰ� : "+shop.get()+" ��ǰ �Һ�");
			try {
				sleep(100);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ����{
	private int goods;
	private boolean available=false;
	
	synchronized int get() {
		try {
			for(;;) {
				if(available != false) break;
				wait();
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		available=false;
		notifyAll();
		return goods;
	}
	
	synchronized void put(int content) {
		try {
			for(;;) {
				if(available != true)break;
				wait();
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		goods=content;
		available=true;
		notifyAll();
	}
}
public class communicate {
	public static void main(String[] args) {
		���� shop = new ����();
		������ obj1 = new ������(shop);
		�Һ��� obj2 = new �Һ���(shop);
		obj1.start();
		obj2.start();
	}
}
