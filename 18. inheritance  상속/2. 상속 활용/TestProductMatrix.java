class TestProductMatrix 
{
	public static void main(String[] args) 
	{
		int m;
		int n = 3; // 사원별 냉장고, 에어콘, 선풍기 판매수량 
		int i;

		System.out.println("메트릭스 한번 사용해 봅세!!!");
		System.out.print("사원 수는 몇명인고? ");
		m = Integer.parseInt(System.console().readLine());
		System.out.println("각 사원들의 매출 수를 입력해주소.");

		ProductMatrix A = new ProductMatrix(m,n);// 2x3

		A.readDataFromConsole();
		System.out.println("\n요렇게 팔았단 말이지!\n" + A);

		Matrix B = new Matrix(n,1); //3x1

		B.set(0,0,100); // 냉장고 가격 100 만원
		B.set(1,0,50); // 에어콘 가격 50 만원
		B.set(2,0,10); // 선풍기 가격 10 만원
		
		Matrix C;

		C = A.multiply(B);
		System.out.println("그렇다면 ...");
		for(i = 0; i < C.row(); i++) {
			System.out.print((i+1) + "번 사원은 ");
			System.out.println((int)C.get(i,0) + "만원 어치 파셨구만.");
		}
	}
}
