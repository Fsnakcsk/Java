import java.util.*; 
// Scanner class�� ����Ϸ��� ��ø� �ؾ���.
// ��ġ C��� ���� inlcude�� ����� ����

class ScannerTest
{
	public static void main(String[] args) 
	{
		char c;
		int i;
		double f;
		String s;

		System.out.println("Type achar, an integer, a floating number and a String : ");

		Scanner scanner = new Scanner(System.in);

		s = scanner.next(); // �׳� next�� ���ڿ��� �������� ���̴�.
		c = s.charAt(0);    // ���ڿ������� ù ��° ���ڸ� ���� �Ͷ�(�� ���ڸ� �����´�.)

		i = scanner.nextInt(); // ���� int�� �ٲ� �ʿ���� �ٷ� int�� �Ѿ�´�.

		f = scanner.nextDouble();

		s = scanner.next();

		System.out.println("c = " + c);
		System.out.println("i = " + i);
		System.out.println("f = " + f);
		System.out.println("s = " + s);
	}
}
