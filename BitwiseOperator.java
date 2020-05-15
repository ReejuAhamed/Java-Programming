
public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 10, b = 12, c, d, e;
        c = a & b;
        d = a | b;
        e = a ^ b;

        System.out.println("Bitwise and = " + c);
        System.out.println("Bitwise or = " + d);
        System.out.println("Bitwise ex_or = " + e);
    }

}