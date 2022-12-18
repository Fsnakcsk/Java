class Stack 
{
	static int MAX = 2;
	// Attributes
	/** a pointer to an array for stack contents 
	 */
	private int _s[];
	/** the pointer to point top of stack
	 */
	private int _top;
	/** size of the stack
	 */
	private int _size;
// Operations
	/** initialization procedure for new stack
	 */
	private void initialize() {
		for(int i = 0; i < _size; i++) {
			_s[i] = 0;
		}
	}
	/** this function is called for stack empty exception
	 */
	private void emptyError() {
		System.err.println("Stack empty error occurs.");
		System.exit(-1);
	}
	/** the default constructor for stack object
	 */
	Stack() {
		this(MAX);
	}
	/** the constructor for stack object
	 */
	Stack(int n) {
		_s = new int[n];
		_size = n;
		_top = -1;
		initialize();
	}
	/**	the function to insert new item on stack
	 */
	void push(int item) {
		if (_top >= _size-1) {
			int newS[];
			newS = new int[2*_size];
			for(int i = 0; i < _size; i++) {
				newS[i] = _s[i];
			}
			_s = newS;
			_size = 2*_size;
		}
		_top++;
		_s[_top] = item;
	}
	/** the function to delete an item at the top position of the stack
	 */
	int pop() {
		if (_top == -1) emptyError();
		int value = _s[_top];
		_top--;
		return(value);
	}
	/** the function to get the top element of the stack
	 */
	int peek() {
		if (_top == -1) emptyError();
		return(_s[_top]);
	}
	/** the fuction to clear an exisiting stack
	 */
	void reset() {
		_top = -1;
		initialize();
	}
	/** the funtion to check if the stack is empty
	 */
	boolean isEmpty() {
		if (_top == -1) return true;
		else return false;
	}
}
