import java.util.*;
public class TreeSetTest1 {
	public static void main(String[] args) {
		char ch = ' ';
		TreeSet set = new TreeSet();
		for(int i=0; i<95; i++) {
			System.out.print(ch+" ");
			set.add(ch++);
		}
		System.out.println();
		System.out.println("Alpabet : "+set.subSet('A','Z'));
		System.out.println("%���� ���� �� : "+set.headSet('%'));
		System.out.println("x���� ū ��    : "+set.tailSet('x'));
	}
}
