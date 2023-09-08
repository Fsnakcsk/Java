class StringTest 
{
	public static void main(String[] args) 
	{
		String x = "kim";
		String y = new String("lee"); // 위 문장와 같다. 이렇게 길게 하지 않아도 된다.
		String z;
		String a = "song";
		String b = "Song";
		int i;

		z = x + y;  // 문자열 길이 어싸이먼트로 간단하게 연결 가틍
		System.out.println("1 "+ z);

		z = z + 123; // int 더하기 한다 해도 123는 문자열로 취급해 연결한다. (새로운 객체로, 까비지 생성)
		System.out.println("2 "+ z);
//----------------------------------------------------------------------------------
// charAt() i번째 의 위치 값을 보여준다.
		System.out.println(z.charAt(3)); //

//----------------------------------------------------------------------------------
// compareTo() 어떤 문자열이 큰가 작은가를 비교 ---> 아스크 코드비교 x-y는 양수이면 x가 크고 음수이면 y가 더 크다. 

		if (x.compareTo(y) > 0) 
		{
			System.out.println("3 compareTo = "+ x);
		} else if (x.compareTo(y) < 0) 
		{
			System.out.println("3 compareTo = "+ y);
		} else 
		{
			System.out.println("3 compareTo = same");
		}

//----------------------------------------
// 큰 소문자 구분. x에 있는 "kim"는 "Kim"보다 크기 때문에 kim이 나옴.

		if (x.compareTo("Kim") > 0) 
		{
			System.out.println("4 compareTo = "+ x);
		} else if (x.compareTo("Kim") < 0) 
		{
			System.out.println("4 compareTo = "+ y);
		} else 
		{
			System.out.println("4 compareTo = same");
		}

//----------------------------------------------------------------------------------
// compareToIgnoreCase() 대문자이냐 소문자이냐 구분하지 않고 비교하기 "kim"과 "Kim"이 same이 나옴.

		if (x.compareToIgnoreCase("kim") > 0) 
		{
			System.out.println("5 compareToIgnoreCase = "+ x);
		} else if (x.compareToIgnoreCase("Kim") < 0) 
		{
			System.out.println("5 compareToIgnoreCase = "+ y);
		} else 
		{
			System.out.println("5 compareToIgnoreCase = same");
		}

//----------------------------------------------------------------------------------
// x.contains() 어떤 문자열은 문자열에 포함이 되어 있는가 확인하기. *** ()안쪽은 문자일 "a" 해야됨 'a'는 안됨.

		if (x.contains("a")) 
		{
			System.out.println("6 contains = YES");
		} else 
		{
			System.out.println("6 contains = NO");
		}

//----------------------------------------------------------------------------------
// endsWith() 어떤 문자열의 끝에 특정문자열라 끝나는지를 체크한 함수 --> .java로 끝나는 건지 학인하기
// startsWith() 어떤 문자열로 시작하고 있는지 학인 하기.

		x = "test.java";
		
		if (x.endsWith(".java"))
		{
			System.out.println("7 endsWith = YES java file");
		} else 
		{
			System.out.println("7 endsWith = NO");
		}


//----------------------------------------------------------------------------------
// equals() 같은지 비교. 대소문자 구분
		
		if (a == b)
		{
			System.out.println("8 equals = YES");
		}
		else
		{
			System.out.println("8 equals = NO");
		}

		if (a.equals("song"))
		{
			System.out.println("8 equals = YES");
		}
		else
		{
			System.out.println("8 equals = NO");
		}
//-----------------------------------------------
// equalsIgnoreCase() 대소문자 구분하지 않음

		if (a.equalsIgnoreCase("song"))
		{
			System.out.println("9 equals = YES");
		}
		else
		{
			System.out.println("9 equals = NO");
		}


//----------------------------------------------------------------------------------
// format()   %10d 10칸을 찍고 --> \n 줄마꿈 --> %20.2f 20칸에다가 소수점 이하는 2짜리만 찍어라 

		int u = 123;
		double n = 23.82734;
//										%d      %2f
		String result = String.format("10 = %10d\n%20.2f",u,n);
		System.out.println(result);

//----------------------------------------------------------------------------------
// byte[] getBytes()  String를 문자열객체를 byte array로 표현해서 referense를 돌려줌.
	

//----------------------------------------------------------------------------------
// void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin

//----------------------------------------------------------------------------------
// int hashCode()

//----------------------------------------------------------------------------------
// isEmpty() == 0 어떤 String이 비어 있는냐 없는냐

//----------------------------------------------------------------------------------
// indexOf() 문자의 위리를 알려줌. 중복되는 것 있어도 멘 앞에것만 알려줌.

	String ooo = "%1234%6789%";
	i = ooo.indexOf('%');
	System.out.println("11 indexOf = " + i);

//---------------------------
// lastIndexOf(int xx) 중복되는 것 중에서 멘 뒤의 것 위치를 알려줌.

	i = ooo.lastIndexOf('%');
	System.out.println("12 lastIndexOf = " + i);

//---------------------------
// lastIndexOf(int 문자, int fromIndex위치)
// 지정한 위치에서 앞에까지 순서로 먼저 찾은 문자의 위치를 알려줌.

	i = ooo.lastIndexOf('%',8);
	System.out.println("13 lastIndexOf = " + i);

//---------------------------
// lastIndexOf(String, fromIndex) String단위로 지정한 위치에서 앞으로 찾기.

	i = ooo.lastIndexOf("4%",9);
	System.out.println("14 lastIndexOf = " + i);

//----------------------------------------------------------------------------------
// boolean matches()

//----------------------------------------------------------------------------------
// String replace(char xx, char new xx) 문지열중의 어떤문자를 새로운 문자로 바꿔줌.
// 기준의 문자열에서 바꾼게 아니라 새로운 문자열을 만들고 가리키게 됨.

	a = a.replace('s','k'); 
	System.out.println("15 replace = " + a);

//----------------------------------------------------------------------------------
// split 문자열을 잘라준다.

	x = "hello world mr. kim";
	String s[] = x.split(" ");
	System.out.println("16 split = " + s[0]);


//----------------------------------------------------------------------------------
// substring() 문자열 중에 어디부터 어디까지 따로 빼고 알려줌,  **** (1,4)인 경우 1~3만 찍혀나옴 4는 포함되지 않음.

	y = ooo.substring(1,4);
	System.out.println("17 substring = " + y);

//----------------------------------------------------------------------------------
/* toCharArray() char array로 바꿔 줌.
   toUpperCase() 문자열을 대문자로 바꿔줌.
   toLowerCase() 문자열을 싹다 소문자로 바꿔 줌. (새로운 것 생성)
   toLowerCase() 나라 명시
//----------------------------------------------------------------------------------
// trim() 앞뒤의 공백을 제거

//----------------------------------------------------------------------------------
*/
	}
}