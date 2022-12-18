class TestComplexNumber 
{
	public static void main(String[] args) 
	{
		ComplexNumber a = new ComplexNumber(1.2,1.5);
		ComplexNumber b = new ComplexNumber(2.1,3.2);
		ComplexNumber c;

		c = a.add(b);

		System.out.println(c.real() + "," + c.imaginary());
		System.out.println(c.magnitude());
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		c = a.add(b);
		System.out.println("a+b = " + c);

		c = a.subtract(b);
		System.out.println("a-b = " + c);

		c = a.multiply(b);
		System.out.println("a*b = " + c);
	}
}
