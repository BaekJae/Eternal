public class String11 {
	public static void main(String[] args) {
		String str[]= {"���","�ڹ�","Love","love","��"};
        System.out.println(" ***���� ���� �� ���ڿ�*** ");
        for(int i=0;i<str.length;i++) {
        	System.out.print(str[i]+"\t");
        }
        System.out.println("\n ***���� ���� �� ���ڿ�*** ");
        for(int k=0; k<str.length;k++) {
        	for(int j=k+1;j<str.length;j++) {
        		if(str[k].compareTo(str[j])>0) {
        			String temp = str[k];
        			str[k] = str[j];
        			str[j] = temp;
        		}
        	}
        	System.out.print(str[k]+"\t");
        }
	}
}
