class TestProductMatrix 
{
	public static void main(String[] args) 
	{
		int m;
		int n = 3; // ����� �����, ������, ��ǳ�� �Ǹż��� 
		int i;

		System.out.println("��Ʈ���� �ѹ� ����� ����!!!");
		System.out.print("��� ���� ����ΰ�? ");
		m = Integer.parseInt(System.console().readLine());
		System.out.println("�� ������� ���� ���� �Է����ּ�.");

		ProductMatrix A = new ProductMatrix(m,n);// 2x3

		A.readDataFromConsole();
		System.out.println("\n�䷸�� �ȾҴ� ������!\n" + A);

		Matrix B = new Matrix(n,1); //3x1

		B.set(0,0,100); // ����� ���� 100 ����
		B.set(1,0,50); // ������ ���� 50 ����
		B.set(2,0,10); // ��ǳ�� ���� 10 ����
		
		Matrix C;

		C = A.multiply(B);
		System.out.println("�׷��ٸ� ...");
		for(i = 0; i < C.row(); i++) {
			System.out.print((i+1) + "�� ����� ");
			System.out.println((int)C.get(i,0) + "���� ��ġ �ļ̱���.");
		}
	}
}
