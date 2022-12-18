//vesion 3  자료추상화 + 상속 + dynmic

import java.util.*;

abstract class Animal //abstract 함수가 포함되어 있으면 이 class는 abstract class가 되므로 추상클레스 앞에 abstract를 명시해야함.
{
	private String name;
	protected double weight;   // 몸무게
	Animal() {
		name = "";
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
	abstract void eat();      // 할일이 없다. 동적 바인딩 컴파일러 에러를 위한 함수
	abstract void urinate() ;
	void sleep() {
		System.out.println("zzz~~~~");
	};
	abstract void talk();
}

class Lion extends Animal
{
	private double meat;    // 고기

	Lion() {
		super();
		weight = 10.0;
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
		super.sleep();
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
		weight = 2.0;
		nCarrot = 0;
	}
	void eat() {
		int x = (int)(Math.random() * 100);
		x = (x % 2) + 1;
		nCarrot = nCarrot + x;
		eat(x*0.3);
	} 
	void urinate () {
		urinate(0.1);
	}
	void sleep() {
		super.sleep();
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
		weight = 4.0;
		nbanana = 0;
	}
	void eat() {
		int x = (int)(Math.random() * 100);
		x = (x % 3) + 1;
		nbanana = nbanana + x;
		eat(x*0.4);
	} 
	void urinate () {
		urinate(0.2);
	}
	void sleep() {
		super.sleep();
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
		ArrayList<Animal> animals = new ArrayList<Animal>();
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			Animal x;

			System.out.print("숫자를 입력하세요(1,2,3) : ");
			String s = scan.next();
			n = Integer.parseInt(s);

			if (n == 1)
			{
				x = new Lion();
				System.out.print("사자 이름은? ");
			} 
			else if (n == 2)
			{
				x = new Rabbit();
				System.out.print("토끼 이름은? ");
			} else {
				x = new Monkey();
				System.out.print("원숭이 이름은? ");
			}
			s = scan.next(); 
			x.setName(s);
			animals.add(x);
		}

		for (day = 0; day < 365; day++) {
			for(int i = 0; i  <5; i++) {
				Animal x = animals.get(i);
				// dynamic binding
				x.eat();
				x.sleep();
				x.urinate();
				x.talk();
			}
		}
		/*
		for (int i = 0; i < 5; i++) {
			System.out.println(animals.get(i)); // 저절로 dynmic binding
		*/
		
		// 컬랙션 객체 사용하는 for ich문
		for(Animal x : animals) {
			System.out.print(x);
		}
	}
}
