class TestStack 
{
	public static void main(String[] args) 
	{
//-----------------------------------------------------------------------------
// IntStack
		IntStack a = new IntStack();
		IntStack b = new IntStack();

		a.push(10);
		a.push(20);
		a.pop();
		a.push(30);
		a.push(40);

		b.push(100);
		b.push(200);
		b.push(300);
		b.push(400);
		b.pop();

		System.out.println("top of stack a = " + a.peek());
		System.out.println("top of stack b = " + b.peek());

//-----------------------------------------------------------------------------
//DoubleStack
		DoubleStack c = new DoubleStack();

		c.push(34.56);
		c.push(23.87);
		c.push(93.21);
		c.push(88.35);

		Double x = c.pop();
		x = c.pop();

		System.out.println("top of stack b = " + c.peek());
//-----------------------------------------------------------------------------
//StringStack
		StringStack d = new StringStack();
		
		d.push("kim");
		d.push("lee");
		d.push("park");
		d.pop();

		System.out.println("top of stack b = " + d.peek());
	}
}
