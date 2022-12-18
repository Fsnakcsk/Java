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
//		_s = new Type[MAX];              Instantiation할 때 Type라는 Type가 존재하지 않기 때문에 사용할 수 없음으로 Type casting 해야함
		_s = (Type[])new Object[n]; // 그래서 Type[n] Object를 카리키는 레퍼렌스의 배열을 만들어 주고 Type Casting 해야함.
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
