interface �ڵ��� {
	void run();
}
interface ��{
	void navigation();
}
interface ��������ڵ��� extends �ڵ���, ��{
	void floating();
}
class Interface implements ��������ڵ���{
	public void run() {
		System.out.println("������ �޸��� �ɷ�");
	}
	public void navigation() {
		System.out.println("�ٴٸ� �����ϴ� �ɷ�");
	}
	public void floating(){
		System.out.println("���߿� ���ִ� �ɷ�");
	}
}
class InterfaceExe {
	public static void main(String[] args) {
		Interface obj = new Interface();
		obj.run();
		obj.navigation();
		obj.floating();
	}

}
