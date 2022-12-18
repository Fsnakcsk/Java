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
	double real() {      // 실수부
		return m_x;
	}
	double imaginary() { // 허수부
		return m_y;
	}
	double magnitude() { // 곱하기
		return Math.sqrt(m_x*m_x + m_y*m_y);
	}
	void set(ComplexNumber c) {  // 예 : a.set(b) --> b에 있는 값을 a에 copy하는 용도임.
		m_x = c.m_x; 
		m_y = c.m_y;
	}
	ComplexNumber add(ComplexNumber c) {
		return new ComplexNumber(m_x + c.m_x, m_y + c.m_y);
	}
	ComplexNumber subtract(ComplexNumber c) {
		return new ComplexNumber(m_x - c.m_x, m_y - c.m_y);
	}
	ComplexNumber multiply(ComplexNumber c) {
		double realPart      = m_x*c.m_x - m_y*c.m_y;
		double imaginaryPart = m_x*c.m_y + m_y*c.m_x;

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
