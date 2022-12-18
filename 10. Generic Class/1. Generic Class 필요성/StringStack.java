class StringStack 
{
	static int MAX = 100;
	private String _s[];
	private int _top;
	private int _size;
	private void initialize() {
		for(int i = 0; i < _size; i++) {
			_s[i] = null;
		}
	}
	private void overflowError() {
		System.err.println("Stack overflow error occurs.");
		System.exit(-1);
	}
	private void emptyError() {
		System.err.println("Stack empty error occurs.");
		System.exit(-1);
	}
	public StringStack() {
		this(MAX);
	}
	public StringStack(int n) {
		if (n > MAX) {
			System.err.println("Stack size must be less than " + MAX + ".");
			System.exit(-1);
		}
		_s = new String[MAX];
		_size = n;
		_top = -1;
		initialize();
	}
	public void push(String item) {
		if (_top >= _size-1) overflowError();
		_top++;
		_s[_top] = item;
	}
	public String pop() {
		if (_top == -1) emptyError();
		String value = _s[_top];
		_top--;
		return(value);
	}
	public String peek() {
		if (_top == -1) emptyError();
		return(_s[_top]);
	}
	public void reset() {
		_top = -1;
		initialize();
	}
}
