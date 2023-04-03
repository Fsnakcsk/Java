/*
class Student {
	private String ms_name;
	private boolean mb_male;
	private boolean mb_rich;
	private boolean mb_tall;
	private boolean mb_cute;
	Student() {
		ms_name = "";
		mb_male = mb_rich = mb_tall = mb_cute = false;
	}
	Student(String s) {
		ms_name = s;
		mb_male = mb_rich = mb_tall = mb_cute = false;
	}
	Student(String s,boolean male,boolean rich,boolean tall,boolean cute) {
		ms_name = s;
		setMale(male);
		setRich(rich);
		setTall(tall);
		setCute(cute);
	}
	String getName() {
		return ms_name;
	}
	void setMale(boolean flag) {
		mb_male = flag;
	}
	void setRich(boolean flag) {
		mb_rich = flag;
	}
	void setTall(boolean flag) {
		mb_tall = flag;
	}
	void setCute(boolean flag) {
		mb_cute = flag;
	}
	boolean isMale() {
		return mb_male;
	}
	boolean isRich() {
		return mb_rich;
	}
	boolean isTall() {
		return mb_tall;
	}
	boolean isCute() {
		return mb_cute;
	}
	public String toString() {
		String tmp = "";
		tmp = tmp + ms_name + " is ";
		if (isMale()) tmp = tmp + "a boy and he is ";
		else tmp = tmp + "a girl and she is ";
		if (isRich()) tmp = tmp + "rich, ";
		else tmp = tmp + "poor, ";
		if (isTall()) tmp = tmp + "tall and ";
		else tmp = tmp + "short and ";
		if (isCute()) tmp = tmp + "cute.";
		else tmp = tmp + "ugly.";
		return tmp;
	}
	void readDataFromConsole() {
		String buffer = System.console().readLine();
		String[] data = buffer.split(" ");

		ms_name = data[0];

		if (data[1].equals("1")) setMale(true);
		else setMale(false); 
		if (data[2].equals("1")) setRich(true);
		else setRich(false); 
		if (data[3].equals("1")) setTall(true);
		else setTall(false); 
		if (data[4].equals("1")) setCute(true);
		else setCute(false); 
	}
}
*/

class Student {
	static int MALE_MASK = 1<<0;
	static int RICH_MASK = 1<<1;
	static int TALL_MASK = 1<<2;
	static int CUTE_MASK = 1<<3;
	private String ms_name;
	private int m_data;
	Student() {
		ms_name = "";
		m_data = 0;
	}
	Student(String s) {
		ms_name = s;
		m_data = 0;
	}
	Student(String s,boolean male,boolean rich,boolean tall,boolean cute) {
		ms_name = s;
		setMale(male);
		setRich(rich);
		setTall(tall);
		setCute(cute);
	}
	String getName() {
		return ms_name;
	}
	void setMale(boolean flag) {
		if (flag) m_data = m_data | MALE_MASK;
		else m_data = m_data & ~MALE_MASK;
	}
	void setRich(boolean flag) {
		if (flag) m_data = m_data | RICH_MASK;
		else m_data = m_data & ~RICH_MASK;
	}
	void setTall(boolean flag) {
		if (flag) m_data = m_data | TALL_MASK;
		else m_data = m_data & ~TALL_MASK;
	}
	void setCute(boolean flag) {
		if (flag) m_data = m_data | CUTE_MASK;
		else m_data = m_data & ~CUTE_MASK;
	}
	boolean isMale() {
		if ((m_data & MALE_MASK) != 0) return true;
		else return false;
	}
	boolean isRich() {
		if ((m_data & RICH_MASK) != 0) return true;
		else return false;
	}
	boolean isTall() {
		if ((m_data & TALL_MASK) != 0) return true;
		else return false;
	}
	boolean isCute() {
		if ((m_data & CUTE_MASK) != 0) return true;
		else return false;
	}
	public String toString() {
		String tmp = "";
		tmp = tmp + ms_name + " is ";
		if (isMale()) tmp = tmp + "a boy and he is ";
		else tmp = tmp + "a girl and she is ";
		if (isRich()) tmp = tmp + "rich, ";
		else tmp = tmp + "poor, ";
		if (isTall()) tmp = tmp + "tall and ";
		else tmp = tmp + "short and ";
		if (isCute()) tmp = tmp + "cute.";
		else tmp = tmp + "ugly.";
		return tmp;
	}
	void readDataFromConsole() {
		String buffer = System.console().readLine();
		String[] data = buffer.split(" ");

		ms_name = data[0];

		if (data[1].equals("1")) setMale(true);
		else setMale(false); 
		if (data[2].equals("1")) setRich(true);
		else setRich(false); 
		if (data[3].equals("1")) setTall(true);
		else setTall(false); 
		if (data[4].equals("1")) setCute(true);
		else setCute(false); 
	}
}

class BitwiseOperation 
{
	public static void main(String[] args) 
	{
		Student x = new Student("kim");
		Student y = new Student("lee",true,false,true,true);
		Student z = new Student("park",false,false,true,false);

		x.setRich(true);
		x.setCute(true);

		y.setMale(false);
		y.setRich(true);

		z.setTall(false);
		z.setCute(true);

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		Student st[] = new Student[5];

		System.out.println("Type information for 5 students as \"park 0 1 0 1\"");

		int i;
		for(i = 0; i < 5; i++) {
			st[i] = new Student();
			st[i].readDataFromConsole();
		}

		System.out.println("== favorite spouse candidates list =="); 
		for(i = 0; i < 5; i++) {
			if (st[i].isRich() && st[i].isCute()) {
				System.out.println(st[i].getName());
			}
		}
	}
}
