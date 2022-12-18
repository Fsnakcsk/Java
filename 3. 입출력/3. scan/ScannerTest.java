import java.util.*; 
// Scanner class를 사용하려면 명시를 해야함.
// 미치 C언어 중의 inlcude와 비슷한 역할

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

		s = scanner.next(); // 그냥 next는 문자열을 가져오는 것이다.
		c = s.charAt(0);    // 문자열에서의 첫 번째 문자를 갖고 와라(한 글자만 가져온다.)

		i = scanner.nextInt(); // 따로 int로 바꿀 필요없고 바로 int로 넘어온다.

		f = scanner.nextDouble();

		s = scanner.next();

		System.out.println("c = " + c);
		System.out.println("i = " + i);
		System.out.println("f = " + f);
		System.out.println("s = " + s);
	}
}
