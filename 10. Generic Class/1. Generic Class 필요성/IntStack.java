class IntStack 
{
	// Attributes
	static int MAX = 100;
	/** an array to save stack contents 
	 */
	private int _s[];
	/** the index to point top of stack
	 */
	private int _top;
	/** size of the stack
	 */
	private int _size;
	// Operations
	/** initialization procedure for new stack
	 */
	private void initialize() {
		// NOTE: We don't have to do this initialization with Java
		for(int i = 0; i < _size; i++) {
			_s[i] = 0;
		}
	}
	/** this function is called for stack overflow exception
	 */
	private void overflowError() {
		System.err.println("Stack overflow error occurs.");
		System.exit(-1);
	}
	/** this function is called for stack empty exception
	 */
	private void emptyError() {
		System.err.println("Stack empty error occurs.");
		System.exit(-1);
	}
	/** the constructor for stack object
	 */
	public IntStack() {
		this(MAX);
	}
	/** the constructor for stack object
	 */
	public IntStack(int n) {
		if (n > MAX) {
			System.err.println("Stack size must be less than " + MAX + ".");
			System.exit(-1);
		}
		_s = new int[MAX];
		_size = n;
		_top = -1;
		initialize();
	}
	/**	the function to insert new item on stack
	 */
	public void push(int item) {
		if (_top >= _size-1) overflowError();
		_top++;
		_s[_top] = item;
	}
	/** the function to delete an item at the top position of the stack
	 */
	public int pop() {
		if (_top == -1) emptyError();
		int value = _s[_top];
		_top--;
		return(value);
	}
	/** the function to get the top element of the stack
	 */
	public int peek() {
		if (_top == -1) emptyError();
		return(_s[_top]);
	}
	/** the fuction to clear an exisiting stack
	 */
	public void reset() {
		_top = -1;
		initialize();
	}
}
