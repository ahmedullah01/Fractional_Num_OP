
public class Main {
    public static void main(String[] args) {
OPERATION P1 = new OPERATION(4,6);
OPERATION P2 = new OPERATION(5,7);

    ADDITION.addition(P1,P2);
SUBTRACT.subtract(P1,P2);
MULTIPLY.multiply(P1,P2);
DIVIDE.divide(P1,P2);
        System.out.println(P1.numerator);
        System.out.println(P1.denominator);
    }


}