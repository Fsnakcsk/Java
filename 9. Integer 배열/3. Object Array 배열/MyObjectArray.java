class MyObjectArray
{
	public static void main(String[] args) 
	{
		Object x[] = new Object [8];
//		Object x; Object 객체를 가리키는 레퍼런스의 배열
//      Object는 아무거나 넣을 수 있다.

//      Polymorphic container 이질적인 내용들을 넣은 것(일괄성이 없다)
		x[0] = 10;
		x[1] = new Integer(20);
		x[2] = 34.5;
		x[3] = new Double(40);
		x[4] = "Kim";
		x[5] = new String("Lee");
		
		x[4] = 90; // read only 절대 바꿀 수 없다, 그래서 가리키는 그 곳을 버리고 새로운 것을 생성해 가리킨다.

		for (int i= 0; i < 6; i++ )
			System.out.println(x[i]);
	} 
}
