class This2{
	String name;
	int age;
	char sex;
	public This2(String name,int age,char sex) {
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	public This2() {
		this("�����̼�",27,'m');
	}
	public This2(String name, int age) {
		this(name,age,'f');
	}
	public This2(String name, char sex) {
		this(name,19,sex);
	}
	public void display() {
		System.out.println("�̸��� "+name+" ���̴� "+age+" ������ "+sex);
	}
}
class This2_EXE {
	public static void main(String[] args) {
		This2 t1=new This2();
		This2 t2=new This2("�浿",25);
		This2 t3=new This2("���",'f');
		
		t1.display();
		t2.display();
		t3.display();
	}
}
