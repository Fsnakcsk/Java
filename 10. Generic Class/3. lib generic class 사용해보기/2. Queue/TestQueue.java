import java.util.*;

class TestQueue 
{
	public static void main(String[] args) 
	{
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();

		q.add(10);
		q.add(20);
		q.add(30);
		q.remove();
		q.add(40);
		q.add(50);
		q.remove();

		int x = q.remove();
		System.out.println(x);
		System.out.println(q);

	}
}
