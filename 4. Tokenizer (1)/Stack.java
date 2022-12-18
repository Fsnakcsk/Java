//Purpose of Stack class:
/**
	This class implements LIFO list for integer values.
*/

class Stack 
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
	/** the default constructor for stack object
	 */
	Stack() {
		this(MAX);
	}
	/** the constructor for stack object
	 */
	Stack(int n) {
		if (n > MAX) {
			System.err.println("Stack size must be less than " + MAX + ".");
			System.exit(-1);
		}
		_s = new int[n];
		_size = n;
		_top = -1;
		initialize();
	}
	/**	the function to insert new item on stack
	 */
	void push(int item) {
		if (_top >= _size-1) overflowError();
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
