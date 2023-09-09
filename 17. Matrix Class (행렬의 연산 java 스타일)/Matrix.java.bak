class Matrix 
{
	protected double m_ptr[][];
	protected int m_row;
	protected int m_col;
	protected int m_precision;
	protected void copy(Matrix m) {
		int i,j;

		m_row = m.m_row;
		m_col = m.m_col;
		m_precision = m.m_precision; 
		m_ptr = new double[m_row][m_col];

		for(i = 0; i < m_row; i++)
			for(j = 0; j < m_col; j++) 
				m_ptr[i][j] = m.m_ptr[i][j];
	}
	protected int getMaxDataWidth() {
		return 0;
	}
	Matrix() {
		m_row = 0;
		m_col = 0;
		m_ptr = null;
		m_precision = 0; // 마치 정수형 인것처럼 출력
	}
	Matrix(int row,int col) {
		m_row = row;
		m_col = col;
		m_precision = 0;
		m_ptr = new double[row][col];
	}
	Matrix(Matrix m) {
		copy(m);
	}
	int row() {
		return m_row;
	}
	int column() {
		return m_col;
	}
	void setPrecision(int x) {
		m_precision = x;
	}
	double get(int i,int j) {
		return m_ptr[i][j];
	}
	void set(int i,int j,double v) {
		m_ptr[i][j] = v;
	}
	Matrix set(Matrix m)
	{
		copy(m);
		return this;
	}
	Matrix add(Matrix m)
	{
		if (m_row != m.m_row || m_col != m.m_col) {
			System.err.println("error occurs! - size mismatch");
			System.exit(-1);
		}

		Matrix tmp = new Matrix(m_row,m_col);

		for(int i = 0; i < m_row; i++) 
			for(int j = 0; j < m_col; j++)
				tmp.m_ptr[i][j] = m_ptr[i][j] + m.m_ptr[i][j];

		return tmp;
	}
	Matrix subtract(Matrix m)
	{
		Matrix tmp = new Matrix(m_row,m_col);

		for(int i = 0; i < m_row; i++) 
			for(int j = 0; j < m_col; j++)
				tmp.m_ptr[i][j] = m_ptr[i][j] - m.m_ptr[i][j];

		return tmp;
	}
	Matrix multiply(Matrix m)
	{
		if (m_col != m.m_row) {
			System.err.println("error occurs! - size mismatch for multplication");
			System.exit(-1);
		}

		Matrix tmp = new Matrix(m_row,m.m_col);

		for(int i = 0; i < m_row; i++) 
			for(int j = 0; j < m.m_col; j++) {
				double sum = 0;
				for(int k = 0; k < m_col; k++)
					sum = sum + m_ptr[i][k]*m.m_ptr[k][j];
				tmp.m_ptr[i][j] = sum;
			}

		return tmp;
	}
	Matrix multiply(double x)
	{
		Matrix tmp = new Matrix(m_row,m_col);

		for(int i = 0; i < m_row; i++) 
			for(int j = 0; j < m_col; j++)
				tmp.m_ptr[i][j] = m_ptr[i][j] * x;

		return tmp;
	}
	void readDataFromConsole()
	{
		int row = m_row;
		int col = m_col;
		double p[][] = m_ptr;
		int i,j;

		for(i = 0; i < row; i++)
			for(j = 0; j < col; j++) {
				double x;
				System.out.print("data[" + i + "][" + j + "] = ");
				x = Double.parseDouble(System.console().readLine());
				p[i][j] = x;
			}
	}
	public String toString() {
		String tmp = "";
		int row = m_row;
		int col = m_col;
		double p[][] = m_ptr;
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				tmp = tmp + p[i][j] + " ";
			}
			tmp = tmp + "\n";
		}
		return tmp;
	}
}
/*
int Matrix::getMaxDataWidth()
{
	double max = 0;

	for(int i = 0; i < m_row; i++) 
		for(int j = 0; j < m_col; j++)
			if (m_ptr[i][j] > max) max = m_ptr[i][j];

	int nDigit = 1;
	int intMax = (int)max;

	while (intMax > 0) {
		intMax = intMax / 10;
		nDigit++;
		if (intMax == 0) break;
	}
	return nDigit;
}

ostream& operator<<(ostream& outs,Matrix &m)
{
	int row = m.m_row;
	int col = m.m_col;
	double **p = m.m_ptr;
	int i,j,k;
	
	int precision = m.m_precision;
	char format1[BUFSIZ];
	char format2[BUFSIZ];

	int dataWidth = m.getMaxDataWidth();
	if (precision > 0) dataWidth = dataWidth + precision + 1;
	sprintf(format1,"%%%d.%df",dataWidth,precision);
	sprintf(format2,"%%%d.%df",dataWidth+1,precision);

	cout << "+-";
	for(k = 0; k < (dataWidth+1)*col-1; k++) cout << " ";
	cout << "-+" << endl;
	for(i = 0; i < row; i++) {
		cout << "| ";
		for(j = 0; j < col; j++) {
			if (j == 0) {
				printf(format1,p[i][j]);
			} else {
				printf(format2,p[i][j]);
			}
		}
		cout << " |";
		cout << endl;
	}
	cout << "+-";
	for(k = 0; k < (dataWidth+1)*col-1; k++) cout << " ";
	cout << "-+" << endl;
	return outs;
}

*/