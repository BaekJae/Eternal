import java.awt.*;
public class Checkbox2 extends Frame {
	Checkbox cbx1, cbx2, cbx3, cbx4;
	CheckboxGroup cbg;
	public Checkbox2(String str) {
		super(str);
		setLayout(new FlowLayout());
		Label lbl = new Label("�����ϴ� ������ ��� ���ΰ���?", Label.CENTER);
		add(lbl);
		cbg = new CheckboxGroup();
		cbx1 = new Checkbox("��",cbg,true);
		cbx2 = new Checkbox("����",cbg,false);
		cbx3 = new Checkbox("����",cbg,false);
		cbx4 = new Checkbox("�ܿ�",cbg,false);
		add(cbx1); add(cbx2); add(cbx3); add(cbx4);
		setSize(240,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Checkbox2("üũ �ڽ� ���� 2");
	}
}
