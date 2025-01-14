public class Fraction {
    private int numerator;
    private int denominator;

    Fraction(int numerator, int denominator) {
        try {
            if(denominator == 0) throw new Exception("Division by zero");
            this.numerator = numerator;
            this.denominator = denominator;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Fraction plus(Fraction fraction) {
        return new Fraction(numerator * fraction.denominator + denominator * fraction.numerator, denominator * fraction.denominator);
    }

    public Fraction minus(Fraction fraction) {
        return new Fraction(numerator * fraction.denominator - denominator * fraction.numerator, denominator * fraction.denominator);
    }

    private int gcd(int n, int d) {
        if(d==0) return n;
        return gcd(d, n%d);
    }

    private void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    public void print() {
        simplify();
        System.out.println(numerator + " / " + denominator);
    }
}
