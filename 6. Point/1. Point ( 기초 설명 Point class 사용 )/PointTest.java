import java.awt.*;

class PointTest 
{
	public static void main(String[] args) 
	{
		Point p = new Point(10,20);
		Point q = new Point(20,30);

		int x = (int)p.getX();
		int y = (int)p.getY();

		System.out.println(x + " " + y);
		System.out.println(p);

		if (p.equals(q) == true)
		{
			System.out.println("same");
		} else {
			System.out.println("different");
		}
	}
}
