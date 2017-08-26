/**
 * 
 */
package shape;

/**
 * @author locmai
 * 
 *
 */
public class TestShape {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s =  new Square(4);
		System.out.println("Name (from Shape): " + s.getName());
		System.out.println("Area: " + s.getArea());
		System.out.println("Perimeter: " + s.getPerimeter());
		System.out.println("Color: " + s.getColor().toString());
		System.out.println("Class: " + s.getClass());
		//Shape has no getWidth method.
		
		Square v =  new Square(4);
		System.out.println("Width: " + v.getWidth());
		
	}

}
