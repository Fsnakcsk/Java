class IntStack 
{
	static int MAX = 100;
// Attributes
	private int s[];
	private int top;
	private int arraySize;
// Operations
	private void emptyError() {
		System.err.println("IntStack empty error occurs.");
		System.exit(-1);
	}
	IntStack() {
		this(MAX);
	}
	IntStack(int n) {
		s = new int[n];
		arraySize = n;
		top = -1;
	}
	void push(int item) {
		if (top >= (arraySize-1)) {
			int newS[];
			newS = new int[2*arraySize];
			for(int i = 0; i < arraySize; i++) {
				newS[i] = s[i];
			}
			s = newS;
			arraySize = 2*arraySize;
		}
		top++;
		s[top] = item;
	}
	int pop() {
		if (top == -1) emptyError();
		int value = s[top];
		top--;
		return(value);
	}
	int peek() {
		if (top == -1) emptyError();
		return s[top];
	}
	void reset() {
		top = -1;
	}
	boolean isEmpty() {
		if (top == -1) return true;
		else return false;
	}
	int size() {
		if (top == -1) return 0;
		else return top+1;
	}
	int getAt(int i) {
		return s[i];
	}
}

