class ProductMatrix extends Matrix
{
	ProductMatrix() {
		super();
	}
	ProductMatrix(int row,int col) {
		super(row,col);
	}
	void readDataFromConsole()
	{
		int row = m_row;
		int col = m_col;
		double p[][] = m_ptr;
		int i;

		for(i = 0; i < row; i++) {
			System.out.println((i+1) + "번째 사원이 ...");
			System.out.print("   냉장고는 몇대 팔았는고? ");
			p[i][0] = Double.parseDouble(System.console().readLine());
			System.out.print("   에어콘은 몇대 팔았는고? ");
			p[i][1] = Double.parseDouble(System.console().readLine());
			System.out.print("   선풍기는 몇대 팔았는고? ");
			p[i][2] = Double.parseDouble(System.console().readLine()); 
		}
	}	 
	public String toString()
	{
		String tmp = "";
		int row = m_row;
		int col = m_col;
		double p[][] = m_ptr;
		int i;

		tmp = tmp + "          냉장고 에어콘 선풍기\n";
		for(i = 0; i < row; i++) {
			tmp = tmp + (i+1) + "번 사원";
			tmp = tmp + "    " + (int)p[i][0] + "대";
			tmp = tmp + "    " + (int)p[i][1] + "대";
			tmp = tmp + "    " + (int)p[i][2] + "대";
			tmp = tmp + "\n";
		}
		tmp = tmp + "\n";
		return tmp;
	}
}
 
