interface ��{
	public long speed=80;
	public void fly();
}

interface ��{
	public void run();
}

class �䰡���� implements ��,��{
	public void fly() {
		System.out.println("�ϴ��� ����!");
	}
	public void run() {
		System.out.println("����� �޸���!");
	}
}

class ClassPega {
	public static void main(String[] args) {
		�䰡���� pega = new �䰡����();
		pega.fly();
		pega.run();
	}

}
