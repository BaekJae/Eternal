enum Lang{
	KOR,ENG,JPN
}
public class EnumExam{
	public static void printLang(Lang obj) {
		System.out.println(obj);
	}
	public static void choiceLang(Lang obj) {
		switch(obj) {
		case KOR:
			System.out.println("�ѱ���");
			break;
		case ENG:
			System.out.println("����");
			break;
		case JPN:
			System.out.println("�Ϻ���");
			break;
		}
	}
	public static void main(String[] args) {
		printLang(Lang.KOR);
		choiceLang(Lang.ENG);
		for(Lang obj : Lang.values()) {
			System.out.print(obj+", ");
		}
	}
}

