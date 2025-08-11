public  class ADDITION{

    public static void addition(OPERATION other1 , OPERATION other2 ){
    int numerator = (other1.numerator* other2.denominator) + (other1.denominator*other2.numerator);
    int denominator = other1.denominator*other2.denominator;
    OPERATION.GCD(numerator , denominator);
    }

}
