import java.util.Scanner;

public class Exp26_Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j;
        /// Basic Triangle Pattern Printing
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        sc.close();
        System.out.println("The Pattern of value " + n + " is followed :");
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
