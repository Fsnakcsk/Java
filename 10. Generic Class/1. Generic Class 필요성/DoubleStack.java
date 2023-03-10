class DoubleStack 
{
	// Attributes
	static int MAX = 100;
	private double _s[];
	private int _top;
	private int _size;
	private void initialize() {
		for(int i = 0; i < _size; i++) {
			_s[i] = 0.0; //0.0로 굳이 하지 않아도 큰 문제가 안된다.
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
	public DoubleStack() {
		this(MAX);
	}
	public DoubleStack(int n) {
		if (n > MAX) {
			System.err.println("Stack size must be less than " + MAX + ".");
			System.exit(-1);
		}
		_s = new double[MAX];
		_size = n;
		_top = -1;
		initialize();
	}
	public void push(double item) {
		if (_top >= _size-1) overflowError();
		_top++;
		_s[_top] = item;
	}
	public double pop() {
		if (_top == -1) emptyError();
		double value = _s[_top];
		_top--;
		return(value);
	}
	public double peek() {
		if (_top == -1) emptyError();
		return(_s[_top]);
	}
	public void reset() {
		_top = -1;
		initialize();
	}
}
