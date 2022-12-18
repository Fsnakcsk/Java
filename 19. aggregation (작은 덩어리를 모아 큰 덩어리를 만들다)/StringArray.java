class StringArray 
{
	private String pArray[];
	private int nArray;
	StringArray() {
		nArray = 0;
		pArray = null;
	}
	StringArray(int n) {
		nArray = n;
		pArray = new String[n];
	}
	StringArray(StringArray sa) {
		nArray = sa.nArray;
		pArray = new String[nArray];
		for(int i = 0; i < nArray; i++) {
			pArray[i] = new String(sa.pArray[i]);
		}
	}
	int size() {
		return nArray;
	}
	String get(int i) {
		return pArray[i];
	}
	void set(int i,String s) {
		pArray[i] = new String(s);
	}
	/*
	int getMaxStringLength() {
		int maxLength = 0;

		for(int i = 0; i < nArray; i++) {
			if (pArray[i].length() > maxLength)
				maxLength = pArray[i].length();
		}
		return maxLength;
	}
	*/
	void readDataFromConsole()
	{
		String buffer;

		for(int i = 0; i < nArray; i++) {
			System.out.print((i+1) + "번째 이름은: ");
			buffer = System.console().readLine();
			pArray[i] = buffer;
		}
	}
	public String toString()
	{
		String tmp = "";
		for(int i = 0; i < nArray; i++) {
			tmp = tmp + pArray[i] + "\n";
		}
		return tmp;
	}
}


