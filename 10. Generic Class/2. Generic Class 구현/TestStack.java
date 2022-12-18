class TestStack 
{
	public static void main(String[] args) 
	{
		Stack<Integer> a = new Stack<Integer>();
		Stack<Integer> b = new Stack<Integer>();

		a.push(10); // a.push(10)의 10분 정수형인데 컴파일라 하는 과정에서 boxing하게됨 시실상 a.push(new Integer(10));으로 해석함.
		a.push(new Integer(20));
		a.push(new Integer(30));
		a.push(40);
		a.pop();

		b.push(100);
		b.push(200);
		b.push(300);
		b.push(400);
		b.pop();

//-----------------------------------------------------------------------------------------
		Stack<Double> c = new Stack<Double>();
		
		c.push(34.76);
		c.push(46.23);
		c.push(92.19);
		c.push(88.32);
		c.pop();
		c.pop();

//-----------------------------------------------------------------------------------------
		Stack<String> d = new Stack<String>();

		d.push("kim");
		d.push("lee");
		d.push("park");
		d.pop();
//-----------------------------------------------------------------------------------------
		
		System.out.println("top of stack a = " + a.peek());
		System.out.println("top of stack b = " + b.peek());
		System.out.println("top of stack b = " + c.peek());
		System.out.println("top of stack b = " + d.peek());
		System.out.println(d);

	}
}
