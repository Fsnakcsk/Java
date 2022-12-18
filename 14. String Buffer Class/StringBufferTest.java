class StringBufferTest
{
	public static void main(String[] args) 
	{
/*
	String을 사용하고 값을 자주 바꿀 상황이 생길 때

	1. String인 경우 : read only이기 때문에 값을 바꾸고 싶을 때 새로운 계속 String을 생성하고
	              과거 만은 String을 버리기 되는데 가삐지도 많이 쌓이게 되면서 처리 속도가 느려짐

	2. StringBuffer인 경우 : 한 개의 String을 무진장하게 많이 가공하고자 할 때 쓰임. (여러개 아님)
	                    read Only 아니기 때문에 값을 바꿀 때 새로운 String생성하지 않고 기존의 Stirng사용해
						마치 C언어의 String처럼 사용함.
				****	String보다 더 속도랑 메모리 절얄은 훨씬 더 뛰어남. ****

	3. String와 가장 큰 특징은 새로운 String생성하지 않기 때문에 StringBuffer는 setCharAt() 사용함
	   String는       setCharAt() 없고 getCharAt() 사용함.
	   StringBuffer는 getCharAt() 없고 setCharAt() 사용함.
*/
		StringBuffer sb = new StringBuffer("Hello world");
		System.out.println(sb);

		sb = sb.reverse(); // 역순으로 새로운 Byte생성하지않고 기존 Byte를 사용함
		sb = sb.reverse();
		
		System.out.print("["+sb.charAt(3)+"] --> ");
		sb.setCharAt(3,'x'); // **** i번째 위치의 문자는 'x'로 바꾼다.
		System.out.println("["+sb.charAt(3)+"]");
		System.out.println(sb);

	}
}
