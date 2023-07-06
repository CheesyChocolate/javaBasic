/** this program has a superclass Shape and a subclass Triangle
  * Shape class variables are width and height
  * Shape class contains two constructors, with and without parameters
  * in Shape class, the Set and Get methods are used to set and get the values of width and height
  * this values displayed by a method called show()
  * Triangle class inherits the variables and methods of Shape class
  * Triabgle class varibles apart from superclass varibles are three sides of a triangle
  * Triangle class contains one parameterized constructor
  * Traingle class has three functtion
  * 1. area() to calculate the area of a triangle
  * 2. perimeter() to calculate the perimeter of a triangle
  * 3. equilateral() to check if the triangle is equilateral or not
  */

import java.util.Scanner;

public class shapeMagic
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int width, height, side1, side2, side3;
		System.out.println("Enter the width of the shape");
		width = input.nextInt();
		System.out.println("Enter the height of the shape");
		height = input.nextInt();
		System.out.println("Enter the first side of the triangle");
		side1 = input.nextInt();
		System.out.println("Enter the second side of the triangle");
		side2 = input.nextInt();
		System.out.println("Enter the third side of the triangle");
		side3 = input.nextInt();
		Shape shape = new Shape(width, height);
		Triangle triangle = new Triangle(side1, side2, side3);
		shape.show();
		triangle.show();
		System.out.println("The area of the triangle is " + triangle.area());
		System.out.println("The perimeter of the triangle is " + triangle.perimeter());
		if(triangle.equilateral())
			System.out.println("The triangle is equilateral");
		else
			System.out.println("The triangle is not equilateral");
		input.close();
	}
}

// Path: Shape.java
class Shape
{
	private int width, height;
	public Shape()
	{
		width = 0;
		height = 0;
	}
	public Shape(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	public void setWidth(int width)
	{
		this.width = width;
	}
	public void setHeight(int height)
	{
		this.height = height;
	}
	public int getWidth()
	{
		return width;
	}
	public int getHeight()
	{
		return height;
	}
	public void show()
	{
		System.out.println("The width of the shape is " + width);
		System.out.println("The height of the shape is " + height);
	}
}

// Path: Triangle.java
class Triangle extends Shape
{
	private int side1, side2, side3, width, height;
	public Triangle(int side1, int side2, int side3, int width, int height)
	{
		super(width, height);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double area()
	{
		return width * height / 2;
	}
	public double perimeter()
	{
		return side1 + side2 + side3;
	}
	public boolean equilateral()
	{
		if(side1 == side2 && side2 == side3)
			return true;
		else
			return false;
	}
	public void show()
	{
		System.out.println("The first side of the triangle is " + side1);
		System.out.println("The second side of the triangle is " + side2);
		System.out.println("The third side of the triangle is " + side3);
	}
}
