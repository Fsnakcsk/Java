class TestMatrixWithNames 
{
	public static void main(String[] args) 
	{
		int nProducts;

		System.out.print("��ǰ�� ������ ��� ? ");
		nProducts = Integer.parseInt(System.console().readLine());

		StringArray productNames = new StringArray(nProducts);

		System.out.println("��ǰ�� ��Ī�� �� �ּſ�:");

		productNames.readDataFromConsole();

		StringArray colNames = new StringArray(1);
		colNames.set(0,"�ܰ�");
		MatrixWithNames productPrices = new MatrixWithNames(nProducts,1,productNames,colNames,"����","�� ��");

		System.out.println("�� ��ǰ�� �ܰ��� �� �ּſ�:");

		productPrices.readDataFromConsole();

		int nClerks;

		System.out.print("�Ǹſ��� ��� ? ");
		nClerks = Integer.parseInt(System.console().readLine());

		StringArray clerkNames = new StringArray(nClerks);

		System.out.println("�Ǹſ��� ������ �� �ּſ�:");

		clerkNames.readDataFromConsole();

	//	MatrixWithNames salesData = new MatrixWithNames(nClerks,nProducts,clerkNames,productNames,"��"," �Ǹŷ���");
		MatrixWithNames salesData = new MatrixWithNames(nClerks,nProducts);
		salesData.setRowNames(clerkNames);
		salesData.setColumnNames(productNames);
		salesData.setUnitName("��");
		salesData.setQuestion(" �Ǹŷ���");

		System.out.println("�� �Ǹſ����� �Ǹ��� ��ǰ���� ������ �� �ּſ�:");

		salesData.readDataFromConsole();

		System.out.println("\n���ݱ��� ģ �����͸� Ȯ���� �帮�ڽ��ϴ�.");

		System.out.println("=== ��ǰ �ܰ� ===");
		System.out.print(productPrices);
		System.out.println("=================");

		System.out.println("=== �Ǹ� �ڷ� ===");
		System.out.print(salesData);
		System.out.println("=================");

		Matrix salesTotalPerClerk;

		salesTotalPerClerk = salesData.multiply(productPrices);

		System.out.println("=== ��� �ڷ� ===");
		System.out.print(salesTotalPerClerk);
		System.out.println("=================");

		StringArray summaryNames = new StringArray(1);
		summaryNames.set(0,"���Ǹž�");
		MatrixWithNames anotherSalesTotalPerClerk = new MatrixWithNames(salesTotalPerClerk,clerkNames,summaryNames,"����","��");

		System.out.println("=== ���� ��� ===");
		System.out.print(anotherSalesTotalPerClerk);
		System.out.println("=================");
	}
}
