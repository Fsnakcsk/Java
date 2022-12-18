class asdfasdf 
{
	public static void main(String[] args) 
	{
		double x;
		int i;
			
		x = Math.random();     // 0~1
		System.out.println(x);

		x = Math.random() * 10; 
		System.out.println(x); // 0~10

		x = Math.random() * 20; 
		System.out.println(x); // 0~20

		x = Math.random() * 100; 
		System.out.println(x); // 0~100		

		x = Math.random() * 1000; 
		System.out.println(x); // 0~1000

		i = (int)(Math.random() * 9); // 0~10
		System.out.println(i);
	}
}
