class Test2DArray
{
	public static void main(String[] args) 
	{
		//  x[][]�� point�� array��� ��.
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
// ������ �������� printf(,) ��õ� C��� ó�� ����� �� �ִ�.
		System.out.println();
		System.out.println("C��� ó�� ���.\nprintf(%3d,x[i][j]);");


		for (i = 0; i < x.length; i++) {
			for (j = 0; j < x[i].length; j++) {
				System.out.printf("%3d",x[i][j]);
			}
			System.out.println();
		}
	}
}
