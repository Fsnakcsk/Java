class Fibo
{
	static int f(int n) {
		if (n == 0) return 1;
		else if (n == 1) return 1;
		else if (n > 0) return f(n-1) + f(n-2);
		else {
			System.err.println("Inexpected minus argument.");
			System.exit(-1);
			return -1;
		}
	}

	public static void main(String[] args) 
	{
		for(int i=0; i<10; i++) {
			System.out.println("f(" + i + ") = " + f(i));
		}
	}
}
