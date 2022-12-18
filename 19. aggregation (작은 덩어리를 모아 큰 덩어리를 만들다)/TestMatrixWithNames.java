class TestMatrixWithNames 
{
	public static void main(String[] args) 
	{
		int nProducts;

		System.out.print("제품의 종류는 몇가지 ? ");
		nProducts = Integer.parseInt(System.console().readLine());

		StringArray productNames = new StringArray(nProducts);

		System.out.println("제품의 명칭을 쳐 주셔요:");

		productNames.readDataFromConsole();

		StringArray colNames = new StringArray(1);
		colNames.set(0,"단가");
		MatrixWithNames productPrices = new MatrixWithNames(nProducts,1,productNames,colNames,"만원","는 얼마");

		System.out.println("각 제품의 단가를 쳐 주셔요:");

		productPrices.readDataFromConsole();

		int nClerks;

		System.out.print("판매원은 몇분 ? ");
		nClerks = Integer.parseInt(System.console().readLine());

		StringArray clerkNames = new StringArray(nClerks);

		System.out.println("판매원들 성함을 쳐 주셔요:");

		clerkNames.readDataFromConsole();

	//	MatrixWithNames salesData = new MatrixWithNames(nClerks,nProducts,clerkNames,productNames,"개"," 판매량은");
		MatrixWithNames salesData = new MatrixWithNames(nClerks,nProducts);
		salesData.setRowNames(clerkNames);
		salesData.setColumnNames(productNames);
		salesData.setUnitName("개");
		salesData.setQuestion(" 판매량은");

		System.out.println("각 판매원들이 판매한 제품들의 수량을 쳐 주셔요:");

		salesData.readDataFromConsole();

		System.out.println("\n지금까지 친 데이터를 확인해 드리겠습니당.");

		System.out.println("=== 제품 단가 ===");
		System.out.print(productPrices);
		System.out.println("=================");

		System.out.println("=== 판매 자료 ===");
		System.out.print(salesData);
		System.out.println("=================");

		Matrix salesTotalPerClerk;

		salesTotalPerClerk = salesData.multiply(productPrices);

		System.out.println("=== 결과 자료 ===");
		System.out.print(salesTotalPerClerk);
		System.out.println("=================");

		StringArray summaryNames = new StringArray(1);
		summaryNames.set(0,"총판매액");
		MatrixWithNames anotherSalesTotalPerClerk = new MatrixWithNames(salesTotalPerClerk,clerkNames,summaryNames,"만원","얼마");

		System.out.println("=== 최종 결과 ===");
		System.out.print(anotherSalesTotalPerClerk);
		System.out.println("=================");
	}
}
