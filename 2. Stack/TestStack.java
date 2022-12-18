class Stack
{	
	static int MAX = 100;
	int _s[];
	int _top;
	int _size;
	// default constructor
	Stack()
	{	
		this(MAX);
	}
	Stack(int n)
	{
		_top = -1;
		_size = n;
		_s = new int[n];
	}
	// 1. specifiaction을 확정해야 함.
	//    - 캄파일 가능
	//    - 사용법을 정의 (시그니처)
	// 2. implementation을 수행해야 함.

	void push(int item) {
		_top++;
		_s[_top] = item;
	}
	int pop() {
		_top--;
		return _s[_top + 1];
	}
	int peek() {
		return _s[_top];
	}
	int size() {
		return _top + 1;
	}
	void reset() {
		_top = -1;
	}
	boolean empty() {
		if (_top == -1) return true;
		return false;
		
	}
}
class TestStack
{
	public static void main(String[] args) 
	{
//		Stack a;
//		a = new Stack();

		Stack a = new Stack();
		Stack b = new Stack(5);
		
		a.push(10);
		a.push(20);

		int x = a.pop();
		a.push(30);
		a.push(40);

		b.push(100);
		b.push(200);
		b.push(300);
		b.push(400);
		int y = b.pop();
		
		System.out.println("x = " + x); // 20
		System.out.println("y = " + y); // 400

		System.out.println("top of stack a = " + a.peek()); // 40
		System.out.println("top of stack b = " + b.peek()); // 300

		System.out.println("size of a = " + a.size()); // 3
		a.reset();
		System.out.println("size of a = " + a.size()); // 0

	}
}