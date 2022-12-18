//vesion 3  �ڷ��߻�ȭ + ��� + dynmic

import java.util.*;

abstract class Animal //abstract �Լ��� ���ԵǾ� ������ �� class�� abstract class�� �ǹǷ� �߻�Ŭ���� �տ� abstract�� ����ؾ���.
{
	private String name;
	protected double weight;   // ������
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
	abstract void eat();      // ������ ����. ���� ���ε� �����Ϸ� ������ ���� �Լ�
	abstract void urinate() ;
	void sleep() {
		System.out.println("zzz~~~~");
	};
	abstract void talk();
}

class Lion extends Animal
{
	private double meat;    // ���

	Lion() {
		super();
		weight = 10.0;
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
		super.sleep();
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
		ArrayList<Animal> animals = new ArrayList<Animal>();
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			Animal x;

			System.out.print("���ڸ� �Է��ϼ���(1,2,3) : ");
			String s = scan.next();
			n = Integer.parseInt(s);

			if (n == 1)
			{
				x = new Lion();
				System.out.print("���� �̸���? ");
			} 
			else if (n == 2)
			{
				x = new Rabbit();
				System.out.print("�䳢 �̸���? ");
			} else {
				x = new Monkey();
				System.out.print("������ �̸���? ");
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
			System.out.println(animals.get(i)); // ������ dynmic binding
		*/
		
		// �÷��� ��ü ����ϴ� for ich��
		for(Animal x : animals) {
			System.out.print(x);
		}
	}
}
