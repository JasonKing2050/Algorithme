

public class Fraction implements Comparable< Fraction >{
    protected int num;
    protected int den;

    public Fraction(int num, int den) {
        if( num < 0 ) {
            this.num = -num;
            this.den = -den;
        } else {
            this.num = num;
            this.den = den;
        }
    }

    @Override
    public boolean equals( Object obj ) {
        boolean resultat = false;

        if( null != obj && obj instanceof Fraction ) {
            Fraction temp = (Fraction) obj;
            resultat = num * temp.den == den * temp.num;
        }

        return resultat;
    }

    @Override
    public int compareTo( Fraction f2 ) {
        return num * f2.den - f2.num * den;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "num=" + num +
                ", den=" + den +
                '}';
    }
}
