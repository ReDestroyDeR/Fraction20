
import java.lang.Math;

public class General
{
    public static void main(String[] args)
    {
        Fraction addA = getRandomF();
        Fraction addB = getRandomF();
        System.out.println(addA + "\n+");
        System.out.println(addB + "\n=");
        addA.add(addB);
        System.out.println(addA + "\n");

        Fraction subA = getRandomF();
        Fraction subB = getRandomF();
        System.out.println(subA + "\n-");
        System.out.println(subB + "\n=");
        subA.sub(subB);
        System.out.println(subA + "\n");

        Fraction mulA = getRandomF();
        Fraction mulB = getRandomF();
        System.out.println(mulA + "\n*");
        System.out.println(mulB + "\n=");
        mulA.multiply(mulB);
        System.out.println(mulA + "\n");

        Fraction divA = getRandomF();
        Fraction divB = getRandomF();
        System.out.println(divA + "\n/");
        System.out.println(divB + "\n=");
        divA.divide(divB);
        System.out.println(divA + "\n");

    }

    public static Fraction getRandomF() {
        int a = (int) (Math.random() * 100) + 1;
        int b = (int) (Math.random() * 100) + 1;
        if (a == 0 || b == 0) {
            return getRandomF();
        }
        if (a<b) {
            return new Fraction(a, b);
        } else {
            return new Fraction(b, a);
        }
    }
}

