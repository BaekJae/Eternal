interface A{
	public void print1();
}
class AA implements A{
	public void print1() {
		System.out.println("A �������̽�");
	}
	public void print2() {
		System.out.println("AA Ŭ����");
	}
}
class Interface2 {
	public static void main(String[] args) {
		AA obj1 = new AA();
		obj1.print1();
		obj1.print2();
		System.out.println("===================");
		A obj2 = new AA();
		obj2.print1();
		//obj2.print2();
	}
}
