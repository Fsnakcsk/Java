class MyInteger extends Object
{
//	private final int value;
	private int value;
	MyInteger(int x) {
		value = x;
	}
	public int get() {
		return value;
	}
	public void set(int x) {
		value = x;
	}
	public String toString() {
		return "" + value;
	}
	static void swap(MyInteger a, MyInteger b) {
		int tmp;

		tmp = a.get();
		a.set(b.get());
		b.set(tmp);
	}
}
 
class IntegerTest
{
	public static void main(String[] args) 
	{
		MyInteger x = new MyInteger(10);
		MyInteger y = new MyInteger(20);
		
		MyInteger.swap(x,y); // 선호하지 않다.
		System.out.println("x = " + x + ", y = " + y);
	}
}
