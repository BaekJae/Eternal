import java.awt.*;
public class Checkbox1 extends Frame {
	public Checkbox1(String str) {
		super(str);
		setLayout(new FlowLayout());
		Checkbox cbx1 = new Checkbox("����",true);
		Checkbox cbx2 = new Checkbox("����");
		add(cbx1); add(cbx2);
		setSize(200,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Checkbox1("üũ �ڽ� ���� 1");
	}
}
