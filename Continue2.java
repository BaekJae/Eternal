
public class Continue2 {
	public static void main(String[] args) {
		previous:
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(j>i) {
						System.out.println();
						continue previous;
					}
					System.out.print(i*j + "\t");
				}
			}
	}
}

