class TestInteger
{
	public static void main(String[] args) 
	{
		// java������ x = new int() ���� �ȵ�, heap�������� �����ϸ� ������ Integer�� �ؾ� ��.
		// ���۷��� ������ ���� ó���ϱ� ���� Integer �ʿ���.

//		Integer x = new Integer(5);
//		System.out.println(x);
//---------------------------------------------------------------------------------
		// type casting
		// boxing
		Integer x;
		x = 5;

		System.out.println(x);

		int a;
		// unboxing
		a = x;
		System.out.println(a);
//----------------------------------------------------------------------------------

/*
		System.out.println("--------------------------------------------------");
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.reverse(10));
*/
	}
}
