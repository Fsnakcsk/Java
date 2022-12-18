class intArray
{
	public static void main(String[] args) 
	{
		int x[] = new int [8];

		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		x[3] = 40;
		x[4] = 50;
		x[5] = 60;
		
		x[3] = 90;
		for (int i= 0; i < 6; i++ )
			System.out.println(x[i]);
	}
}
