public class RationalMain {
    public static void main(String[] args) {
	Rational r1 = new Rational(1, 2);
	Rational r2 = new Rational(1, 3);
	Rational r3 = r1.add(r2);
	System.out.println(r3);
    }
}

class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
	this.numerator = numerator;
	this.denominator = denominator;
    }

    public Rational add(Rational r) {
	int newNumerator = this.numerator * r.denominator + this.denominator * r.numerator;
	int newDenominator = this.denominator * r.denominator;
	return new Rational(newNumerator, newDenominator);
    }

    public Rational Simplify(Rational r) {
	int newNumerator = this.numerator;
	int newDenominator = this.denominator;
	int gcd = 1;
	for (int i = 1; i <= newNumerator && i <= newDenominator; i++) {
	    if (newNumerator % i == 0 && newDenominator % i == 0) {
		gcd = i;
	    }
	}
    }

    public Rational multiply(Rational r1, Rational r2) {
	int newNumerator = r1.numerator * r2.numerator;
	int newDenominator = r1.denominator * r2.denominator;
	return new Rational(newNumerator, newDenominator);
    }

    public Rational divide(Rational r1, Rational r2) {
	int newNumerator = r1.numerator * r2.denominator;
	int newDenominator = r1.denominator * r2.numerator;
	return new Rational(newNumerator, newDenominator);
    }

    public Rational subtract(Rational r1, Rational r2) {
	int newNumerator = r1.numerator * r2.denominator - r1.denominator * r2.numerator;
	int newDenominator = r1.denominator * r2.denominator;
	return new Rational(newNumerator, newDenominator);
    }

    public Rational sum(Rational r1, Rational r2) {
	int newNumerator = r1.numerator * r2.denominator + r1.denominator * r2.numerator;
	int newDenominator = r1.denominator * r2.denominator;
	return new Rational(newNumerator, newDenominator);
    }


    public String toString() {
	return this.numerator + "/" + this.denominator;
    }
}
