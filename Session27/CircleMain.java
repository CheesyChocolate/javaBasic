public class CircleMain	{
	public static void main(String[] args)	{
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(5);

		double area1 = circle1.calculateArea(2);
		double perimeter1 = circle1.calculatePerimeter(2);

		area1 = circle2.calculateArea();
		perimeter1 = circle2.calculatePerimeter();
	}
}

class Circle	{
	//instance variables
	int radius;

	Circle()	{
		radius = 0;
	}
	Circle(int radius)	{
		this.radius = radius;
	}

	public double calculateArea(int radius)	{
		return 3.14 * radius * radius;
	}
	public double calculateArea()	{
		return 3.14 * this.radius * this.radius;
	}

	public double calculatePerimeter(int radius)	{
		return 2 * 3.14 * radius;
	}
	public double calculatePerimeter()	{
		return 2 * 3.14 * this.radius;
	}
}
