import java.awt.*;
public class Button2 extends Frame {
	Label lbl1, lbl2, lbl3;
	Button btn1, btn2, btn3;
	public Button2(String str) {
		super(str);
		setLayout(new FlowLayout());
		lbl1 = new Label("����");
		lbl2 = new Label("����");
		lbl3 = new Label(" �� ");
		btn1 = new Button("����");
		btn2 = new Button("����");
		btn3 = new Button(" �� ");
		add(lbl1); add(btn1);
		add(lbl2); add(btn2);
		add(lbl3); add(btn3);
		lbl1.setEnabled(false);
		btn3.setEnabled(false);		
		setSize(300,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Button2("��ư ���� 2");
	}
}