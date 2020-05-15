import java.util.Scanner;

public class Exp25_Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j;
        /// Basic Square Pattern Printing
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        sc.close();
        System.out.println("The Pattern of value " + n + " is followed :");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("*  ");
            }
            System.out.print("\n");
        }
    }
}