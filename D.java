
 class C {
	 int x=10;
	 int y=20;//���� ������ ����=default ����
	 int add() {
		 return(x+y);
	 }
}
 
 class D{
	 public static void main(String[] args) {
		 C a= new C();
		 System.out.println("x=" +a.x);
		 System.out.println("y=" +a.y);
		 System.out.println("sum=" +a.add());
	 }
 }
