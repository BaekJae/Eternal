class Thread_EX4 extends Thread{
	public Thread_EX4(String name) {
		super(name);
	}
	public void run() {
		System.out.println(getName()+" : ������");
	}
}
class Thread_EXE4 {
	public static void main(String[] str) {
		Thread_EX4 obj1 = new Thread_EX4("�ְ� �켱 ����");
		Thread_EX4 obj2 = new Thread_EX4("�߰� �켱 ����");
		Thread_EX4 obj3 = new Thread_EX4("���� �켱 ����");
		
		obj1.setPriority(Thread.MAX_PRIORITY);
		obj2.setPriority(Thread.NORM_PRIORITY);
		obj3.setPriority(Thread.MIN_PRIORITY);
		
		obj1.start();
		obj2.start();
		obj3.start();
	}

}
