class TestReusability 
{
	public static void main(String[] args) 
	{
		int nLectures;

		System.out.print("교과목 수는 ? ");
		nLectures = Integer.parseInt(System.console().readLine());

		StringArray lectureNames = new StringArray(nLectures);

		System.out.println("교과목 명을 쳐 주셔요:");

		lectureNames.readDataFromConsole();

		StringArray colNames = new StringArray(1);
		colNames.set(0,"학점");
		MatrixWithNames lectureUnits = new MatrixWithNames(nLectures,1,lectureNames,colNames,"학점","은 몇학점짜리");

		System.out.println("각 과목의 학점을 쳐 주셔요:");

		lectureUnits.readDataFromConsole();

		int nStudents;

		System.out.print("학생은 몇명 ? ");
		nStudents = Integer.parseInt(System.console().readLine());

		StringArray studentNames = new StringArray(nStudents);

		System.out.println("학생들의 이름을 쳐 주셔요:");

		studentNames.readDataFromConsole();

	//	MatrixWithNames gradeData = new MatrixWithNames(nStudents,nLectures,studentNames,lectureNames,"점"," 취득학점은");
		MatrixWithNames gradeData = new MatrixWithNames(nStudents,nLectures);
		gradeData.setRowNames(studentNames);
		gradeData.setColumnNames(lectureNames);
		gradeData.setUnitName("점");
		gradeData.setQuestion(" 취득학점은");

		System.out.println("각 학생들이 취득한 학점을 쳐 주셔요:");

		gradeData.readDataFromConsole();

		System.out.println("\n지금까지 친 데이터를 확인해 드리겠습니당.");

		System.out.println("=== 과목별 학점 ===");
		System.out.print(lectureUnits);
		System.out.println("=================");

		System.out.println("=== 학생별 취득 학점 ===");
		gradeData.setPrecision(2);
		System.out.print(gradeData);
		System.out.println("========================");

		Matrix gradeTotalPerStudent = new Matrix();

		gradeTotalPerStudent = gradeData.multiply(lectureUnits);

		gradeTotalPerStudent.setPrecision(2);
		System.out.println("=== 결과 자료 ===");
		System.out.print(gradeTotalPerStudent);
		System.out.println("=================");

		double unitsTotal = 0.0;

		for(int i = 0; i < lectureUnits.row(); i++) {
			unitsTotal = unitsTotal + lectureUnits.get(i,0);
		}

		gradeTotalPerStudent = gradeTotalPerStudent.multiply(1.0/unitsTotal);

		StringArray summaryNames = new StringArray(1);
		summaryNames.set(0,"평점평균");
		MatrixWithNames anotherGradeTotalPerStudent = new MatrixWithNames(gradeTotalPerStudent,studentNames,summaryNames,"점"," 취득학점은");
		
		anotherGradeTotalPerStudent.setPrecision(4);

		System.out.println("=== 개인별 평균 점수 ===");
		System.out.print(anotherGradeTotalPerStudent);
		System.out.println("========================");
	}
}
