class TestInteger
{
	public static void main(String[] args) 
	{
		// java에서는 x = new int() 절대 안됨, heap영역에서 선언하면 무조건 Integer로 해야 함.
		// 레퍼렌스 단위로 일을 처리하기 위해 Integer 필요함.

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
