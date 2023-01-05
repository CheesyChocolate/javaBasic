import java.util.Scanner;

public class priceCalc {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the weight of the shipment : ");
	double weight = scan.nextDouble();
	System.out.print("Enter the length in centimeter : ");
	double length = scan.nextDouble();
	System.out.print("Enter the height in centimeter: ");
	double height = scan.nextDouble();
	System.out.print("Enter the width in centimeter: ");
	double width = scan.nextDouble();

	double volume = (length * width * height / 1000); // volume in decimeters
	System.out.println("the Volume of the shipment is : " + volume);

	double Weightbased = Math.max(weight, volume);
	double price = 0;
	System.out.print("What is the shipment distance in kilometer: ");
	double distance = scan.nextDouble();

	if (distance < 200 )	{
	    price = Weightbased * 6;
	}
	else if (distance <= 201 && distance <= 601) 	{
	    price = Weightbased * 8;
	}
	else if (distance <= 601 && distance <= 1000 )	{
	    price = Weightbased * 10;
	}
	else if (distance > 1000)	{
	    price = Weightbased * 12;
	}
	System.out.println("The price of the shipment is : " + price);
	scan.close();
    }
}
