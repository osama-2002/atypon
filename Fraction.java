public class Fraction {
    private int numerator;
    private int denominator;

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction fraction) {
        return new Fraction(numerator * fraction.denominator + denominator * fraction.numerator, denominator * fraction.denominator);
    }

    public Fraction minus(Fraction fraction) {
        return new Fraction(numerator * fraction.denominator - denominator * fraction.numerator, denominator * fraction.denominator);
    }

    public void print() {
        System.out.println(numerator + " / " + denominator);
    }
}
