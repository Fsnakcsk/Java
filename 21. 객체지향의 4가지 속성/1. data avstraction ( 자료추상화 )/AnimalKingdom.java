//vesion 3  자료추상화 + 상속

import java.util.*;

class Animal
{/*
	protected String name;
	protected double weight; // 몸무게
*/
	private String name;
	private double weight;   // 몸무게
	Animal() {
		name = "";
		weight = 10.0;
	} 
	void setName(String s) {
		name = s;
	}
	double getWeright() {
		return weight; 
	}
	void eat(double x) {
		weight = weight + x;
	}
	void urinate (double x) {
		weight = weight - x;
	}
	public String toString() {
		String s = "name: " + name;
		s = s + " weight" + weight;
		return s;
	} 
}

class Lion extends Animal
{
	private double meat;    // 고기

	Lion() {
		super();
		meat = 0.0;
	}
	void eat() {
		double x = Math.random() * 10.0; // Math.random(); 하게 되면 실수로 나옴. (0~1)사이에서 나오고 소수점뒤에 2자리까지., 만약 (int)로 바꾸면 0만 나오기 떄문에 백을 곱하는 것이다.
		meat = meat + x;
		eat(x);
	} 
	void urinate () {
		urinate(1.5);
	}
	void sleep() {
		System.out.println("드르렁 드르렁");
	}
	void talk() {
		System.out.println("어흥 저흥");
	}
	public String toString() {
		String s = super.toString() + " meat" + meat + "\n";
		return s;
	}
}
class Rabbit extends Animal
{
	private int nCarrot;  // 바나나

	Rabbit() {
		super();
		nCarrot = 0;
	}
	void eat() {
		int x = (int)Math.random() * 100;
		x = (x % 2) + 1;
		nCarrot = nCarrot + x;
		eat(x*0.3);
	} 
	void urinate () {
		urinate(0.1);
	}
	void sleep() {
		System.out.println("쉿 쉿...");
	}
	void talk() {
		System.out.println("찍찍 짹짹");
	}
	public String toString() {
		String s = super.toString() + " nCarrot" + nCarrot + "\n";
		return s;
	}
}
class Monkey extends Animal
{
	private int nbanana;  // 바나나

	Monkey() {
		super();
		nbanana = 0;
	}
	void eat() {
		int x = (int)Math.random() * 100;
		x = (x % 3) + 1;
		nbanana = nbanana + x;
		eat(x*0.4);
	} 
	void urinate () {
		urinate(0.2);
	}
	void sleep() {
		System.out.println("드르렁 크르렁");
	}
	void talk() {
		System.out.println("꽥꽥 꺽꺽");
	}
	public String toString() {
		String s = super.toString() + " nbanana" + nbanana + "\n";
		return s;
	}
}

class AnimalKingdom 
{
	public static void main(String[] args) 
	{
		int n;
		int day;
		Object animals[] = new Object[5];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("숫자를 입력하세요(1,2,3) : ");
			String s = scan.next();
			n = Integer.parseInt(s);

			if (n == 1)
			{
				Lion l = new Lion();
				System.out.print("사자 이름은? ");
				s = scan.next();
				l.setName(s);
				animals[i] = l;
			}
			else if (n == 2)
			{
				Rabbit r = new Rabbit();
				System.out.print("토끼 이름은? ");
				s = scan.next();
				r.setName(s);
				animals[i] = r;
			} else {
				Monkey m = new Monkey();
				System.out.print("원숭이 이름은? ");
				s = scan.next();
				m.setName(s);
				animals[i] = m;
			}
		}

		for (day = 0; day < 365; day++) {
			for(int i = 0; i  <5; i++) {
				Object x = animals[i];
				// RTTI run time type identfication 한국 말로는 : 실행시간중에 Type을 식별하는 time이다.
				if(x instanceof Lion)  // x instanceof xxx 어떤 클레스에 속하느냐 확인하는 연산, Lion객체냐 뭐냐 알 수 있다. 이런 행위는 RTTI라고 함.
				{
					// 상위클레스 type을 하위클레스로 바꾸는 행위는 down casting --> 무조근 RTTI를 하고 down casting을 해야함.
					Lion l = (Lion)x;   // Lion객체로 바꿔준다. 
					l.eat();
					l.sleep();
					l.urinate();
					l.talk();
				} else if (x instanceof Rabbit)
				{
					Rabbit r = (Rabbit)x;
					r.eat();
					r.sleep();
					r.urinate();
					r.talk();
				}
				else if (x instanceof Monkey)
				{
					Monkey m = (Monkey)x;
					m.eat();
					m.sleep();
					m.urinate();
					m.talk();
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(animals[i]); // 저절로 dynmic binding
		}

		/* vesion 1
		Lion l = new Lion();

		l.eat();
		l.sleep();
		l.urinate();
		l.talk();
		System.out.println(l);


		Rabbit r = new Rabbit();

		r.eat();
		r.sleep();
		r.urinate();
		r.talk();
		System.out.println(r);

		Monkey m = new Monkey();

		m.eat();
		m.sleep();
		m.urinate();
		m.talk();
		System.out.println(m);
		*/
	}
}
