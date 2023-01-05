public class RectangleMain	{
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10, 20);
		System.out.println(r.calculateRectangleArea(r));
	}
}
class Rectangle {
    int width;
    int height;

    Rectangle()	{
    }

    public Rectangle(int width, int height) {
	this.width = width;
	this.height = height;
    }

    float calculateRectangleArea(Rectangle d) {
	    return d.width * d.height;
    }
}
