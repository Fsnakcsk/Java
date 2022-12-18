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

		System.out.println("2 ���� �迭�� �� ���� �Է��� �ּ���:");
		System.out.print("�� ���� ���ΰ���? ");
		m = readInt();
		System.out.print("�� ���� ���ΰ���? ");
		n = readInt();
		System.out.println("ù��° �迭 A�� �� �����͸� �� �ּ���:");

		Matrix A = new Matrix(m,n);

		for(i = 0; i < m; i++)
			for(j = 0; j < n; j++) {
				double x;

				System.out.print("A[" + i + "][" + j + "] = ");
				x = readInt();
				A.set(i,j,x);
			}
		System.out.println("A = \n" + A);

		System.out.println("�ι�° �迭 B�� �� �����͸� �� �ּ���:");

		Matrix B = new Matrix(m,n);
		
		B.readDataFromConsole();
		System.out.println("B = \n" + B);

		Matrix X;

		X = A.add(B);
		System.out.println("A + B = \n" + X);

		// �迭�� ���� �ѹ� �غ���.
		// c[i][j] = a[i][0]*b[0][j] + a[i][1]*b[1][j] + ... + a[i][k]*b[k][j]

		System.out.println(n + "�� 3�� ¥�� �迭�� �� �����͸� �� �ּ���:");

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
