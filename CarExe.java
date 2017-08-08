interface Speed {
	public int init_speed = 10;
	public void speedUp(int inc);
	public void speedDown(int dec);
}
class Car implements Speed{
	int speed = init_speed;
	public void speedUp(int inc) {
		this.speed += inc;
	}
	public void speedDown(int dec) {
		this.speed -= dec;
	}
	public void display() {
		System.out.println("���� �ӵ��� "+speed+"km/h�Դϴ�.");
	}
}
class CarExe{
	public static void main(String []args) {
		Car obj = new Car();
		obj.speedUp(10);
		obj.display();
		obj.speedDown(5);
		obj.display();
	}
}
