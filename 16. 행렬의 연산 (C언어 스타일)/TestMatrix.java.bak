class TestMatrix
{
	static int[][] add(int a[][], int b[][]) 
	{
		int row = a.length;
		int col = a[0].length;
		int c[][] = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
	static int[][] subtract(int a[][], int b[][]) 
	{
		int row = a.length;
		int col = a[0].length;
		int c[][] = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				c[i][j] = a[i][j] - b[i][j]; 
			} 
		}
		return c;
	}
	static int[][] multiply(int a[][], int b[][]) 
	{  
	  // 3x4 4x2 = 3x2
	  // m_n n_l = m_l

		int i,j,k;
		int m = a.length;
		int n = a[0].length;
		int l = b[0].length;
		int c[][] = new int[m][l];

		for (i = 0; i < m; i++) {
			for (j = 0; j < l; j++) {
				c[i][j] = 0;
				for (k = 0; k < n; k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		return c;
	}
	static void print(int a[][]) 
	{
		int i,j;

		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				System.out.printf("%4d",a[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	} 
	public static void main(String[] args) 
	{
		int x[][] = { {1,  2,  3,  4},
					  {5,  6,  7,  8},
				   	  {9, 10, 11, 12} };

		int y[][] = { {1,  2,  3,  4},
					  {5,  6,  7,  8},
				   	  {9, 10, 11, 12} };		
		
		int z[][];
		

		z = add(x,y);      // ÇÕ
		print(x);
		print(y);
		print(z);

		z = subtract(x,y); // Â÷
		print(z);
		

		int t[][] = { {1, 2},
					  {1, 1},
					  {2, 2},
					  {2, 1} };
	
		z = multiply(x,t); // °ö
		print(z);

	}// 16+6+14+8 
}
