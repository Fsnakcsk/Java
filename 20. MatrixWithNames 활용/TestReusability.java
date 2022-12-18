class TestReusability 
{
	public static void main(String[] args) 
	{
		int nLectures;

		System.out.print("������ ���� ? ");
		nLectures = Integer.parseInt(System.console().readLine());

		StringArray lectureNames = new StringArray(nLectures);

		System.out.println("������ ���� �� �ּſ�:");

		lectureNames.readDataFromConsole();

		StringArray colNames = new StringArray(1);
		colNames.set(0,"����");
		MatrixWithNames lectureUnits = new MatrixWithNames(nLectures,1,lectureNames,colNames,"����","�� ������¥��");

		System.out.println("�� ������ ������ �� �ּſ�:");

		lectureUnits.readDataFromConsole();

		int nStudents;

		System.out.print("�л��� ��� ? ");
		nStudents = Integer.parseInt(System.console().readLine());

		StringArray studentNames = new StringArray(nStudents);

		System.out.println("�л����� �̸��� �� �ּſ�:");

		studentNames.readDataFromConsole();

	//	MatrixWithNames gradeData = new MatrixWithNames(nStudents,nLectures,studentNames,lectureNames,"��"," ���������");
		MatrixWithNames gradeData = new MatrixWithNames(nStudents,nLectures);
		gradeData.setRowNames(studentNames);
		gradeData.setColumnNames(lectureNames);
		gradeData.setUnitName("��");
		gradeData.setQuestion(" ���������");

		System.out.println("�� �л����� ����� ������ �� �ּſ�:");

		gradeData.readDataFromConsole();

		System.out.println("\n���ݱ��� ģ �����͸� Ȯ���� �帮�ڽ��ϴ�.");

		System.out.println("=== ���� ���� ===");
		System.out.print(lectureUnits);
		System.out.println("=================");

		System.out.println("=== �л��� ��� ���� ===");
		gradeData.setPrecision(2);
		System.out.print(gradeData);
		System.out.println("========================");

		Matrix gradeTotalPerStudent = new Matrix();

		gradeTotalPerStudent = gradeData.multiply(lectureUnits);

		gradeTotalPerStudent.setPrecision(2);
		System.out.println("=== ��� �ڷ� ===");
		System.out.print(gradeTotalPerStudent);
		System.out.println("=================");

		double unitsTotal = 0.0;

		for(int i = 0; i < lectureUnits.row(); i++) {
			unitsTotal = unitsTotal + lectureUnits.get(i,0);
		}

		gradeTotalPerStudent = gradeTotalPerStudent.multiply(1.0/unitsTotal);

		StringArray summaryNames = new StringArray(1);
		summaryNames.set(0,"�������");
		MatrixWithNames anotherGradeTotalPerStudent = new MatrixWithNames(gradeTotalPerStudent,studentNames,summaryNames,"��"," ���������");
		
		anotherGradeTotalPerStudent.setPrecision(4);

		System.out.println("=== ���κ� ��� ���� ===");
		System.out.print(anotherGradeTotalPerStudent);
		System.out.println("========================");
	}
}
