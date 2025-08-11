public class MULTIPLY {
    public static void multiply(OPERATION other1 , OPERATION other2 ){
        int numerator =  other1.numerator*other2.numerator;
        int denominator = other1.denominator*other2.denominator;
        OPERATION.GCD(numerator , denominator);
    }
}
