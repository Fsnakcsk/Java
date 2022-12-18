import java.util.*;

class LineBuffer 
{
	static int ID_QUIT = 1;
	static int ID_PLUS = 2;
	static int ID_MINUS = 3;
	static int ID_MULTIPLY = 4;
	static int ID_DIVIDE = 5;
	static int ID_EOD = 6;
	static int ID_OPERAND = 7;

	private StringTokenizer _st;
	private int _tokenValue;
	LineBuffer(String text) 
	{
		_st = new StringTokenizer(text);
		_tokenValue = 0;
	}

	int getTokenValue() 
	{
		return _tokenValue;
	}

	int getNextToken() 
	{
		if (_st.hasMoreTokens() == false) return ID_EOD;

		String token = _st.nextToken();

		if(token.equals("+")) return ID_PLUS;
		if(token.equals("*")) return ID_MULTIPLY;
		if(token.equals("/")) return ID_DIVIDE;
		if(token.equals("-")) return ID_MINUS;

		_tokenValue = Integer.parseInt(token);
		return ID_OPERAND;
	}
}