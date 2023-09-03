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
			System.out.println((i+1) + "��° ����� ...");
			System.out.print("   ������ ��� �ȾҴ°�? ");
			p[i][0] = Double.parseDouble(System.console().readLine());
			System.out.print("   �������� ��� �ȾҴ°�? ");
			p[i][1] = Double.parseDouble(System.console().readLine());
			System.out.print("   ��ǳ��� ��� �ȾҴ°�? ");
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

		tmp = tmp + "          ����� ������ ��ǳ��\n";
		for(i = 0; i < row; i++) {
			tmp = tmp + (i+1) + "�� ���";
			tmp = tmp + "    " + (int)p[i][0] + "��";
			tmp = tmp + "    " + (int)p[i][1] + "��";
			tmp = tmp + "    " + (int)p[i][2] + "��";
			tmp = tmp + "\n";
		}
		tmp = tmp + "\n";
		return tmp;
	}
}
 
