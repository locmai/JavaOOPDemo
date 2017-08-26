package shape;

public class Square extends Shape {
	private int width;
	public Square(int width) {
		super("Square");
		this.width = width;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*width;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return width*4;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
