class Test2DArray
{//                          int x[][]더 자연스럽지만 int[][] x는 더 정확한 표현이다.
	public static int getSum(int[][] x) {
		int sum = 0;;
		for (int i = 0; i < x.length; i++)
			for (int j = 0; j < x[i].length; j++)
				sum = sum + x[i][j];

		return sum;
	}
	public static void main(String[] args) 
	{
		//  x[][]는 point의 array라고 함.
		int x[][];
		int i,j,k;
		
		x = new int[3][];
		x[0] = new int[4];
		x[1] = new int[6];
		x[2] = new int[2];


		k = 1;
		for (i = 0; i < x.length; i++)
			for (j = 0; j < x[i].length; j++)
				x[i][j] = k++;


		for (i = 0; i < x.length; i++) {
			for (j = 0; j < x[i].length; j++) {
				System.out.printf("%3d",x[i][j]);
			}
			System.out.println();
		}
		System.out.println("sum = " + getSum(x));
	}
}
