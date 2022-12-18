class LineBuffer 
{
	static int ID_QUIT = 1;
	static int ID_PLUS = 2;
	static int ID_MINUS = 3;
	static int ID_MULTIPLY = 4;
	static int ID_DIVIDE = 5;
	static int ID_EOD = 6;
	static int ID_OPERAND = 7;

	static int BUFSIZ = 256;

	private int _position;
	private char _text[];
	private int _tokenValue;
	LineBuffer(String text) {
		_text = new char[BUFSIZ];

		// copy string to char array like strcpy() in C language
		for(int i = 0; i < text.length(); i++) {
			_text[i] = text.charAt(i);
		}
		_text[text.length()] = '\0';

		_position = 0;
		_tokenValue = 0;
	}
	int getTokenValue() {
		return _tokenValue;
	}
	int getNextToken() {
		// skip blanks
		while (_text[_position] == ' ') _position++;

		if (_text[_position] == '\0') return ID_EOD;
		if (_text[_position] == '+') {
			_position++;
			return ID_PLUS;
		}
		if (_text[_position] == '*') {
			_position++;
			return ID_MULTIPLY;
		}
		if (_text[_position] == '/') {
			_position++;
			return ID_DIVIDE;
		}
		if ((_text[_position] == '-' && _text[_position+1] == ' ') ||
			(_text[_position] == '-' && _text[_position+1] == '\0'))
		{
			_position++;
			return ID_MINUS;
		}

		String buffer = "";
		int i = 0;

		if (_text[_position] == '-') {
			buffer = buffer + "-";
			i++;
			_position++;
		}
		while(_text[_position] >= '0' && _text[_position] <= '9') {
			buffer = buffer + _text[_position];
			i++;
			_position++;
		}

		_tokenValue = Integer.parseInt(buffer);

		if (_text[_position] != ' ' && _text[_position] != '\0')
			return ID_QUIT;

		return ID_OPERAND;
	}
}
