class Info2{
	private String name;
	private int age;
	private char sex;
	public Info2(String n, int a, char s) {
		name = n;
		age = a;
		sex = s;
	}
	public Info2(String n, int a) {
		name = n;
		age = a;
		sex = 'm';
	}
	public Info2(int a, char s) {
		name = "�͸�";
		age = a;
		sex = 'm';
	}
	public Info2(String n, char s) {
		name = n;
		age = 17;
		sex = s;
	}
	public Info2() {
		name = "�͸�";
		age = 17;
		sex = 'f';
	}
	 public void display() {
		 System.out.println("�̸�="+name+" ����="+age+" ����="+sex);
	 }
}
class Info_EXE2 {
	public static void main(String[] args) {
		Info2 info1 = new Info2("ȫ�浿",20,'m');
		Info2 info2= new Info2("ȫ���",19);
		Info2 info3 = new Info2("�����̼�",'m');
		Info2 info4 = new Info2(31,'f');
		Info2 info5 = new Info2();
		info1.display();
		info2.display();
		info3.display();
		info4.display();
		info5.display();
	}

}
