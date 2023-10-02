package lab2_Shape;

		import lab2_Shape.square;
		import lab2_Shape.triangle;
		import lab2_Shape.circle;

	public class main{
		    public static void main(String[] args) {
		        // Creating objects for each shape
		        square square = new square(5.0);
		        triangle triangle = new triangle(6.0, 4.0, 3.0, 4.0, 5.0);
		        circle circle = new circle(2.5);

		        // Calculating and printing the areas and parameters/circumference
		        System.out.println("Square Area: " + square.calculateArea());
		        System.out.println("Square Perimeter: " + square.calculatePerimeter());

		        System.out.println("Triangle Area: " + triangle.calculateArea());
		        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());

		        System.out.println("Circle Area: " + circle.calculateArea());
		        System.out.println("Circle Circumference: " + circle.calculateCircumference());
		    }
		}
