class MatrixWithNames extends Matrix 
{
	private StringArray rowNames;
	private StringArray colNames;
	private String unitName;
	private String question;
	MatrixWithNames() {
		super();
		unitName = "";
		question = "";
		rowNames = null;
		colNames = null;
	}
	MatrixWithNames(int row,int col) {
		super(row,col);
		unitName = "";
		question = "";
		rowNames = null;
		colNames = null;
	}
	MatrixWithNames(int row,int col,StringArray rNames,StringArray cNames,String uName,String q) {
		super(row,col);
		unitName = uName;
		question = q;
		rowNames = new StringArray(rNames);
		colNames = new StringArray(cNames);
	}
	MatrixWithNames(Matrix m,StringArray rNames,StringArray cNames,String uName,String q) {
		super(m);
		unitName = uName;
		question = q;
		rowNames = new StringArray(rNames);
		colNames = new StringArray(cNames);
	}
	void setRowNames(StringArray names) {
		rowNames = new StringArray(names);
	}
	void setColumnNames(StringArray names) {
		colNames = new StringArray(names);
	}
	void setUnitName(String name) {
		unitName = name;
	}
	void setQuestion(String name) {
		question = name;
	}
	void readDataFromConsole()
	{
		int row = m_row;
		int col = m_col;
		double p[][] = m_ptr;
		int i,j;

		for(i = 0; i < row; i++) {
			System.out.println(rowNames.get(i) + "ÀÇ");
			for(j = 0; j < col; j++) {
				System.out.print("   " + colNames.get(j) + question + "? ");
				p[i][j] = Double.parseDouble(System.console().readLine());
			}
		}
	}
	public String toString() {
		String tmp = "";
		int row = m_row;
		int col = m_col;
		double p[][] = m_ptr;
		for(int i = 0; i < row; i++) {
			tmp = tmp + rowNames.get(i) + " ";
			for(int j = 0; j < col; j++) {
				tmp = tmp + p[i][j] + " ";
			}
			tmp = tmp + "\n";
		}
		return tmp;
	}
}
/*
ostream& operator<<(ostream& outs,MatrixWithNames &m)
{
	int row = m.m_row;
	int col = m.m_col;
	double **p = m.m_ptr;
	int i,j;
	int precision = m.m_precision;

	char format1[BUFSIZ];
	char format2[BUFSIZ];
	char format3[BUFSIZ];

	int firstColWidth = m.rowNames->getMaxStringLength();

	sprintf(format2,"%%%ds: ",firstColWidth);
	for(j = 0; j < firstColWidth+2; j++) System.out.println(" ";

	int dataWidth1 = m.getMaxDataWidth();
	int dataWidth2 = m.getMaxDataWidth() + m.unitName.getLength();

	if (precision > 0) {
		dataWidth1 = dataWidth1 + precision + 1;
		dataWidth2 = dataWidth2 + precision + 1;
	}

	sprintf(format1,"%%%ds ",dataWidth2);
	sprintf(format3,"%%%d.%df%%s ",dataWidth1,precision);

	for(j = 0; j < col; j++) {
		char aName[BUFSIZ];

		strcpy(aName,m.colNames->get(j).getBufptr());
		aName[dataWidth2] = '\0';
		printf(format1,aName);
	}
	System.out.println(endl;
	for(i = 0; i < row; i++) {
		printf(format2,m.rowNames->get(i));
		for(j = 0; j < col; j++) {
			printf(format3,p[i][j],m.unitName);
		}
		System.out.println(endl;
	}
	return outs;
}
*/
