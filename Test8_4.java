import java.util.Random;
class Player extends Thread{
	String player_name;
	public Player(String name) {
		this.player_name=name;
	}
	public void run() {
		try {
			Random oRandom = new Random();
			int i = oRandom.nextInt(2);
			String data = "";
			switch(i) {
			case 0:
				data = "����";
				break;
			case 1:
				data = "����";
				break;
			case 2:
				data = "��";
				break;
			}
			System.out.println(player_name+"�� "+data+"�� �½��ϴ�.");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
public class Test8_4 {
	public static void main(String[] str) {
		Player a= new Player("ȫ�浿");
		Player b= new Player("��");
		a.start();
		b.start();
	}
}
