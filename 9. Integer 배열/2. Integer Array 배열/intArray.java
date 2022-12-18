class intArray
{
	public static void main(String[] args) 
	{
		Integer x[] = new Integer [8];
		// Integer x;는
		// *** Integer 객체의 배열이 아니라 ***
		// *** Integer 객체를 가리키는 레퍼렌스의 배열이다***

		x[0] = new Integer(10);   // 정상적으로 한 경우
		x[1] = new Integer(20);   // 정상적으로 한 경우
		x[2] = 30;       // new Integer 생략되었지만 컴파일러과정에서 boxing을 자동적으로 함
		x[3] = 40;       // new Integer 생략되었지만 컴파일러과정에서 boxing을 자동적으로 함
		x[4] = 50;       // new Integer 생략되었지만 컴파일러과정에서 boxing을 자동적으로 함
		x[5] = 60;       // new Integer 생략되었지만 컴파일러과정에서 boxing을 자동적으로 함
		
		x[3] = 90;
		for (int i= 0; i < 6; i++ )
			System.out.println(x[i]);

		// Integer는 이렇게 간단한 숫자를 넣었다 뺐다가 계산하는 용도가 아니라, 
		// 컬렉션객체, 제널리클레스로 만든 컬렉션객체에서 일관성이 있게 일을 처라하기위해 
		// 레퍼런스를 사용하기 때문에 정수형 변수를 heap영역에서 활당을 받아 레퍼렌스로 처리한다.
	} 
}
