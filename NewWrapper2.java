public class NewWrapper2{
	public static void main(String[] args){
		
			if(args.length != 1){
			System.out.println("����: java Wrapper2 ���ڿ� ....");
			System.exit(0);
			}
			char obj[]=new char[args[0].length()];
			args[0].getChars(0,args[0].length(),obj,0);
			for(int i=0;i<obj.length;i++){
				System.out.println("�Էµ� ���� [" +obj[i]+"] :");
				if(Character.isDefined(obj[i]))
					System.out.println("�����ڵ��Դϴ�.");
				if(Character.isDigit(obj[i]))
					System.out.println("�����Դϴ�.");
				if(Character.isLetter(obj[i]))
					System.out.println("�����Դϴ�.");
				System.out.println("==================");
			}
	}	
}