import java.util.*;
public class HashMapTest {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("�̱�", "1");
		map.put("�ѱ�", "82");
		map.put("����Ʈ", "20");
		map.put("�׸���", "30");
		map.put("������", "33");
		map.put("����", "44");
		map.put("�����", "55");
		
		Set set = map.keySet();
		System.out.println("������ : "+set);
		set=map.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("���� : "+e.getKey()+" - ��ȣ : "+e.getValue());
		}
	}
}
