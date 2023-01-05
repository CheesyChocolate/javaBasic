public class ComplexMain {
    public static void main(String[] args) {
	Complex c1 = new Complex(1, 2);
	Complex c2 = new Complex(3, 4);
	Complex c3 = c1.add(c2);
	System.out.println(c3);
    }
}

class complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
	this.real = real;
	this.imaginary = imaginary;
    }

    public Complex add(Complex c) {
	return new Complex(this.real + c.real, this.imaginary + c.imaginary);
    }

    public String toString() {
	return this.real + " + " + this.imaginary + "i";
    }

    Complex complexMultiply(Complex z1, Complex z2) {
	double real = z1.real * z2.real - z1.imaginary * z2.imaginary;
	double imaginary = z1.real * z2.imaginary + z1.imaginary * z2.real;
	return new Complex(real, imaginary);
    }
}
