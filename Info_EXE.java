class Info{
	private String name;
	private int age;
	private char sex;
	public Info(String n, int a, char s) {
		name = n;
		age = a;
		sex = s;
	}
	public void display() {
		System.out.println("�̸�="+name+" ����="+age+" ����="+sex);
	}
}
public class Info_EXE {
	public static void main(String[] args) {
		Info info1= new Info("ȫ�浿",20,'m');
		Info info2= new Info("ȫ���",19,'f');
		info1.display();
		info2.display();
	}
}
