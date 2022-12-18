class TestString 
{
	public static void main(String[] args) 
	{
		String a;    // String 객체를 가리키는 reference
		String b;

		a = "hello"; // boxing --> a = new String("hello");
		b = "kim";
		b = "kam";


		System.out.println(a);
		System.out.println(b);
		System.out.println(a.value.length); // data manber
		System.out.println(b.length());     // manber function
	}
}
