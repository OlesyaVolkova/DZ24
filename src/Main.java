public class Main {
    public static void main(String[] args) {
        int numerator = 4;
        int denominator = 3;
        System.out.println("Числитель " + numerator + " & знаменатель " + denominator);

        Fraction fraction = new Fraction(numerator,denominator);
        System.out.println("Дробь = " + fraction);
    }
}
 class  Fraction {
       private int numerator;
       private int denominator;



     public Fraction(int numerator, int denominator) {
         this.numerator = numerator;
         this.denominator = denominator;

     }

     public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

     public String toString() {
         return numerator + "/" + denominator;
     }
   }

