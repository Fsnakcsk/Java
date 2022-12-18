class Point2D
{
	protected double _x; // 하위클레스만 쓸 스 있게 
	protected double _y;

	Point2D() {
		_x = _y = 0;
	}
	Point2D(double x, double y) {
		_x = x;
		_y = y;
	}
	void setX(double x) {
		_x = x;
	}
	void setY(double y) {
		_y = y;
	}
	double getX() { return _x; }
	double getY() { return _y; }

	Point2D add(Point2D p) {

		Point2D tmp = new Point2D();
		tmp._x = _x + p._x;
		tmp._y = _y + p._y;
		return tmp;
	}
	double magnitude() {
		return Math.sqrt(_x*_x + _y*_y);
	}
	void move(double dx, double dy) {
		_x += dx;
		_y += dy;
	}
	void move(double delta) {
		_x += delta;
		_y += delta;
	}
	public String toString() {
		return "[" + _x + "," + _y + "]";
	}
}
class Point3D extends Point2D // extends Point2D 쓴 순간부터 Point2D class의 있는 모두 내용은 이미 Point3D class 에 포함되어 있다.
{
	// 부모클레스: parent class / base class    / super class
	// 하위클레스: child class  / derived class / sub class

	private double _z;
	Point3D() {
		super();
		_z = 0;
	}
	Point3D(double x, double y, double z) {
		super(x,y);
		_z = z;
	}
	void setZ(double z) {
		_z = z;
	}
	double getZ() { return _z; }

	Point3D add(Point3D p) {
		Point3D tmp = new Point3D();
		tmp._x = _x + p._x;
		tmp._y = _y + p._y;
		tmp._z = _z + p._z;
		return tmp;
	}
	double magnitude() { // override 변경
		return Math.sqrt(_x*_x + _y*_y + _z*_z); 
	}
	void move(double dx, double dy, double dz) {
		super.move(dx,dy);
		_z += dz;
	}
	void move(double delta) {
		super.move(delta);
		_z += delta;
	}
	public String toString() {
		return "[" + _x + "," + _y + "," + _z + "]";
	}
}
class TestPoints
{
	public static void main(String[] args) 
	{
		Point3D p = new Point3D(10,20,30);
		Point3D q = new Point3D();
		Point3D r;

		q.setX(20); 
		q.setY(30);
		q.setZ(50);

		System.out.println(p.getX() + "," + p.getY() + "," + p.getZ());
		System.out.println(q);

		r = p.add(q);
		System.out.println(r);
		System.out.println("magnitude of r = " + r.magnitude());

		r.move(100,200);
		System.out.println(r);

		r.move(1000);
		System.out.println(r);

	}
}
