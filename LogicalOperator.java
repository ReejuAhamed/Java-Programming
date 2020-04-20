import javax.lang.model.util.ElementScanner6;

/**
 * LogicalOperator
 */
public class LogicalOperator {
    public static void main(String[] args) {
        int a = 10, b = 12, c = 5;
        if (a > b && a > c) {
            System.out.println("Greater number is a = " + a);
        } else if (b > a && b > c) {
            System.out.println("Greater number is a = " + b);
        } else {
            System.out.println("Greater number is a = " + c);
        }
    }
}