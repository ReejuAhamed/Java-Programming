import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {

        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two number one by one:\n");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("a>b = " + (a > b));
        System.out.println("a<b = " + (a < b));

        System.out.println("a>=b = " + (a >= b));
        System.out.println("a<=b = " + (a <= b));

        System.out.println("a==b = " + (a == b));
        System.out.println("a!=b = " + (a != b));

    }

}