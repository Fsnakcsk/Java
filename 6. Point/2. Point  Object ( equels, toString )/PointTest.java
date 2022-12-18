class Point // [extend Object] 쓰지 않아도 사용하하면 컴파일러 하고 있다. 단지 생략
{
	private int x;               // private int _x;
	private int y;               // private int _y;
	public Point(int x, int y) {
		this.x = x;              // _x = x;
		this.y = y;              // _y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	// override [extend Object]
	// Object의 상속을 받았다.
	public boolean equals(Object obj) {
		// for말마라케타가 Object로 들어오기 때문에 Point로 바꾸고 나서 비교해야 함.
		Point second = (Point) obj;
		if (x == second.x && y == second.y)
		{
			return true;
		}
		return false;
	}
	public String toString() {
		return "[" + x + "," + y + "]";
	}

}

class PointTest  // [extend Object] 쓰지 않아도 사용하하면 컴파일러 하고 있다. 단지 생략
{
	public static void main(String[] args) 
	{
		Point p = new Point(10,20);
		Point q = new Point(10,20);

		int x = (int)p.getX();
		int y = (int)p.getY();

		System.out.println(x + " " + y);
		System.out.println("p = " + p);
 

//-------------------------------------------------------------------------------------
// class사용하지 않고 equals 함수를 직접 코딩하지 않고 사용하는 경우 p와 q의 x,y값은 같아도 different 나온다.
// 이유는 : 레퍼렌스를 비교할 때 주소 값이 다르기 때문에 different가 나온 것이다. 

		if (p.equals(q) == true)
		{
			System.out.println("same");
		} else {
			System.out.println("different");
		}
//-------------------------------------------------------------------------------------
		System.out.println(p.getClass().getName());
	} 
}
