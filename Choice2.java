import java.awt.*;
public class Choice2 extends Frame {
	String continent[]= {"�ƽþ�","����","�Ƹ޸�ī","������ī","�����ƴϾ�"};
	String country[]= {"���ѹα�","����","ĳ����","����Ʈ","ȣ��"};
	public Choice2(String str) {
		super(str);
		setLayout(new FlowLayout());
		Label lbl1 = new Label("����� �����ϼ���!");
		Label lbl2 = new Label("������ �����ϼ���!");
		Choice choice1 = new Choice();
		Choice choice2 = new Choice();
		for(int i=0; i<continent.length;i++) {
			choice1.add(continent[i]);
		}
		for(int i=0; i<country.length;i++) {
			choice2.add(country[i]);
		}
		add(lbl1); add(choice1);
		add(lbl2); add(choice2);
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Choice2("���� ���� 2");
	}
}
	
