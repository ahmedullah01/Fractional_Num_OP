public class OPERATION {
    int denominator;
    int numerator;

   OPERATION(int nu , int den){

       this.numerator = nu;
       this.denominator = den;
    }
    public static void GCD(int nu, int den) {
        int originalNu = nu;
        int originalDen = den;

        // Euclid's Algorithm
        while (den != 0) {
            int temp = den;
            den = nu % den;
            nu = temp;
        }

        int gcdValue = nu; // yeh actual gcd hai

        // fraction ko reduce karo
        originalNu /= gcdValue;
        originalDen /= gcdValue;

        System.out.println(originalNu + "/" + originalDen);


    }


public void setNum(int num){
    this.numerator = num;
}
    public void setDen(int num) {
        this.numerator = num;
    }
    public int getNum() {
        return  numerator;
    }

    public int getDen() {
        return  denominator;
    }

    @Override
    public  String toString() {
        return (numerator + "/" + denominator );
    }
}