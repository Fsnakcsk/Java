class Stack<Type>
{
	static int MAX = 100;
	private Type _s[];
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
		System.err.println("Stack empty  error occurs.");
		System.exit(-1);
	}
	public Stack() {
		this(MAX);
	}
	public Stack(int n) {
		if (n > MAX) {
			System.err.println("Stack size must be less than " + MAX + ".");
			System.exit(-1);
		}
//		_s = new Type[MAX];              Instantiation�� �� Type��� Type�� �������� �ʱ� ������ ����� �� �������� Type casting �ؾ���
		_s = (Type[])new Object[n]; // �׷��� Type[n] Object�� ī��Ű�� ���۷����� �迭�� ����� �ְ� Type Casting �ؾ���.
		_size = n;
		_top = -1;
		initialize();
	}
	public void push(Type item) {
		if (_top >= _size-1) overflowError();
		_top++;
		_s[_top] = item;
	}
	public Type pop() {
		if (_top == -1) emptyError();
		Type value = _s[_top];
		_top--;
		return(value);
	}
	public Type peek() {
		if (_top == -1) emptyError();
		return(_s[_top]);
	}
	public void reset() {
		_top = -1;
		initialize();
	}
	public String toString() {
		String s = "[";
		for (int i = 0; i < _top; i++ )
		{
			s = s + _s[i] + ",";
		}
		s = s + _s[_top] + "]";
		return s;
	}
	
}
