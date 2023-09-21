class Point // [extend Object] ���� �ʾƵ� ������ϸ� �����Ϸ� �ϰ� �ִ�. ���� ����
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
	// Object�� ����� �޾Ҵ�.
	public boolean equals(Object obj) {
		// for��������Ÿ�� Object�� ������ ������ Point�� �ٲٰ� ���� ���ؾ� ��.
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

class PointTest  // [extend Object] ���� �ʾƵ� ������ϸ� �����Ϸ� �ϰ� �ִ�. ���� ����
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
// class������� �ʰ� equals �Լ��� ���� �ڵ����� �ʰ� ����ϴ� ��� p�� q�� x,y���� ���Ƶ� different ���´�.
// ������ : ���۷����� ���� �� �ּ� ���� �ٸ��� ������ different�� ���� ���̴�. 

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
