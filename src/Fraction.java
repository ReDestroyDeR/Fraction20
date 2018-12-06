//Класс «Натуральная дробь»
public class Fraction {
    int numerator; // Числитель
    int denominator; // Знаменатель

    public Fraction(int num, int denom) {
        numerator = num;
        denominator = denom;
    }

    public void add(Fraction x) {
        int localnumerator = x.numerator;
        if (denominator != x.denominator) {
            localnumerator *= denominator;
            denominator *= x.denominator;
            numerator *= x.denominator;
        }
        numerator += localnumerator;
    }

    public void sub(Fraction x) {
        int localnumerator = x.numerator;
        if (denominator != x.denominator) {
            localnumerator *= denominator;
            denominator *= x.denominator;
            numerator *= x.denominator;
        }
        numerator -= localnumerator;
    }

    public void multiply(Fraction x) {
        denominator *= x.denominator;
        numerator *= x.numerator;
    }

    public void divide(Fraction x) {
        denominator *= x.numerator;
        numerator *= x.denominator;
    }

    @Override
    public String toString() {
        if (denominator < 0) {
            denominator = Math.abs(denominator);
            if (numerator > 0) {
                numerator *= -1;
            }
        }

        return numerator + "/" + denominator;
    }
}
