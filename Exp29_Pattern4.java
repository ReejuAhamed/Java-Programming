import java.util.Scanner;

public class Exp29_Pattern4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i, j;
        System.out.println("Enter a number:\t");
        n = input.nextInt();
        input.close();

        for (i = n; i > 0; i--) {
            for (j = n; j >= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}