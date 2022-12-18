class Stack
{
	static int MAX = 100;
	private int _s[];
	private int _top;
	private int _size;

	Stack() {
		this(MAX);
	}
	Stack(int n) {
		if (n > 100) {
			System.err.println("Stack size must be less than " + MAX + ".");
			System.exit(-1);
		}

		_s = new int[n];
		_top = -1;
		_size = n;

		initialize();
	}

	private void initialize() {
		for (int i = 0; i < _size ; i++ ) {
			_s[i] = 0;
		}
	}

	private void voerflowError() {
		System.err.println("Stack voerflow error");
		System.exit(-1);
	}

	private void emptyError() {
		System.err.println("Stack empty error");
		System.exit(-1);
	}

	void push(int item) {
		if ( _top == _size-1) voerflowError();
		_top++;
		_s[_top] = item;
	}
	
	int pop() {
		if ( _top == -1 ) emptyError();

		int item;
		int value = _s[_top];
		_top--;

		return value;
	}

	int peek() {
		if (_top == -1) emptyError();
		return _s[_top];
	}

	void reset() {
		_top = -1;
		initialize();
	}

	boolean isEmpty() {
		if ( _top == -1 ) return true;
		else return false;
	}
}
