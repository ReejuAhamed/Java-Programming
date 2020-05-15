import java.util.Scanner;

public class Exp17_ForLoop1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper limit:\t");
        n = sc.nextInt();
        sc.close();
        System.out.println("\nIncrementing by 1");
        System.out.println("The numbers are:\n");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "   "); /// Start = 1, end =n, Incrementing by 1
        }
        System.out.println("\nIncrementing by 2");
        for (int i = 1; i <= n; i = i + 2) {/// i=i+2 ===> i+=2;
            System.out.print(i + "   "); /// Start = 1, end =n, Incrementing by 2
        }

        System.out.println("\nPreDecrementing by 1");
        for (int i = n; i >= 1; --i) {/// i=i+2 ===> i+=2;
            System.out.print(i + "   "); /// Start = 1, end =n, Incrementing by 2
        }

        System.out.println("\nPostDecrementing by 1");
        for (int i = n; i >= 1; i--) {/// i=i+2 ===> i+=2;
            System.out.print(i + "   "); /// Start = 1, end =n, Incrementing by 2
        }
    }

}