class StringBufferTest
{
	public static void main(String[] args) 
	{
/*
	String�� ����ϰ� ���� ���� �ٲ� ��Ȳ�� ���� ��

	1. String�� ��� : read only�̱� ������ ���� �ٲٰ� ���� �� ���ο� ��� String�� �����ϰ�
	              ���� ���� String�� ������ �Ǵµ� �������� ���� ���̰� �Ǹ鼭 ó�� �ӵ��� ������

	2. StringBuffer�� ��� : �� ���� String�� �������ϰ� ���� �����ϰ��� �� �� ����. (������ �ƴ�)
	                    read Only �ƴϱ� ������ ���� �ٲ� �� ���ο� String�������� �ʰ� ������ Stirng�����
						��ġ C����� Stringó�� �����.
				****	String���� �� �ӵ��� �޸� ������ �ξ� �� �پ. ****

	3. String�� ���� ū Ư¡�� ���ο� String�������� �ʱ� ������ StringBuffer�� setCharAt() �����
	   String��       setCharAt() ���� getCharAt() �����.
	   StringBuffer�� getCharAt() ���� setCharAt() �����.
*/
		StringBuffer sb = new StringBuffer("Hello world");
		System.out.println(sb);

		sb = sb.reverse(); // �������� ���ο� Byte���������ʰ� ���� Byte�� �����
		sb = sb.reverse();
		
		System.out.print("["+sb.charAt(3)+"] --> ");
		sb.setCharAt(3,'x'); // **** i��° ��ġ�� ���ڴ� 'x'�� �ٲ۴�.
		System.out.println("["+sb.charAt(3)+"]");
		System.out.println(sb);

	}
}
