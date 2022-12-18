class TestMatrix 
{
	static int readInt() {
		String s = System.console().readLine();
		return Integer.parseInt(s);
	}
	public static void main(String[] args) 
	{
		int m,n;
		int i,j;

		System.out.println("2 차원 배열을 두 개를 입력해 주세용:");
		System.out.print("행 값은 얼마인가용? ");
		m = readInt();
		System.out.print("열 값은 얼마인가용? ");
		n = readInt();
		System.out.println("첫번째 배열 A에 들어갈 데이터를 쳐 주세용:");

		Matrix A = new Matrix(m,n);

		for(i = 0; i < m; i++)
			for(j = 0; j < n; j++) {
				double x;

				System.out.print("A[" + i + "][" + j + "] = ");
				x = readInt();
				A.set(i,j,x);
			}
		System.out.println("A = \n" + A);

		System.out.println("두번째 배열 B에 들어갈 데이터를 쳐 주세용:");

		Matrix B = new Matrix(m,n);
		
		B.readDataFromConsole();
		System.out.println("B = \n" + B);

		Matrix X;

		X = A.add(B);
		System.out.println("A + B = \n" + X);

		// 배열의 곱도 한번 해보자.
		// c[i][j] = a[i][0]*b[0][j] + a[i][1]*b[1][j] + ... + a[i][k]*b[k][j]

		System.out.println(n + "행 3열 짜리 배열에 들어갈 데이터를 쳐 주세용:");

		Matrix C = new Matrix(n,3);

		C.readDataFromConsole();
		System.out.println("C = \n" + C);

		Matrix Y;

		Y = B.multiply(C);
		System.out.println("B * C = \n" + Y);

		Y = B.multiply(10);
		System.out.println("B * 10 = \n" + Y);
	}
}
