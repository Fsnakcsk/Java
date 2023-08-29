//vesion 3  �ڷ��߻�ȭ + ���

import java.util.*;

class Animal
{/*
	protected String name;
	protected double weight; // ������
*/
	private String name;
	private double weight;   // ������
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
	private double meat;    // ���

	Lion() {
		super();
		meat = 0.0;
	}
	void eat() {
		double x = Math.random() * 10.0; // Math.random(); �ϰ� �Ǹ� �Ǽ��� ����. (0~1)���̿��� ������ �Ҽ����ڿ� 2�ڸ�����., ���� (int)�� �ٲٸ� 0�� ������ ������ ���� ���ϴ� ���̴�.
		meat = meat + x;
		eat(x);
	} 
	void urinate () {
		urinate(1.5);
	}
	void sleep() {
		System.out.println("�帣�� �帣��");
	}
	void talk() {
		System.out.println("���� ����");
	}
	public String toString() {
		String s = super.toString() + " meat" + meat + "\n";
		return s;
	}
}
class Rabbit extends Animal
{
	private int nCarrot;  // �ٳ���

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
		System.out.println("�� ��...");
	}
	void talk() {
		System.out.println("���� ±±");
	}
	public String toString() {
		String s = super.toString() + " nCarrot" + nCarrot + "\n";
		return s;
	}
}
class Monkey extends Animal
{
	private int nbanana;  // �ٳ���

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
		System.out.println("�帣�� ũ����");
	}
	void talk() {
		System.out.println("�в� ����");
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
			System.out.print("���ڸ� �Է��ϼ���(1,2,3) : ");
			String s = scan.next();
			n = Integer.parseInt(s);

			if (n == 1)
			{
				Lion l = new Lion();
				System.out.print("���� �̸���? ");
				s = scan.next();
				l.setName(s);
				animals[i] = l;
			}
			else if (n == 2)
			{
				Rabbit r = new Rabbit();
				System.out.print("�䳢 �̸���? ");
				s = scan.next();
				r.setName(s);
				animals[i] = r;
			} else {
				Monkey m = new Monkey();
				System.out.print("������ �̸���? ");
				s = scan.next();
				m.setName(s);
				animals[i] = m;
			}
		}

		for (day = 0; day < 365; day++) {
			for(int i = 0; i  <5; i++) {
				Object x = animals[i];
				// RTTI run time type identfication �ѱ� ���δ� : ����ð��߿� Type�� �ĺ��ϴ� time�̴�.
				if(x instanceof Lion)  // x instanceof xxx � Ŭ������ ���ϴ��� Ȯ���ϴ� ����, Lion��ü�� ���� �� �� �ִ�. �̷� ������ RTTI��� ��.
				{
					// ����Ŭ���� type�� ����Ŭ������ �ٲٴ� ������ down casting --> ������ RTTI�� �ϰ� down casting�� �ؾ���.
					Lion l = (Lion)x;   // Lion��ü�� �ٲ��ش�. 
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
			System.out.println(animals[i]); // ������ dynmic binding
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
