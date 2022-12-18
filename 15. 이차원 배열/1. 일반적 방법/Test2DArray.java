class Test2DArray
{
	public static void main(String[] args) 
	{
		//  x[][]는 point의 array라고 함.
		int x[][] = new int[3][4];
		int i,j,k;

		k = 1;
		for (i = 0; i < x.length; i++)
			for (j = 0; j < x[i].length; j++)
				x[i][j] = k++;

//--------------------------------
		System.out.println("Java");
	
		for (i = 0; i < x.length; i++) {
			for (j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
//---------------------------------------------------------------
// 이후의 버전에서 printf(,) 출시돼 C언어 처럼 사용할 수 있다.
		System.out.println();
		System.out.println("C언어 처럼 사용.\nprintf(%3d,x[i][j]);");


		for (i = 0; i < x.length; i++) {
			for (j = 0; j < x[i].length; j++) {
				System.out.printf("%3d",x[i][j]);
			}
			System.out.println();
		}
	}
}
