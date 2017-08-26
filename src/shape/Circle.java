package shape;

public class Circle extends Shape {
	private int radius;
	
	public Circle(int radius) {
		super("Cicrle");
		this.setRadius(radius);
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius * radius * Math.PI;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return radius * 2 * Math.PI;
	}
}
