import java.awt.*;
public class Checkbox3 extends Frame {
	Checkbox os1, os2, os3;
	Checkbox cpu1, cpu2, cpu3;
	CheckboxGroup cbg;
	public Checkbox3(String str) {
		super(str);
		setLayout(new FlowLayout());
		Label lbl1 = new Label("��ġ�Ǿ� �ִ� OS ����(����)");
		add(lbl1);
		os1 = new Checkbox(" �ȵ���̵�");
		os2 = new Checkbox(" ������");
		os3 = new Checkbox(" ������ 8");
		add(os1); add(os2); add(os3);
		Label lbl2 = new Label("Cpu ���� ����");
		add(lbl2);
		cbg = new CheckboxGroup();
		cpu1 = new Checkbox("AMD",cbg,true);
		cpu2 = new Checkbox("Intel",cbg,false);
		cpu3 = new Checkbox("ARM",cbg,false);
		add(cpu1); add(cpu2); add(cpu3);
		setSize(450,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Checkbox3("üũ �ڽ� ���� 3");
	}
}
