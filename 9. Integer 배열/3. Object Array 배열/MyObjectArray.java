class MyObjectArray
{
	public static void main(String[] args) 
	{
		Object x[] = new Object [8];
//		Object x; Object ��ü�� ����Ű�� ���۷����� �迭
//      Object�� �ƹ��ų� ���� �� �ִ�.

//      Polymorphic container �������� ������� ���� ��(�ϰ����� ����)
		x[0] = 10;
		x[1] = new Integer(20);
		x[2] = 34.5;
		x[3] = new Double(40);
		x[4] = "Kim";
		x[5] = new String("Lee");
		
		x[4] = 90; // read only ���� �ٲ� �� ����, �׷��� ����Ű�� �� ���� ������ ���ο� ���� ������ ����Ų��.

		for (int i= 0; i < 6; i++ )
			System.out.println(x[i]);
	} 
}
