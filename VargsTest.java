
public class VargsTest {
	public void input(int...datas) {
		System.out.println("�� ������ ���� : "+datas.length );
		for (int temp : datas) {
			System.out.println("������ : "+temp);
		}
	}
public static void main(String[] args) {
	VargsTest vt= new VargsTest();
	vt.input(1,2,5,-10,20,100);
 }
}
