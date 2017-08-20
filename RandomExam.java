import java.util.*;
public class RandomExam {
	public static void main(String[] args) {
		Random rnd = new Random(System.currentTimeMillis());
		for(int i=0; i<5; i++) {
			System.out.println("float�� ���� : "+rnd.nextFloat());
			System.out.println("boolean�� ���� : "+rnd.nextBoolean());
			System.out.println("int�� ���� : "+rnd.nextInt());
			System.out.println("long�� ���� : "+rnd.nextLong());
			System.out.println("double�� ���� : "+rnd.nextDouble());
			System.out.println("Gaussian�� ���� : "+rnd.nextGaussian());
		}
		System.out.println("-7 ���� 12 ���̿��� ���� 10�� �߻�");
		for(int i=0; i<10; i++) {
			int nansu = (int)((12-(-7)+1)*rnd.nextDouble()+(-7));
			System.out.print(nansu+"\t");
		}
	}
}
