class Overloading{
	void display() {
		System.out.println(" ���޵� �� ����");
	}
	void display(int a ) {
		System.out.println(" A ���� "+a);
	}
	void display(String name) {
		System.out.println(" �� �̸��� "+name);
	}
	void display(String name, int age) {
		System.out.println("�� �̸��� "+name+" ���̴� "+age);
	}
}
public class Overloading_EXE {
	public static void main(String[] args) {
		Overloading over= new Overloading();
		over.display();
		over.display(100);
		over.display("ȫ�浿");
		over.display("ȫ���",26);
	}
}
