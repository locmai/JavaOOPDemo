package shape;
import java.awt.Color;

public abstract class Shape {
	private Color color;
	private String name;
	
	public Shape(String name) {
		this.name = name;
		color = Color.BLACK;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
}
