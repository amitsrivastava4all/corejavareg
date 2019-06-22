class Shape{
	void area() {
		System.out.println("Shape Area");
	}
	void peri() {
		System.out.println("Shape Peri");
	}
}
class Rect extends Shape{
	@Override
	void area() {
		System.out.println("Rect Area");
	}
}
class Circle extends Shape{
	@Override
	void area() {
		System.out.println("Circle Area");
	}
	void circum() {
		System.out.println("Circle Circum");
	}
}
class Square extends Shape{
	@Override
	void area() {
		System.out.println("Square Area");
	}
	void allSideEquals() {
		System.out.println("All Side Equals Square");
	}
}

class Drawing{
	void draw(Shape shape) {
		shape.area();
		shape.peri();
		if(shape instanceof Square) {
//			int w = 100;
//			long rrrr = w; // implicit
//			long r = 1000;
//			int tt = (int)r; // explicit
			Square sq = (Square) shape; // Downcasting
			sq.allSideEquals();
		}
		if(shape instanceof Circle) {
			((Circle)shape).circum();
		}
		System.out.println("**********************");
	}
}

public class ISADemo2 {

	public static void main(String[] args) {
		Drawing drawing = new Drawing();
		drawing.draw(new Square());
		drawing.draw(new Circle());
		drawing.draw(new Rect());
//		Shape shape = new Square(); // Upcasting
//		shape.area();
//		shape.peri();
//		//shape.allSideEquals();
//		shape = new Circle(); // Upcasting
//		shape.area();
//		shape.peri();
		//shape.circum();
		/*Square square = new Square();
		square.area();
		square.peri();
		square.allSideEquals();
		System.out.println("***************");
		Circle circle = new Circle();
		circle.area();
		circle.peri();
		circle.circum();
		System.out.println("******************");
		Rect rect = new Rect();
		rect.area();
		rect.peri();*/
		//square.
		// TODO Auto-generated method stub

	}

}
