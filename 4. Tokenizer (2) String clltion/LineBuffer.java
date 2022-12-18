class LineBuffer 
{
	static int ID_QUIT = 1;
	static int ID_PLUS = 2;
	static int ID_MINUS = 3;
	static int ID_MULTIPLY = 4;
	static int ID_DIVIDE = 5;
	static int ID_EOD = 6;
	static int ID_OPERAND = 7;

	private String[] _tokens;
	private int _index;
	private int _tokenValue;

	LineBuffer(String text) 
	{
		_tokens = text.split(" ");  // String - split(String delimeter);
		_index = -1;
		_tokenValue = 0;
	}

	int getTokenValue()
	{
		return _tokenValue;
	}

	int getNextToken()
	{
		_index++;

		if (_index == _tokens.length) return ID_EOD;

		if (_tokens[_index].equals("+")) return ID_PLUS;
		if (_tokens[_index].equals("*")) return ID_MULTIPLY;
		if (_tokens[_index].equals("/")) return ID_DIVIDE;
		if (_tokens[_index].equals("-")) return ID_MINUS;

		_tokenValue = Integer.parseInt(_tokens[_index]);

		return ID_OPERAND;

	}
}