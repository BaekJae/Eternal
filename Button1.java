import java.awt.*;
public class Button1 extends Frame {
	Button btn1, btn2, btn3;
	public Button1(String str) {
		super(str);
		setLayout(new FlowLayout());
		btn1 = new Button(" ���� ");
		btn2 = new Button(" ���� ");
		btn3 = new Button("  ��  ");
		add(btn1); add(btn2); add(btn3);
		setSize(200,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Button1("��ư ���� 1");
	}
}
