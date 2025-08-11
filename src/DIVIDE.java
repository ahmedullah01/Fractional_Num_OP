public class DIVIDE {
    public static void divide(OPERATION other1 , OPERATION other2 ){
        int numerator = (other1.numerator* other2.denominator) ;
        int denominator = other1.denominator*other2.numerator;
        OPERATION.GCD(numerator , denominator);
    }
}
