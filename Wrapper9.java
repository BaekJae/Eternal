public class Wrapper9 {
	public static void main(String[] args) {
		Double one = new Double("10");
		double two = 3;
		double result = one.doubleValue()/two;
		System.out.println("result :"+result);
		System.out.println("NaN üũ:" +Double.isNaN(result));
		System.out.println("���Ѵ� üũ:"+Double.isInfinite(result));
		System.out.println("Double �ִ밪:"+Double.MAX_VALUE);
		System.out.println("Double �ּҰ�:"+Double.MIN_VALUE);
	}
}
