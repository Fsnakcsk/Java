class TestComplexNumber 
{
	public static void main(String[] args) 
	{
		ComplexNumber a = new ComplexNumber(1.2,1.5);
		ComplexNumber b = new ComplexNumber(2.1,3.2);
		ComplexNumber c; // ---> c = null;

		c = ComplexNumber.add(a,b);

		System.out.println(c.real() + "," + c.imaginary());
		System.out.println(c.magnitude());
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		System.out.println("a+b = " + c);

		c = ComplexNumber.subtract(a,b);
		System.out.println("a-b = " + c);

		c = ComplexNumber.multiply(a,b);
		System.out.println("a*b = " + c);
	}
}
