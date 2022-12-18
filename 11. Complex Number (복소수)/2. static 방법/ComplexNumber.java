class ComplexNumber 
{
	private double m_x;
	private double m_y;

	ComplexNumber() {
		m_x = 0.0;
		m_y = 0.0;
	}
	ComplexNumber(double real, double imaginary) {
		m_x = real;
		m_y = imaginary;
	}
	double real() {      // �Ǽ���
		return m_x;
	}
	double imaginary() { // �����
		return m_y;
	}
	double magnitude() { // ���ϱ�
		return Math.sqrt(m_x*m_x + m_y*m_y);
	}
	void set(ComplexNumber c) {  // �� : a.set(b) --> b�� �ִ� ���� a�� copy�ϴ� �뵵��.
		m_x = c.m_x; 
		m_y = c.m_y;
	}
	static ComplexNumber add(ComplexNumber x, ComplexNumber y) {
		return new ComplexNumber(x.m_x + y.m_x, x.m_y + y.m_y);
	}
	static ComplexNumber subtract(ComplexNumber x, ComplexNumber y) {
		return new ComplexNumber(x.m_x - y.m_x, x.m_y - y.m_y);
	}
	static ComplexNumber multiply(ComplexNumber x, ComplexNumber y) {
		double realPart      = x.m_x*y.m_x - x.m_y*y.m_y;
		double imaginaryPart = x.m_x*y.m_y + x.m_y*y.m_x;

		return new ComplexNumber(realPart, imaginaryPart); 
	}
	public String toString() {
		String tmp = "";

		if (m_x >= 0)
			tmp = tmp + (float)m_x;
		else
			tmp = tmp + "(" + (float)m_x + ")";

		tmp = tmp + "+";

		if (m_y >= 0)
			tmp = tmp + (float)m_y + "i";
		else
			tmp = tmp + "(" + (float)m_y + ")i";

		return tmp;
	}
}
