import java.util.*;
public class Lottery {
	static Vector lottery = new Vector();
	public static void main(String[] args) {
		System.out.println("1~10000 ������ ���� ��÷�Դϴ�.");
		for(int i=1; i<=3;i++) {
			for(int j=1; j<=i; j++) {
				if(i>1) {
					System.out.println(i+"�� ����("+j+") : "+nansu(System.currentTimeMillis()));
				}
				else if(i==1) {
					System.out.println(i+"�� ������ : "+nansu(System.currentTimeMillis()));
				}
			}
		}
	}
	public static int nansu( long seed) {
		Random rnd = new Random();
		int nansu=0;
		rnd.setSeed(seed);
		while(true) {
			nansu=(int)((10000-1+1)*rnd.nextDouble()+1);
			if(!lottery.contains(new Integer(nansu)))
				break;
		}
		lottery.addElement(new Integer(nansu));
		return nansu;
	}
}
