import java.awt.*;
public class Choice1 extends Frame {
	public Choice1(String str) {
		super(str);
		setLayout(new FlowLayout());
		Label lbl = new Label("������ �����ϼ���!");
		Choice choice = new Choice();
		choice.add("���ѹα�");
		choice.add("�� ��");
		choice.add("�� ��");
		choice.add("������");
		choice.add("�� ��");
		choice.add("���þ�");
		add(lbl);
		add(choice);
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Choice1("Choice ���� 1");
	}
}
